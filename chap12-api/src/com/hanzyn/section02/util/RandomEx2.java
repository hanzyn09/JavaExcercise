package com.hanzyn.section02.util;

import java.util.Random;

//random dice

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.println(rand.nextInt(6) + 1);
			//nextInt(6) : 0부터 6 미만까지의 정수이기 때문에,
			//	주사위 값을 출력하기 위해 + 1 하였다.
		}  

	}

}
