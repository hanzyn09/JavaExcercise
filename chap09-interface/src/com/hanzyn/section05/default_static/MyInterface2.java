package com.hanzyn.section05.default_static;

//default 메서드 하나, static 메서드 하나의 인터페이스
//각각 간단한 출력문으로 확인가능
public interface MyInterface2 {
	
	default void defaultMethod() {
		System.out.println("MyInterface2의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("Myinterface2의 static 메서드");
	}
}
