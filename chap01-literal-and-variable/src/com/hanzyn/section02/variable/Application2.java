package com.hanzyn.section02.variable;

/*변수 선언, 초기화와 byte 값*/
public class Application2 {
	
	public static void main(String[] args) {
		
		// 1. 선언
		// 정수
		byte bnum;		// 1byte
		short snum;		// 2byte
		int inum;		// 4byte
		long lnum;		// 8byte
		
		// 실수
		float fnum;		// 4byte
		double dnum;	// 8byte
		
		// 문자
		char ch;		// 2byte
		char ch2;
		
		// 논리형
		boolean isTrue;   // 1byte
		
		// 문자열 == 기본 자료형이 아닌 클래스 값으로, 참조 자료형이라고 불림.
		String str;			// 4byte
		
		
		// 2. 초기화
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L; //long 값은 대문자 L 붙여준다.
		
		fnum = 4.0f; //float 값은 소문자 f 붙여준다.
		dnum = 8.0;
		
		ch = 'a';
		ch2 = 97; //해당 ascii-code의 문자 저장.
		
		isTrue = true; //논리형은 변수명을 is~로 지정.
		isTrue = false;
		
		str = "It is a string";
		
		System.out.println("=============== 출력 ===============");
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		System.out.println("isTrue : " + isTrue);
		System.out.println("str : " + str);
		
	}
}

















