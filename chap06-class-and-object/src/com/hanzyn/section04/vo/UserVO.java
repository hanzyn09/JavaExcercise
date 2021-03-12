package com.hanzyn.section04.vo;

import java.util.Date;

public class UserVO {
	//일반적으로 value object 목적으로 설계된 클래스는 명사 뒤에 vo를 붙인다.
	//UserVO, MemberVO, BoardVO...  DTO도 동일.
	
	
	/*
	 * 자바빈 == jsp에서 표준 액션 태그로 접근할 수 있는 자바클래스
	 * 
	 * 작성규칙
	 * 1. 자바빈은 특정 패키지에 속해있어야한다. 
	 * 2. 멤버변수의 접근제어자는 private으로 선언해야한다.
	 * 3. 기본 생성자가 명시적으로 존재해야한다. (매개변수 있는 생성자는 선택사항)
	 * 4. 멤버변수에 접근 가능한 설정자와 접근자가 public으로 작성되어있어야한다.
	 * 5. 직렬화(serializable 구현)가 되어야한다. (선택사항)
	 * */
	
	/*모든 필드를 private 접근제한자로 설정*/
	private String id, pwd, name;
	private Date enrollDate;
	
	/*기본생성자는 명시적으로 작성*/
	public UserVO(String id, String pwd, String name, Date enrollDate){
		/*매개변수있는 생성자는 선택 사항*/
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate = enrollDate;
	}

	public UserVO() { //alt shift s 또는 소스에서 생성자 생성 가능
		super();
		// TODO Auto-generated constructor stub
	}

	/*설정자와 접근자*/
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
	
	public String getInformation() {
		return this.id;
	}
	
	
 }
