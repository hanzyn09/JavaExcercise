package com.hanzyn.section01.method;

public class Application5 {

	public static void main(String[] args) {
		// 메서드 리턴 테스트
		// 모든 메서드 내부에는 return; 이 존재한다.
		// void 메서드의 경우엔 return; 을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가해준다.
		
		// return 은 현재 메서드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
		// 리턴은 한두개를 권장.
		
		System.out.println("main() 메서드 시작...");
		
		Application5 app5 = new Application5();
		app5.testMethod();
		System.out.println(app5.testMethod2());

	}
	
	public void testMethod() {
		System.out.println("testMethod() 동작 확인...");
		return; //없으면 컴파일러가 자동으로 작성해주는 것.
		// System.out.println("gogo"); // 불가능. 리턴에서 이미 돌아가겠다고 선언한 것이기 때문!
	}
	
	public int testMethod2() {
		return 10;
	}

}
