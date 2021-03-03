package com.hanzyn.section02.util;

import java.util.Random;

//random(seed)
public class RandomEx {

	public static void main(String[] args) {
		Random r1 = new Random(42); //seed 값이 42 : 매개변수
		Random r2 = new Random(42);

		System.out.println("r1");
		for (int i=0; i<5; i++) {
			System.out.println(i + " = " + r1.nextInt());
		}
		
		System.out.println("r2");
		for (int i=0; i<5; i++) {
			System.out.println(i + " = " + r2.nextInt());
		}

		//r1과 r2는 동일한 값을 출력한다.
		//seed 값은 나중에 다시 실행해도 동일한 결과를 나타낼 수 있도록 값을 지정하는 것이다.
	}

}
