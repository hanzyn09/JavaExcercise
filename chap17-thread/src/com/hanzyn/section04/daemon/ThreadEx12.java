package com.hanzyn.section04.daemon;
/*
 * 데몬 스레드
 * 일반 스레드를 보조하는 기능의 스레드. 주로 무한 실행을 하면서 일반 스레드르 보조한다.
 * 일반스레드가 종료되면 데몬스레드도 함께 종료된다.
 * 데몬 스레드 설정시 반드시 start() 메서드 실행 전에 setDaemon(true)로 설정되어야 실행할 수 있다.
 * 
 * */
public class ThreadEx12 {
	public static void main(String[] args) { //일반 스레드
		//스레드 객체 생성
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		
		//데몬스레드로 서정
		dt1.setDaemon(true);
		dt2.setDaemon(true);
		
		dt1.start();
		dt2.start();
		
		try {
			Thread.sleep(5000); //5초동안 sleep : 이 부분이 없으면 아예 출력되지않는다. 데몬스레드는 일반스레드가 없으면 출력되지 않음
		} catch(InterruptedException e) {}
		System.out.println("main 종료");
	} //main 종료시 데몬 스레드가 같이 종료
}

class DaemonThread extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500); //0.5초에 한번씩 무한 반복하며 출력
			} catch(InterruptedException e) {}
		}
	}
	
}