package com.hanzyn.excercise;

interface TV{
	void turnOn();
}

public class Excercise4 {

	public static void main(String[] args) {
		// 익명 구현 객체를 생성해 출력하기
		
		TV p1 = new TV() {
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다...");
			}
		};

		p1.turnOn();
	}

}
