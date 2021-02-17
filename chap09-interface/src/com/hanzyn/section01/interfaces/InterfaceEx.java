package com.hanzyn.section01.interfaces;

/*
 * 인터페이스의 특징
 * 1. 클래스 간 -> 상속, 인터페이스와 클래스 간 -> 구현
 * 2. 객체 생성 불가, 구현 클래스로 객체 생성
 * 3. 다중 구현 가능 (하나의 클래스에서 여러 개의 인터페이스 구현 가능)
 * 4. 인터페이스간의 상속 가능 (인터페이스 간은 다중 상속도 가능)
 * 5. 인터페이스의 모든 멤버의 접근 제한자: public
 * 6. 인터페이스의 모든 멤버 변수: final이 붙은 상수*/

public interface InterfaceEx {
	
	//상수 : public static final 자동 적용
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 100000;
	
	//추상 메서드 : public abstract 자동 적용
	public double meanPrice();
	public double totalPrice();
	
	
	//default 메서드 : default 반드시 작성, 생략시 public 자동 적용
	default double getSalePrice(double price) {
		return price - (price * 0.05);
	}
	//static 메서드 : 객체없이 인터페이스만으로 호출이 가능한 메서드
	static void printPrice(double price) {
		System.out.println(price);
	}
}

