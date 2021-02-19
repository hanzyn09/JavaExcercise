package com.hanzyn.section01.method;

public class Application6 {

	public static void main(String[] args) {
		// method 리턴값 테스트
		/*
		 * 메서드는 항상 마지막에 리턴이라는 명령어가 존재한다.
		 * return은 자신을 호출한 구문으로 복귀하는 걸 의미
		 * 복귀할 때 그냥 복귀 할 수도 있다. : void, 값을 가지고 복귀할 수도 있다
		 * 이 때 갖고 가는 값을 리턴값이라고 한다.
		 * 
		 * return을 반환하기 위해선 메서드 선언부에 리턴 타입을 명시해줘야한다.
		 * void 는 아무 반환 값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드.
		 * 반환 값이 없는 경우 return 구문은 생략해도 컴파일러가 자동으로 추가해준다.
		 * 반환 값이 있는 경우 return 구문을 반드시 명시한다.
		 * ==> 메서드 선언부에 선언한 리턴 타입 반환 값의 자료형은 반드시 일치해야한다.
		 * */
		
		System.out.println("main() method 시작함...");
		
		Application6 app6 = new Application6();
	
		System.out.println(app6.testMethod());
		
		String returnTxt = app6.testMethod();
		System.out.println(returnTxt);
	}

	public String testMethod() {
		return "hello world!";
	}
}
