package com.hanzyn.section04.constructor;

import java.util.Date;

public class User {

	private String id;
	private String pwd;
	private String name;
	private Date enrolldate;
	
	/*
	 * 생성자의 작성 위치
	 * 작성위치는 문법상으로는 클래스 내부에 작성하면 되지만,
	 * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
	 */
	
	/*
	 * 생성자의 사용 목적
	 * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
	 * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하여 인스턴스를 생성할
	 *    목적으로 주로 사용한다.
	 * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
	 *    --> 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 있다.
	 * */
	
	/*
	 * 생성자 작성 방법
	 * [표현식]
	 * 접근제한자 클래스명(매개변수) { (주로 필드를 초기화)
	 *   
	 *    this.필드명 = 매개변수;  // 설정자(setter) 여러 개의 기능을 한번의 호출로 수행할 수 있다.
	 * 
	 * }
	 * 
	 * --> 작성 시 주의사항
	 * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다.(대/소문까지 같아야한다.)
	 * 2. 생성자 메소드는 반환형을 작성하지 않는다.
	 * */
	
	/*
	 * 기본생성자(매개변수 없는 생성자)와 매개변수 있는 생성자
	 * 기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수도 있다.
	 * 매개변수 있는 생성자가 한 개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
	 * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
	 * */
	
	/* 기본생성자(default constructor)*/
	public User() {
		
		System.out.println("User 클래스의 기본 생성자 호출함..");
	}
	
	// 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다.(Compile Error)
//	public User() {}
	
	/* 매개변수 있는 생성자 */
	/* 초기화할 필드가 여러개 인 경우, 초기화하고 싶은 필드의 갯수별로 생성자를 여러개 준비해둘 수 있다.*/
	public User(String id, String pwd, String name) {

		/*
		 * 오버로딩 : 매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 동일한 생성자 혹은 
		 *         메소드를 한 클래스 내에 여러개 작성할 수 있게 만든 기술 
		 * */ 
		
		/* 매개변수 있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달 받은 값을 이용해서 
		 * 필드를 초기화 한다.*/
		this.id = id;    // this는 인스턴스  생성 시점에 발생한 주소가 저장된다(heap은 주로 접근)
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함.");
	}
	
	public User(String id, String pwd, String name, Date enrollDate) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//		this.enrolldate = enrollDate;
		
		/*
		 * 중복되는 초기화 내용이 발생하게 되면 이 중복되는 내용을 줄여서 작성할 수 있다.
		 * this() 메소드를 이용하는 것이다. 
		 * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
		 * 괄호 안에 매개변수의 타입, 갯수 , 순서에 맞는 생성자를 호출하고 복귀(리턴)한다.
		 * 리턴되어 돌아오지만 리턴값은 존재하지 않는다.
		 * 
		 * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우에는 Compile Error가 발생한다.
		 * */
		this(id, pwd, name);   // 미리 작성한 세 개의 필드를 초기화 하는 생성자로 매개변수로 받은 값을 전달
		this.enrolldate = enrollDate; // 나머지 필드를 초기화
		
		System.out.println("User 클래스의 모든 필드를 초기화하는 생성자  호출함..");
	}
	
	/*
	 * 복사 생성자
	 * 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드값을 이용해서 새로운 인스턴스 
	 * 생성 시 초기화 값으로 이용할 수 있다.
	 * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기때문에 서로 다른 주소값을 가지게 된다.(깊은복사)
	 * */
	public User(User otherUser) {
		
		this.id = otherUser.id;
		this.pwd = otherUser.pwd;
		this.name = otherUser.name;
		this.enrolldate = otherUser.enrolldate;
		
		System.out.println("User 클래스의 복사생성자 호출함..");
		
		System.out.println("this의 hashCode : " + this.hashCode());
		System.out.println("otherUser의 hashCode : " + otherUser.hashCode());
	}
	
	/**
	 * <pre>
	 *   모든 필드가 가지고 있는 값을 문자열로 합치기 하여 반환하는 메소드
	 * </pre>
	 * @return
	 */
	public String getInformation() {
		return "id = " + this.id + ", pwd= " + this.pwd
				+ ", name= " + this.name + ", enrollDate= " + this.enrolldate;
	}
}
