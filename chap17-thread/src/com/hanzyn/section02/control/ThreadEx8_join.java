package com.hanzyn.section02.control;

//join() : 다른 스레드의 실행이 완료될 때 까지 기다리는 메서드
//e.g. 합계 계산을 하는 두 스레드가 계산 작업을 완료하면 결과 값을 받아 처리하는 경우에 사용

public class ThreadEx8_join {
	public static void main(String[] args) {
		Sum t1 = new Sum();
		Sum t2 = new Sum();
		
		t1.start();
		t2.start();
		try {
			t1.join(); //t1 스레드가 종료될때까지 대기
			t2.join(); //t2 스레드가 종료될때까지 대기 : 처리해주지 않으면 sum 연산 시 0 출력됨.
		} catch(InterruptedException e) {
		
		}
		System.out.println("두 스레드의 sum 합계 : " + (t1.sum + t2.sum)); //연산이 끝난 값으로 처리하는 case
	}
}
class Sum extends Thread {
	int sum = 0;

	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
	}
	
}