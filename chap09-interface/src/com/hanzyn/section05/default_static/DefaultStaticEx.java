package com.hanzyn.section05.default_static;

public class DefaultStaticEx {

	public static void main(String[] args) {

		Child c = new Child();
		c.defaultMethod();
		
		c.method2();  //parent에 있는 메서드
		
		//"static 메서드"는 객체없이 "인터페이스 만으로" 호출 가능
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
		
	}

}
