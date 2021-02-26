package com.hanzyn.section02.looping_statement;

import java.util.Scanner;

public class A_nestedFor {
	public void printGugudanFromTwoToNine() {
		/*for문안의 for문
		 * 
		 * 2단부터 단을 1씩 증가시키는 반복문*/
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public void printUpgradeGugudanFromTwoToNine() {
		/* 2단부터 9단까지 하나씩 증가시킴.*/
		for(int dan=2; dan<10; dan++) {
			//한 단씩 구구단을 출력하는 메서드를 호출
			printGugudanOf(dan);
			System.out.println();
		}
	}
	public void printGugudanOf(int dan) {

		for(int su=1; su<10; su++) {
			System.out.println(dan +" *" + su + " = " + (dan*su));
		}
	}

	public void printStarInputRowTimes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 행 수를 입력하세요.");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row ; i++) { //행
			for(int j = 1; j <= i; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printTriangleStars() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄로 출력할까요?");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) { //for 문 뒤집으면 역 방향으로 출력된다.
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}