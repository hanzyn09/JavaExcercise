package com.hanzyn.section01.extend;

//상속은 하나의 부모클래스에서만 가능
//모든 클래스는 Object 클래스로 부터 시작하는 하위 객체이다.
//자식 클래스를 객체로 생성하면, 부모 클래스가 먼저 객체화 된다.
public class SmartPhone extends Phone {
	
	public void installApp() {
		System.out.println("앱 설치");
	}
	

}
