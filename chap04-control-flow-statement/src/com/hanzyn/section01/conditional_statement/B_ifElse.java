package com.hanzyn.section01.conditional_statement;

import java.util.Scanner;

public class B_ifElse {
	public void testNestedIfElseStatement() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		} else {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
