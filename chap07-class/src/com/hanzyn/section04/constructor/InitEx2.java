package com.hanzyn.section04.constructor;

public class InitEx2 {

	//static 변수
	static int sVar;
	//static 메서드
	static void sMethod() {}
	
	//instance 변수
	int var;
	//instance 메서드 : 인스턴스 초기화 블록은 인스턴스 변수의 초기화 담당. 인스턴스 블록은 자주 사용하지 않음. 생성자가 대신함.
	void method() {}
	
	
	//static 초기화 블럭
	//: 클래스 변수 (static 변수)의 초기화 목적
	static {
		sVar = 0;  //static 변수
		sMethod(); //static 메서드

		//사용 불가
//		var = 0;   //instance 변수
//		method();  //instance 메서드
	}
	
	//static 메서드
	static void sMethod2() {
		//사용 불가
//		this.sVar = 0;
//		this.sMethod();
	}

}
