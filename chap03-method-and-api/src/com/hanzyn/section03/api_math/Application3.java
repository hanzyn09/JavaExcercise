package com.hanzyn.section03.api_math;

import java.util.Random;

public class Application3 {
	/* java.util.random 클래스 
	 * 
	 * 원하는 범위의 난수를 구하는 공식
	 * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값*/
	public static void main(String[] args) {
		Random random = new Random(); //static이 아닌 클래스를 불러오기 때문에 객체를 생성함
		
		//0 ~ 9 까지 난수
		int random0 = random.nextInt(10) + 0;
		System.out.println(random0);
		
		//1 ~ 10 까지 난수
		int random1 = random.nextInt(10) + 1;
		System.out.println(random1);
		
		//20 ~ 45 까지 난수
		int random2 = random.nextInt(26) + 20;
		System.out.println(random2);
		
		//-128 ~ 127 까지 난수
		int random3 = random.nextInt(256) - 128;
		System.out.println(random3);
		
		/* 객체 생성을 하지않고 random 사용 */
		int random4 = new Random().nextInt(256) -128;
		System.out.println(random4);
	}
}
