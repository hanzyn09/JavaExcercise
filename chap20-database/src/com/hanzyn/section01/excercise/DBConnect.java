package com.hanzyn.section01.excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static void main(String[] args) {
		
		//데이터베이스 접속 객체
		Connection conn = null;
		
		try {
			//mariaDB 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			//데이터베이스 접속
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/javadb",//host
					"root",//사용자
					"java1234");//암호
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) System.out.println("데이터베이스 접속");
		}
	}
}
