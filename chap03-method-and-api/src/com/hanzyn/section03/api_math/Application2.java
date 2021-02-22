package com.hanzyn.section03.api_math;

public class Application2 {

	public static void main(String[] args) {
		// 난수의 활용
		
		//Math.random(): 0.0~1.0 사이의 실수값을 주는데, 정수값으로 변환 하는 경우가 많다.
		//원하는 범위의 난수를 구하는 공식
		/* (int)(Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값
		 * 
		 *  0 * 10 + 1 <= (int)(Math.random * 10) + 1 < 1 * 10 (== 10.99999) + 1 (==11)*/
		
		System.out.println(Math.random());
		
		/* 0 ~ 9 까지의 난수 발생 */
		int random1 = (int)(Math.random() * 10);
		System.out.println(random1);
		
		/* 1 ~ 10 까지의 난수 발생 */
		int random2 = (int)(Math.random() * 10) + 1;
		System.out.println(random2);

		int random = (int) Math.random() * 10 + 1; //항상 1
		System.out.println(random);
		
		/* 10 ~ 15까지의 난수 발생*/
		int random3 = (int) (Math.random() * ((15-10)+1)) + 10;
		System.out.println(random3);
		
		/* -128 ~ 127까지의 난수 발생 */
		int random4 = (int) (Math.random() * 256) + (-128);
		// int random4 = (int) (Math.random() * 256) - 128; //위와 동일하다.
		System.out.println(random4);
	}

}
