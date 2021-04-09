package com.hanzyn.section03.synchronize;

public class ThreadEx10 {
	public static void main(String[] args) {
		//게임 객체 생성
		SmartPhoneGame game = new SmartPhoneGame(); //game : 공유 객체
		
		//플레이어 1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();
		
		//플레이어 2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();
	}
}

class SmartPhoneGame{
	private int level; //level
	
	public int getLevel() {
		return this.level;
	}
	
	public synchronized void increaseLevel() { //synchronized 선언 시 충돌 문제 제거 가능 : 동기화 메서드
		
		synchronized(this){ //synchronized 선언 시 충돌 문제 제거 가능 : 동기화 블록
			
			while(true) {
				this.level++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e){}
				
				//현재 스레드의 이름과 레벨 출력
				System.out.println(Thread.currentThread().getName() + " Level: " + this.level);
				
				//Player1은 level을 1부터 5까지 올리고 중지한 다음, 다른 스레드(p2)를 깨워서 6부터 10까지 올리게 한다.
				if(this.level == 5) {
					notifyAll(); //다른 스레드를 모두 깨움. JVM 의존적.
					try {
						wait(); //p1은 wait 상태 
					}catch (InterruptedException e){}
					break;
				}
				
				
				//레벨이 10의 배수가 되면 종료
				if(this.level % 10 == 0) break;
			}
			
		}
		
	}
}

class Player1 extends Thread{
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player1");
		this.game = game;
	}

	@Override
	public void run() {
		game.increaseLevel();
	}
	
	
}

class Player2 extends Thread{
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}

	@Override
	public void run() {
		game.increaseLevel();
	}
	
	
}