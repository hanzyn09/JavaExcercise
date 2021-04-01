package com.hanzyn.section01.excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//기능을 구현하기 위한 클래스
public class MemberDAO {
	//데이터베이스 접속 객체
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	//데이터베이스 접속
	/*생성자로, 이 클래스의 객체를 생성할 떄 DB 접속정보로 Connection 객체를 생성하도록 했다.*/
	public MemberDAO() {
		try {
			//MariaDB 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			//데이터베이스 접속
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/javadb", //host
					"root", //사용자
					"java1234" //암호
					);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//데이터 입력
	public int insert(MemberVO vo) {
		int result = 0;
		try {
			String sql = "INSERT INTO member (memberno, id, name)"
					+ "VALUES (" + vo.getMemberno() + ", '" + vo.getId() + "', '" + vo.getName() + "')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql); //executeUpdate() : INSERT, UPDATE, DELETE문을 실행하는 메서드. 리턴값이 int형으로 처리된 레코드 수 반환.
 		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	//데이터 조회
	public MemberVO selectOne(int memberno) {
		com.hanzyn.section01.excercise.MemberVO vo = new MemberVO();
		try {
			String sql = "SELECT * FROM member WHERE memberno=" + memberno;
			stmt = conn.createStatement();
			rs =stmt.executeQuery(sql); //executeQuery() : SELECT 문 실행 메서드
			
			if(rs.next()) { //데이터가 존재하면
				vo.setMemberno(rs.getInt("memberno"));
				vo.setId("id");
				vo.setName("name");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return vo;
	}
	
	//데이터 수정
	public int update(MemberVO vo) {
		int result = 0;
		try {
			String sql = "UPDATE member SET id= '"
					+ vo.getId() +"', name='" + vo.getName() +"' "
					+ "WHERE memberno=" + vo.getMemberno();
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	//데이터 삭제
	public int delete(int memberno) {
		int result = 0;
		try {
			String sql = "DELETE FROM member WHERE memberno=" + memberno;
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	//회원 목록
	public List<MemberVO> list(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			String sql = "SELECT * FROM member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setMemberno(rs.getInt("memberno"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	
	//자원 close()
	public void close() {
		if(conn != null) {
			try { conn.close(); } catch (SQLException e) {}
		}
		if(stmt != null) {
			try { stmt.close(); } catch (SQLException e) {}
		}
		if(rs != null) {
			try { rs.close(); } catch (SQLException e) {}
		}
	}
}
