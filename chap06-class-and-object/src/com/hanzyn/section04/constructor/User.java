package com.hanzyn.section04.constructor;

import java.util.Date;

public class User {
	private String id;
	private String pwd;
	private String name;
	private Date enrolldate;
	
	/*
	 * 생성자는 클래스 내부에 작성하면 문법상으로는 구현되지만,
	 * 통상적으로 필드와 메서드 선언부 사이에 작성하는 것이 관례이다.
	 * 
	 * 사용 목적 
	 * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우
	 * 2. 매개변수 있는 생성자의 경우, 매개변수로 전달받은 값으로 필드를 초기화하여 인스턴스를 생성할 목적
	 * 3. 작성한 생성자외에는 인스턴스를 생성하는 방법을 제공하지 않는다는의미
	 *  == 인스턴스를 생성하는 방법을 제한하기 위한 용도*/
	
	/*
	 * 생성자 작성 방법
	 * 접근 제한자 클래스명(매개변수) { //주로 필드를 초기화
	 * 		this.필드명 = 매개변수; //설정자 (setter) 여러개의 기능을 한번의 호출로 수행 가능
	 * }
	 * 
	 * 작성시 주의사항
	 * 1. 생성자 메서드는 반드시 클래스 이름과 동일해야한다.
	 * 2. 반환형을 작성하지 않는다.
	 * */
	
	/*
	 * 오버로딩 : 매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 
	 * 생성자나 메서드를 한 클래스안에 여러개 작성할 수 있게 만든 기술
	 * */
	
	//기본 생성자
	public User() {
		System.out.println("기본 생성자 호출...");
	}
	//동일한 이름의 생성자나 메서드를 한 클래스안에서 작성할 수 없다 == 컴파일 에러
	//밑의 매개변수를 주는 생성자를 만들게 되면 기본 생성자가 있어야만 한다.
	
	//필드 초기화
	public User(String id, String pwd, String name) {
		this(id, pwd, name); //다른코드보다 위의 상단에 있어야한다.
		
//		this.name = name; //this는 인스턴스 생성 시점에 발생한 주소가 저장됨 (heap 주로 접근)
//		this.id = id;
//		this.pwd = pwd;
		
		

	}
	
	public User(String id, String pwd, String name, Date date) {
		
		this(id, pwd, name);
		this.enrolldate = date;
		
//		this.name = name;
//		this.id = id;
//		this.pwd = pwd;
//		this.enrolldate = date;
		
		
	}

	public String getInformation() {
		return (name + " " + id  + " " + pwd  + " " + enrolldate);
	}
}
