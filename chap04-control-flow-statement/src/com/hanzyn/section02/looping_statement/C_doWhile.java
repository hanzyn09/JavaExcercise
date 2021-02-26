package com.hanzyn.section02.looping_statement;

import java.util.Scanner;

public class C_doWhile {
	/*
	 * do-while 표현식
	 * 
	 * do{
	 *	//1회차에는 무조건 실행
	 *	//이후에는 조건식을 확인하여 조건을 만족하는 경우 수행한다.
	 *	증감식;
	 * } while(조건식); 
	 * 
	 * */
	
	public void testSimpleDoWhileStatement() {
		do {
			System.out.println("최초 한번 동작함");
		}while(false);
		System.out.println("반복문 종료 확인...");
	}
	public void testSimpleDoWhileExample1() {
		/*키보드로 문자열 입력받아 반복적으로 출력
		 * 단, exit 입력 받으면 반복문 종료*/
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.println("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println(str);
		} while(!str.equals("exit")); //문자열의 내용이 같은지 확인
		
		System.out.println("반복문 종료 확인...");
	}
}
