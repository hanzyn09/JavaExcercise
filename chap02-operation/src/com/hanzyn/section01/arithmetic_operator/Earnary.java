package com.hanzyn.section01.arithmetic_operator;

public class Earnary {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자 : 자바에서 유일하게 피연산자 항목이 3개인 연산자
		 * 
		 * (조건) ? 참 일 때 사용 할 값 : 거짓 일 때 사용할 값
		 * 
		 * 단, 조건식은 반드시 결과가 true or false 값이 나와야 한다.
		 * 비교 or 논리 연산자를 주로 사용한다.
		 * */

		int num1 = 10;
		int num2 = -10;
		
		String result1 = (num1 > 0) ? "pos" : "neg";
		String result2 = (num2 > 0) ? "pos" : "neg";
		
		System.out.println(result1);
		System.out.println(result2);
		
		//삼항연산자는 중첩도 가능.
		int num3 = 5;
		int num4 = 0;
		int num5 = -5;
		String result3 = (num3 > 0) ? "pos" : ( (num3 == 0)  ?  "zero" : "neg");
		String result4 = (num4 > 0) ? "pos" : ( (num4 == 0)  ?  "zero" : "neg");
		String result5 = (num5 > 0) ? "pos" : ( (num5 == 0)  ?  "zero" : "neg");
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
