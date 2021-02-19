package com.hanzyn.section01.method;

public class Application2 {

	public static void main(String[] args) {
		System.out.println("main 시작 함");
		
		//메소드는 호출된 후에 작업이 끝나면 호출된 곳으로 다시 되돌아간다.
		Application2 app2 = new Application2();
		//순서 주의
		app2.methodB();
		app2.methodA();

	}
	

	//접근 제한자 (public) 반환형 (void: 값을 반환하지 않는다) 메서드명()
	public void methodA() {
		System.out.println("methodA() 호출함...");

		System.out.println("methodA() 종료함...");
	}
		
	public void methodB() {
		System.out.println("methodB() 호출함...");
			
		System.out.println("methodB() 종료함...");
	}
}
