package com.hanzyn.section02.interfaces;

//내부 인터페이스 : 클래스의 멤버로 선언된 인터페이스
// 사용하는 이유?
// 속해 있는 바깥 클래스와 직접적인 관련이 있다.
//안드로이드의 이벤트 처리 인터페이스가 이런 형태로 만들어진 경우가 많다.

public class Outer {
	
	interface InterfaceEx{
		void method();
	}
	InterfaceEx ie;
	
	void setInterfaceEx(InterfaceEx ie) { //InterfaceEx를 매개변수로 받아 변수에 대입해주는 메서드
		this.ie = ie;
	} //인터페이스를 구현한 다양한 구현클래스의 객체를 다 받을 수 있게 된다.
	
	void outerMethod() {
		ie.method();
	} //위에서 대입한 객체의 method() 를 실행한다.
}
