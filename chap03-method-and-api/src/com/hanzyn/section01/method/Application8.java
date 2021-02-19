package com.hanzyn.section01.method;

public class Application8 {

	public static void main(String[] args) {
		// non static method는 객체를 만들어서 호출했는데, static method 호출은 방식이 다르다.
		// static : 처음에 프로그램을 실행시키면, 메모리 공간에 올라가는데 static은 모두 모아서 먼저 선언해놓는다.
		// 			어디서든 사용할 수 있도록 static만 선점해놓는다.
		
		/*static method 호출 방법 : class명.method명(); */
		System.out.println("10 + 20 = " + Application8.sum(10, 20));
		
		//동일한 클래스 내에 작성된 static 메서드는 클래스명을 생략해도 된다..!!!!
		System.out.println("10 + 20 = " + sum(10, 20));
		

	}

	//static 메서드
	public static int sum (int first, int second) {
		return first + second;
	}
}
