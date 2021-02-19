package com.hanzyn.section01.method;

public class Application1 {
	
	/* method
	 * 
	 * 어떤 특정 작업을 수행하기 위한 명령문의 집합 */
	// 디버깅 : f11
	//f5: 상세보기, f6: 다음단계보기
	
	public static void main(String[] args) {
		System.out.println("main() 시작 됨...");
		
		// 작성한 메서드를 호출하는 코드
		// 객체를 생성하는 방법 : 호출하려는클래스명 사용할이름 = new 클래스명();
		// 메서드를 호출하는 방법 : 사용할이름.메서드명();
		
		Application1 app1 = new Application1();
		app1.methodA(); //f5 상세보기
		System.out.println("main() 종료 됨...");
	}
	
	
	//접근 제한자 (public) 반환형 (void: 값을 반환하지 않는다) 메서드명()
	public void methodA() {
		System.out.println("methodA() 호출함...");
		methodB();
		System.out.println("methodA() 종료함...");
	}
	
	public void methodB() {
		System.out.println("methodB() 호출함...");
		
		System.out.println("methodB() 종료함...");
	}
}
