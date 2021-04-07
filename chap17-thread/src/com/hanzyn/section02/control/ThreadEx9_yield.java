package com.hanzyn.section02.control;

/*yield() : 다른 스레드에게 실행을 양보하는 메서드
 * 
 * 스레드는 보통 반복적인 작업을 처리하기위해 일부러 무한반복 코드를 넣는 경우가 있는데,
 * 이런 경우 다른 스레드에게 실행을 양보하는 것이 성능향상에 도움이 된다.
 * yield() 메서드를 실행한 스레드는 대기상태가 되고, 우선순위가 동일하거나 높은 다른 스레드가 실행되게한다.
 *
 * */

public class ThreadEx9_yield {
	public static void main(String[] args) {
		YieldThread t1 = new YieldThread();
		YieldThread t2 = new YieldThread();
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000); //메인 메서드가 sleep(), t1/t2 스레드가 아님.
			
		} catch(InterruptedException e) {
			
		}
		
		t1.isContinue = false; // t1 양보
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		
		t1.isContinue = true; // t1 다시 실행
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
		
		//스레드 종료
		t1.isBreak = true; // 1초 경과
		t2.isBreak = true; // 2초 경과
	}
}

class YieldThread extends Thread{
	boolean isContinue = true; //false가 되면 다른 스레드에게 실행을 양보할 수 있도록 만들었다.
	boolean isBreak = false; //외부에서 스레드를 종료할 수 있게해주는 변수로, while 문 제어.
	
	@Override
	public void run() {
		while(!isBreak) {
			if(isContinue) System.out.println(getName() + " 실행 중"); //자신 스레드 객체 이름을 출력하는 메서드
			else Thread.yield(); //의미없이 반복되는 시간을 다른 스레드에게 양보하여 효율적으로 자원을 사용할 수 있게한다.
		}
		
		System.out.println(getName() + " 종료");
	}
	
	
}
