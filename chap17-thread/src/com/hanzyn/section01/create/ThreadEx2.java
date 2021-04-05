package com.hanzyn.section01.create;

//Runnable 인터페이스를 익명 객체로 생성하는 형태로 스레드를 구현하는 예제

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			//thread 객체를 바로 생성하면서 생성자의 매개변수로 Runnable 익명 구현 객체를 생성해주는 형태
			
			@Override
			public void run() {
				System.out.println("t1 스레드 시작");
				for(int i=0; i<50; i++) {
					System.out.println("t1 : " + i);
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("t2 스레드 시작");
				for(int i=0; i<50; i++) {
					System.out.println("t2 : " + i);
				}
			}
			
		});
		
		t1.start();
		t2.start();
	}
}
