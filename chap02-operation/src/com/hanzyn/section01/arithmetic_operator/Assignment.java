package com.hanzyn.section01.arithmetic_operator;

public class Assignment {

	public static void main(String[] args) {
		// '=' : 대입연산자
		// +=, -=, *=, /=, %= : 산술 복합 대입연산자
		
		int num =12;
		System.out.println("num: " + num);
		
		num = num + 3; // 좌항: 공간, 우항: 값
		System.out.println("num: " + num);
		
		num += 3;
		System.out.println("num: " + num);
		
		num -= 5;
		System.out.println("num: " + num);
		
		num *= 2;
		System.out.println("num: " + num);
		
		num /= 2;
		System.out.println("num: " + num);
		
		num =- 5; //이거는 num = -5로 인식한다.

	}

}
