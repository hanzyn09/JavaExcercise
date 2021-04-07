package com.hanzyn.section02.control;
/*
 * sleep()
 * 
 * 실행 중인 스레드를 원하는 시간만큼 멈추고 싶을 때 사용.
 * 매개변수의 값(1000분의 1)만큼 일시정지했다가 다시 실행사애로 돌아간다.
 * 
 * 이 메서드는 InterruptedException 처리를 강제하기 때문에 try 구문안에 작성한다.
 * */
public class ThreadEx7_sleep {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<10; i++) {
					System.out.println("t1:" + i);
					try {
						Thread.sleep(1000); //1초동안 일시정지
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println("스레드 실행 종료");
			}
			
		});
		t1.start();
	}
}
