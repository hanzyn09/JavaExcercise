package com.hanzyn.section01.method;

public class Application3 {
	//필드의 영역
	//전역변수가 선언되는 곳

	public static void main(String[] args) { //선언부 = 헤드
		//바디
		
		//(매개변수)  매개변수에 들어오는 값 
		
		/* 전달인자 (Argument. args) : 메서드에 전달하는 값
		 * 매개변수 (Parameter) : 메서드 선언부 괄호안에 전달인자를 받기위해 선언하는 변수
		 * 두가지를 이용한 메서드 호출
		 * 
		 * 변수의 종류
		 * 1. 지역변수 : 선언한 메서드 블록 내부에서만 사용 가능
		 * 2. 매개변수 : 다른 메서드 간 서로 공유해야하는 값이 존재하는 경우, 메서드 호출 시 사용하는 괄호를 이용하여 값을 전달 할 수 있다.
		 * 3. 전역변수(field)
		 * 4. 클래스(static) 변수
		 * */
		
		Application3 app3 = new Application3();
		//호출하려는 메서드의 매개변수 선언부에 미리 선언해둔 "자료형, 갯수, 순서"가 일치하게 값을 넣어서 호출해야한다.
		app3.testMethod(99);
		//app3.testMethod("30"); //error. 스트링 값으로 매개변수를 줄 수 없음.
		//app3.testMethod(20,30,40); //java에서는 error. 매개변수는 한개만 받도록 허용해놨다. (js에서는 허용가능)
		//app3.testMethod(); //error. 매개변수는 선언돼있는데 인자로 값을 전달하지 않으면 호출 할 수 없다.
	}
	
	public void testMethod(int age) {
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}

}
