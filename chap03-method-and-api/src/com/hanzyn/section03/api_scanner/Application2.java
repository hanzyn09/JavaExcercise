package com.hanzyn.section03.api_scanner;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		// Scanner의 nextLine() 과 next()
		/*
		 * nextLine() : 공백을 포함하여 한 줄을 입력하기 위한 개행문자 전까지 읽어서 문자열로 반환
		 * next(): 공백문자나 개행문자 전 까지를 읽어서 문자열에 반환.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인사말 입력 : ");
		String greet1 = sc.nextLine();
		System.out.println(greet1);
		
		System.out.println("인사말 한번 더 입력 : ");
		String greet2 = sc.next();
		System.out.println(greet2);

	}

}
