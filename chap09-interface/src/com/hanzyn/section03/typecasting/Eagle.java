package com.hanzyn.section03.typecasting;

//Animal 인터페이스를 구현한 클래스.
public class Eagle implements Animal {
	
	//반드시 구현해주어야하는 메서드 : 인터페이스에서 추상 메서드로 선언한 메서드
	public void sleep() {
		System.out.println("잠을 잔다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
}
