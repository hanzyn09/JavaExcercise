package com.hanzyn.section01.create;

//스레드 구현하는 두가지 방식
//1. 스레드 클래스 상속 받기
//2. Runnable 인터페이스 구현하기

public class ThreadEx {
	public static void main(String[] args) {
		
		//Thread 상속받는 방법
		ThreadExtend t1 = new ThreadExtend();
		
		//Runnable 구현하는 방법
		Runnable r = new RunnableImple();
		//Thread 생성자의 매개변수로 전달
		Thread t2 = new Thread(r);
		
		t1.start(); //필수 : 한번 실행되면 다시 실행할 수 없다. 한번더 실행하려면 스레드 객체를 한번 더 생성하고 start() 메서드 실행해줘야 함.
		t2.start(); //필수
	}
}

class ThreadExtend extends Thread{ //Thread 클래스를 상속받으면 다른 클래스를 상속받을 수 없다.
	@Override
	public void run() {
		System.out.println("Thread 상속받는 방법");
		for(int i=0; i<50; i++) {
			System.out.println("ThreadExtend: " + i);
		}
	}
}

class RunnableImple implements Runnable{ 
	//Runnable 인터페이스는 run() 메서드를 하나만 갖는 FunctionalInterface여서
	//람다표현식이나 익명 객체로 구현할 수 있어서 다양하게 사용할 수 있다.
	@Override
	public void run() {
		System.out.println("Runnable 구현하는 방법");
		for(int i=0; i<50; i++) {
			System.out.println("RunnableImple: " + i);
			
		}
	}
}