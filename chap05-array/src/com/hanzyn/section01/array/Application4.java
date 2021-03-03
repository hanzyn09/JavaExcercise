package com.hanzyn.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		//5명의 자바 정수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만든다.
		
		int[] score = new int[5];
		
		int sum = 0;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+ "번째 점수 입력 : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		avg = sum / score.length;
		
		System.out.println("합계 : " + sum + ", 평균: " + avg);

	}

}
