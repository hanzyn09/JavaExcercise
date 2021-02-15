package com.hanzyn.section05.typecasting;

public class Application1 {

	public static void main(String[] args) {
		/*
		 * 데이터 형변환
		 * 자바에서 다른 타입간 연산은 피연산자들이 모두 같은 타입인 경우 실행 할 수 있다.
		 * ==> 같은 데이터 타입끼리만 연산 수행 가능.
		 * 
		 * 형변환 종류 & 규칙
		 * 1. 자동 형변환 (묵시적형변환): 컴파일러가 자동으로 수행
		 * 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환
		 * 1-2. 정수는 실수로 자동 형변환
		 * 1-3. 문자형은 int로 자동 형변환
		 * 1-4. 논리형은 형변환 규칙에서 제외
		 * 
		 * 2. 강제 형변환 (명시적형변환) : 연산자를 이용한 강제적 수행의 형변환
		 * 2-1. 자동 형변환 안되면 강제 형변환 필요*/

		// 자동 형변환 규칙 테스트
		// 1-1 . 작은 자료형에서 큰 자료형으로는 자동 형변환
		byte bnum = 1;
		short snum = bnum;
		int inum = snum;
		long lnum = inum;
		
		// 연산시 자동으로 큰 형에 맞추어 계산
		int num1 = 10;
		long num2 =20;
		
		//int result1 = num1 + num2; //큰 쪽 자료형인 long 으로 계산 되어짐. error.
		long result1 = num1 + num2;
		
		System.out.println("result 1 = "+result1);
		
		//실수끼리의 자동 형변환
		float fnum = 4.0f;
		double num = fnum;
		
		double result2 = fnum + num;
		
		System.out.println("result2 = " + result2);
		
		//1-2. 정수는 실수로 자동 형변환
		long eight = 88888888888888888L; // no L : error . out of int range
		float four = eight; // range of float > long
		System.out.println("four = " + four);
		
		//1-3. 문자형은 int로 자동 형변환
		char ch1 = 'a';
		int charNumber = ch1;
		System.out.println("charNumber = " + charNumber);
		
		char ch2 = 65;
		System.out.println("ch2 = " + ch2);
		
		//1-4. 논리형은 형변환 규칙에서 제외
		boolean isTrue = true;
//		byte b = isTrue;
//		short s = isTrue;
//		int i = isTrue;
//		long l = isTrue;
//		char c = isTrue;
		
	}

}
