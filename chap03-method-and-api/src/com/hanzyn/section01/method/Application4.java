package com.hanzyn.section01.method;

public class Application4 {

	public static void main(String[] args) {
		Application4 app4 = new Application4();
		//1. 여러개의 전달 인자를 이용한 메서드 호출 == 여러 개의 매개변수
		app4.testMethod("Hanjin", 99, 'f');
		// app4.testMethod(11, "hi", 00); // 갯수는 맞아도 순서가 다르면 호출 불가능
		
		//2. 변수에 저장된 값을 전달하여 호출할수있다.
		String name = "유관순";
		int age = 20;
		char gender = 'f';
		//아래 메서드와는 다른 영역이다.
		app4.testMethod(name, age, gender); //변수에 ctrl 누르고 누르면 어디서 선언됐는지 찾을 수 있따.

	}

	public void testMethod(String name, int age, final char gender) {
		// 매개변수일 떄는 final 이어도 소문자로 선언해도 된다.
		// gender = 'm'; //error. 이미 들어올 때 부터 상수로 지정되었기 때문이다.
		////name = "girl"; //상수가 아니어서 변경 가능 
 		System.out.println("이름은 " + name + ", 나이는 " + age + ", 성별은 " + gender + " 입니다.");
	}
}
