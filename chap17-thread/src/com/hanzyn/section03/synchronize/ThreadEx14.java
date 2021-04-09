package com.hanzyn.section03.synchronize;

/*
 * 생산자 스레드와 소비자 스레드
 * 
 * 생산자 스레드 : 데이터를 만들어낸다.
 * 소비자 스레드 : 데이터를 소비한다.
 * 
 * 데이터를 생성하고 소비되지 않으면 wait 상태로 만들어 소비할 때 까지 생산하지 않는다.
 * 소비스레드는 데이터가 생산되지 않으면 생산될 때 까지 대기한다.
 * 
 * */
public class ThreadEx14 {
	public static void main(String[] args) {
		//통장 객체
		Account acc = new Account();
		
		//엄마스레드 객체 생성 : 생산자 스레드
		Mother mother = new Mother(acc);
		//아들스레드 객체 생성 : 소비자 스레드
		Son son = new Son(acc);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {}
		
		son.interrupt();
		mother.interrupt();
	}
}

class Account{
	int money;
	
	synchronized void withdraw() {
		while(money == 0) { //잔액이 없으면 wait()으로 대기
			try {
				wait();
			} catch(InterruptedException e) {
				break;
			}
		}
		
		notifyAll(); //잔액이 있으면 엄마스레드르 깨워서 출금
		System.out.println(Thread.currentThread().getName() + money + "원 출금");
		
		money = 0;
	}
	
	synchronized void deposit() {
		while(money > 0) {
			try {
				wait(); //잔액이 있으면 대기
			} catch(InterruptedException e) {
				break;
			}
		}
		
		//랜덤 입금 1~5만원
		money = (int)((Math.random() * 5) + 1) * 10000; //잔액이 없으면 랜덤으로 입금
		notifyAll(); //입금되면 대기 스레드를 실행상태로 전환
		System.out.println();
		System.out.println(Thread.currentThread().getName() + money +"원 입금");
	}
	
}

class Mother extends Thread{
	Account account;

	public Mother(Account account) {
		super("엄마");
		this.account = account;
	}

	@Override
	public void run() {
		while(true) { //무한반복해서 입금
			try {
				account.deposit();
				sleep((int)(Math.random()*2000)); //2초에 한번
			} catch(InterruptedException e) {
				break;
			}
		}
	}
	
}
class Son extends Thread{
	
	Account account;

	public Son(Account account) {
		super("아들");
		this.account = account;
	}

	@Override
	public void run() {
		while(true) { //무한반복해서 출금
			try {
				account.withdraw();
				sleep((int)(Math.random()*300)); //0.3초마다 반복, 잔액이 없으면 wait()
			} catch(InterruptedException e) {
				break;
			}
		}
	}
}
