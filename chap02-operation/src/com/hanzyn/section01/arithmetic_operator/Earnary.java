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
		
		String result1 = (num1 > num2) ? "pos" : "neg";
		
		System.out.println(result1);
	}

}
