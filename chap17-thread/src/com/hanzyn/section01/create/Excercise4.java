package com.hanzyn.section01.create;

//스레드 두개를 실행시켜 0~49 까지 출력하는 코드.
//두 개의 스레드가 동시에 실행되어 출력순서가 뒤죽박죽 되어있는 코드를, t1 스레드에 우선순위를 높여 출력되도록 코드 작성

public class Excercise4 {
	private static final int MAX_PRIORITY = 10;
	private static final int MIN_PRIORITY = 1;

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
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
		
		//우선순위 지정
		t1.setPriority(MAX_PRIORITY); //t1의 작업시간을 더 많이 적용시켜 빠르게 처리되도록 설정
		t2.setPriority(MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
	}
}
