package com.hanzyn.section01.create;

//우선순위 적용

public class ThreadEx4 {
/*
 * 우선순위를 제어하려면 우선순위의 속성값에 따라 스레드가 얻는 실행시간이 달라진다.
 * 1~10 사이로 지정할 수 있고, 10 이 우선순위가 가장 높다 : 상대적인 수치 O, 절대적인 수치 X
 * 우선순위 숫자가 같다해도 다른 프로그램에서는 다른 실행시간을 가질 수 있다.
 * 
 * Thread t = new Thread(r);
 * t.setPriority(7);
 * t.start();
 * 
 * 1. 우선순위 값은 상대적인 값이다.
 * 2. 스레드를 실행하기 전에 지정해야한다.
 * 3. main() 메서드에서 실행하는 스레드인 경우 기본값은 5.
 * 
 * 우선순위를 적용할 때는 직접 정수 값을 설정하기 보다 Thread 클래스의 static final Field 값을 이용하는 것이 바람직하다.
 * Windows는 우선순위가 10까지 있어서 MAX_PRIORITY 가 10이지만 다른 운영체제에서는 7일 수도 있어서 10으로 설정하면 오작동할 수 있다.
 * */
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
		t1.setPriority(7);
		t2.setPriority(3);
		/*
		 * t.setPriority(Thread.MAX_PRIORITY); // 10
		 * t.setPriority(Thread.NORM_PRIORITY); // 5
		 * t.setPriority(Thread.MIN_PRIORITY); // 1
		 * */
		t1.start();
		t2.start();
	}
}
