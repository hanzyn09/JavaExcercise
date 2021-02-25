package com.hanzyn.section01.conditional_statement;

import java.util.Scanner;

public class D_switch {

	public void testSimpleSwitchStatement() {
		
		/*
		 * [switch문 표현식]
		 * switch(비교할변수) {
		 *     case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
		 *     case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
		 *     default : case에 모두 해당하지 않는 경우 실행할 구문; break;
		 * }
		 * 
		 * switch문으로 비교 가능한 값은 정수,문자,문자열 형태의 값이다.
		 * 실수와 논리는 비교할 수 없다.
		 * */
		
		 // 정수 두개와 연산기호 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
		    case '+' :
		    	result = first + second;
		    	break;
		    case '-' :
		    	result = first - second;
		    	break;
		    case '*' :
		    	result = first * second;
		    	break;
		    case '/' :
		    	result = first / second;
		    	break;
		    case '%' :
		    	result = first % second;
		    	break;
		    default : 
		    	System.out.println("연산기호 입력이 잘못되었습니다.");
		    	break;
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
	}

	public void testSwitchVendingMachine() {
		
		// switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
		// 1. JDK 1.7 이상부터 switch문을 이용하여 문자열 비교할 수 있다.
		// 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
		
		/* 간단한 자판기 생성 */
		System.out.println("======= greedy vending machine ========");
		System.out.println("    사이다    콜라    환타    바카스   핫식스");
		System.out.println("========================================");
	    System.out.print("음료를 선택해주세요 : ");
	    
	    Scanner sc = new Scanner(System.in);
	    String selectDrink = sc.nextLine();
	    
	    int price = 0; // 원하는 음료에 맞는 가격을 저장할 변수
	    
	    switch(selectDrink) {
	        case "사이다" :
	        	System.out.println("사이다를 선택했습니다.");
	        	price = 500;
	        	break;
	        case "콜라" :
	        	System.out.println("콜라를 선택했습니다.");
	        	price = 600;
	        	break;
	        case "환타" :
	        	System.out.println("환타를 선택했습니다.");
	        	price = 700;
	        	break;
	        case "바카스" :
	        	System.out.println("바카스를 선택했습니다.");
	        	price = 2000;
	        	break;
	        case "핫식스" :
	        	System.out.println("핫식스를 선택했습니다.");
	        	price = 10000;
	        	break;
	    }
	    System.out.println(selectDrink + "를 선택하셨습니다.");	    
	    System.out.println(price + "원을 투입해주세요!");
	}
}