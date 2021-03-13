package com.hanzyn.section04.vo;

import java.util.Date;

public class UserVO {
	
	// 일반적으로 VO(Value Object)목적으로 설계된 클래스는 명사 뒤에 VO를 붙인다.
	// UserVO, MemberVO, BoardVO...
	
	
	/*
	 * 자바빈(Java Bean)
	 * JSP에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스
	 * 
	 * 자바빈 작성 규칙
	 * 1. 자바진은 특정 패키지에 속해있어야 한다.(defalut 패키지 사용 금지)
	 * 2. 멤버변수의 접근제어자는 private으로 선언해야 한다.
	 * 3. 기본생성자가 명시적으로 존재해야 한다.(매개변수있는생성자는 선택사항)
	 * 4. 멤버변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 한다.
	 * 5. 직렬화(Serializable 구현)가 되어야 한다.(선택사항)
	 * */
	
	/* 모든 필드를 private 접근제한자로 설정 */
	private String id;
	private String pwd;
	private String name;
	private Date enrollDate;
	
	/* 기본 생성자 명시적으로 작성 */
	public UserVO() {}
	
	/* 매개변수 있는 생성자 선택 사항이다. */
	public UserVO(String id, String pwd, String name, Date enrollDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate = enrollDate;
	}

	/* 설정자(setter)와 접근자(getter) */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	/*
	 * 접근자로 하나씩 필드값을 확인하기 번거로워서 
	 * 모든 필드의 값을 하나의 문자열로 변경하는 메소드를 생성
	 * */
	public String getInformation() {
		return "id = " + this.id + ", pwd = " + this.pwd
				+ ", name = " + this.name + ", enrollDate = " + this.enrollDate;
	}
	
	
	
	
	
	
	
	
	
}
