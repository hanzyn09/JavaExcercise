package com.hanzyn.section03.method;

//메소드는 스택의 자료구조로 메모리를 생성. (LIFO)
public class MethodOrder {

	public static void main(String[] args) {
		
		MethodEx me = new MethodEx();
		me.one();

	}
	
}

class MethodEx {
	
	void one() {
		two();
		System.out.println("one");
	}
	
	void two() {
		three();
		System.out.println("two");
	}
	
	void three() {
		System.out.println("three");
	}
}