package com.hanzyn.section02.control;

//스레드가 일시정지 상태에 있을 떄 InterrptException 예외를 발생시켜 run() 메서드를 정상종료시킬 수 있다.

public class ThreadEx5_interrupt {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					int i=1;
					while(true) {
						System.out.println("t1: " + i);
						
						//sleep을 넣지않으면 interrupt 되지 않음. interrupt() 메서드가 호출돼도 스레드가 종료되지않는다.
						Thread.sleep(1000);
						//sleep() 메서드 호출없이도 중지할 수 있는 방법이 있는데 , interrupt() 메서드가 호출되었는지 확인하면 된다. (ThreadEx6)
						i++;
					}
				} catch(InterruptedException e) {
					System.out.println(e.getMessage() + "!");
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
