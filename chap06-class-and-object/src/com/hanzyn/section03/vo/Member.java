package com.hanzyn.section03.vo;

public class Member {
	/*
	 * ===회원정보를 관리===
	 * 회원번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부(활성화 여부)를 관리
	 * 
	 * 값 객체가 가지는 속성(필드)를 추출하는 과정 또한 추상화라고 볼 수 있다.
	 * VO 클래스 : 모든 필드를 private로 만든다.
	 * */
	
	private int number; //회원번호 . memberName이라고 작성하지 않음 (member.memberName 방지)
	private String name; //회원명
	private int age; //나이
	private char gender; //성별
	private double height; //키
	private double weight; //몸무게
	private boolean isActivated; //활성화 여부
	// aName 하면 a는 대문자로 인식하지 않음.
	
	/* 설정자 setter & 접근자 getter 의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다 
	 * 
	 * setter 작성규칙
	 * 	필드값을 변경할 목적의 매개변수를 - 변경하려는 필드와 같은 자료형으로 선언하고,
	 *  호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
	 *  [표현식]
	 *  public void set필드명(매개변수){
	 *  	필드 = 매개변수;
	 *  }
	 *  [예시]
	 *  public void setName(String name){
	 *  	this.name = name;
	 *  }
	 *  
	 * getter 작성규칙
	 *  필드의 값을 반환받을 목적의 메서드 집합을 의미.
	 *  각 접근자는 하나의 필드에만 접근하도록 한다. 필드에 접근해서 기록된 값을 return 으로 반환하며,
	 *  반환타입은 반환하려는 값의 자료형과 일치시킨다.
	 *  [표현식]
	 *  public 반환형 get필드명(){
	 *  	return 반환값;
	 *  }
	 *  [예시]
	 * public String getName(){
	 *  	return this.name;
	 *  }
	 * */
	
	//설정자 setter
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	//설정자 getter
	public int getNumber() {
		return this.number;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	
	/*boolean의 경우 접근 제한자는 get 으로 시작하지 않고 is 로 시작한다.*/
	public boolean isActivated() {
		return this.isActivated;
	}
	

	
}
