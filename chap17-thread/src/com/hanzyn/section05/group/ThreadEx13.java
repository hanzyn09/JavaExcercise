package com.hanzyn.section05.group;
/*
 * 스레드 그룹
 * 
 * 서로 관련된 스레드를 그룹핑해서 다루기 위한 것
 * 그룹안에 그룹을 생성할 수 있다.
 * 보안상의 이유로 자신이 속한 그룹이나 하위 그룹은 변경할 수 있지만, 다른 그룹은 변경할 수 없다.
 * */
public class ThreadEx13 {
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("Group1");
		MyThread t1 = new MyThread(group, "First");
		MyThread t2 = new MyThread(group, "Second");
		MyThread t3 = new MyThread(group, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		//모든 스레드 중지
		group.interrupt();
		
	}
}

class MyThread extends Thread{

	 MyThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			
			try {
				sleep(500);
			} catch(InterruptedException e) {
				System.out.println(getName() + " interrupted 발생");
				break;
			}
		}
		System.out.println(getName() + " 종료");
	}
	
}