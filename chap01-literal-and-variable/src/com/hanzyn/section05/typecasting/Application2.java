package com.hanzyn.section05.typecasting;

public class Application2 {

	public static void main(String[] args) {
		/*
		 * 강제 형변환
		 * 바꾸려는 자료형으로 캐스트 연산자를 이용해 형변환
		 * e.g. (type)값*/
		
		//1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요.
		//1-1. 정수끼리 강제 형변환
		long lnum = 8;
		//int inum = inum; // 데이터 손실 가능성을 컴파일러가 안내함
		int inum = (int) lnum;
		short snum = (short) inum;
		byte bnum = (byte) snum;

		//1-2. 실수끼리 강제 형변환
		double dnum = 8.0;
		float fnum = (float) dnum;
		
		//1-3. 실수를 정수로 변경시 강제 형변환 필요
		float fnum2 = 4.0f;
		//long lnum2 = fnum2; //float 는 4byte. long은 8byte. 자동형변환 불가 == 소수점 자리 이하 데이터 손실 가능성
		long lnum2 = (long) fnum2;
		
		//1-4. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환 필요
		char ch = 'a';
		byte bnum2 = (byte) ch;
		short snum2 = (short) ch; 
		
	}

}
