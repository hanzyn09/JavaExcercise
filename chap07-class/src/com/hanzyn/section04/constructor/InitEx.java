package com.hanzyn.section04.constructor;

public class InitEx {

	//생성자
	InitEx() {
		System.out.println("생성자 호출");
	}
	
	/************** 초기화 블록은 생성자 보다 먼저 실행 ****************/
	//static 초기화 블록은, 클래스가 메모리에 로드될 때 한번만 실행
	static{
		System.out.println("클래스 초기화 블럭 실행");
	}//인스턴스 변수나 인스턴스 메서드 사용 불가, this 사용 불가. 
	//: 객체 생성 시점이 아니라, 클래스가 메모리에 로드될 때 고정되기 때문에 자기 자신 객체를 가리킬 수 없다.
	
	//instance 초기화 블록은, 객체가 생성될 때 마다 실행
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	/************************************************************/
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		System.out.println("main init1 객체 생성");
		InitEx init1 = new InitEx();
		System.out.println("main init2 객체 생성");
		InitEx init2 = new InitEx();
	}

}
