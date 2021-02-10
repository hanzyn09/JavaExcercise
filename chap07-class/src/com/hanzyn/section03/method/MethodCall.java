package com.hanzyn.section03.method;

public class MethodCall {

	public static void main(String[] args) {
		
		Method.printName(); //직접 실행
		
		Method m = new Method(); //객체를 생성해서 실행
		m.printEmail();

	}

}

class Method {
	
	static void printName() {
		System.out.println("printName() 실행");
	}
	
	void printEmail() {
		System.out.println("printEmail() 실행");
	
		printId();
	}
	
	void printId() {
		System.out.println("printId() 실행");
	}
}