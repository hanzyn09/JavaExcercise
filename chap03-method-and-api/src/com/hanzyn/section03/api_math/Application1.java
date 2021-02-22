package com.hanzyn.section03.api_math;

public class Application1 {
	public static void main(String[] args) {
		/*
		 * API란?
		 * application programming interface는 응용프로그램에서 사용할 수 있도록 운영체제나 프로그램 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스
		 * 
		 * 구현할 수 없거나 구현하기 어려운 기능들을 JDK 설치 시 사용할 수 있도록 제공해놓은 소스코드*/
	
		/*java.lang.math*/ //java api 8 치면 확인 가능
		
		//class의 풀네임을 다 적은 경우
		System.out.println(java.lang.Math.abs(-7));
		System.out.println(Math.abs(-7));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.max(20, 30));
		System.out.println(Math.PI);
		
	}
}
