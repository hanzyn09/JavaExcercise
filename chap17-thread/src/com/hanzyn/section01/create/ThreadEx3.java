package com.hanzyn.section01.create;

//람다 표현식으로 스레드를 구현하는 예제

public class ThreadEx3 {
	public static void main(String[] args) {
		Thread t1= new Thread(()->{
			//스레드 객체를 바로 생성하면서 생성자에 람다표현식으로 run() 메서드를 정의하고 있다.
			System.out.println("t1 스레드 시작");
			for(int i=0; i<50; i++) {
				System.out.println("t1 : " + i);
			}
		});
		
		Thread t2 = new Thread(()->{
			System.out.println("t2 스레드 시작");
			for(int i=0; i<50; i++) {
				System.out.println("t2 : " + i);
			}
		});
		
		t1.start();
		t2.start();
		//스레드는 실행 순서를 정확히 보장할 수 없어서 실행 시 마다 결과가 달라질 수 있다.
	}
}
