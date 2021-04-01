package com.hanzyn.section01.interfaces;

/*
 * 자바에서 제공하는 표준 API 중 한개의 추상 메서드를 갖고 있는 인터페이스가 있다.
 * 대표적인 인터페이스가 스레드에 사용되는 Runnable 인터페이스이다.
 * runnable 인터페이스를 이용하여 람다식으로 스레드를 생성하는 예제 (매개변수, 리턴값 없는 람다식)
 * 
 * 만약 람다식으로 사용될 인터페이스를 만들 때 두개 이상의 추상 메서드를 선언하지 못하도록 하려면
 * @FunctionalInterface라는 어노테이션을 넣어준다.
 * */
public class LambdaEx2_Thread {
	public static void main(String[] args) {
		System.out.println("시작");
		Runnable run =()-> {
			for(int i =0; i<=10; i++) {
				System.out.println("첫번째 : " + i);
			}
		};
		
		Runnable run2 =()-> {
			for(int i =0; i<=10; i++) {
				System.out.println("두번째 : " + i);
			}
		};
		
		Thread t = new Thread(run); //스레드는 독립적으로 실행된다. 메인과는 별개로 실행되는 프로그램.
		Thread t2 = new Thread(run2);
		t.start();
		t2.start();
		System.out.println("종료"); //먼저 출력된다.
	}
}
