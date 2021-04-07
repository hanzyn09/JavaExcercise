package com.hanzyn.section02.control;

//sleep() 메서드 호출없이도 중지할 수 있는 방법이 있는데 , interrupt() 메서드가 호출되었는지 확인하면 된다.

public class ThreadEx6_interrupt {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
					int i=1;
					while(true) {
						System.out.println("t1: " + i);
						i++;
						
						if(Thread.interrupted()) break;
					}
				System.out.println("스레드 실행 종료");
			}
		});
		
		t1.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage() );
		}
		t1.interrupt();
	}
}
