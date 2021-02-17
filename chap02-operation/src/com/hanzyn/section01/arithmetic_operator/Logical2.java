package com.hanzyn.section01.arithmetic_operator;

public class Logical2 {

	public static void main(String[] args) {
		// 1 ~ 100 사이의 값인지 확인한다
		int num1 = 55;
		System.out.println("1부터 100 사이인지 확인: " + ((1 <= num1) && (num1 <= 100)));
		
		//대문자 인지 확인한다 : 문자 하나만 비교 가능
		char ch1 = 'G';
		System.out.println("ch1 은 대문자인지 확인: " + (('A' <= ch1) && (ch1 <= 'Z')));
	
		//대소문자 상관없이 영문자 y 인지 확인
		char ch2 = 'Y';
		System.out.println("영문자 y 인지 확인: " + ((ch2 == 'y')||(ch2 == 'Y')));
	
		//영문자인지 확인
		char ch3 = 'f';
		System.out.println("영문자인지 확인: " + ( ((65 <= ch3) && (ch3 <= 90)) || ((97 <= ch3) && (ch3 <= 122)) ) );
		System.out.println("영문자인지 확인: " + ( (('a' <= ch3) && (ch3 <= 'z')) || (('A' <= ch3) && (ch3 <= 'Z')) ) );
		//최소 괄호는 지워도 같은 결과가 나온다 == 연산에 대한 우선 순위가 적용돠었다.
		//하지만 확인하기 편하도록 괄호로 묶어준다.
	}

}
