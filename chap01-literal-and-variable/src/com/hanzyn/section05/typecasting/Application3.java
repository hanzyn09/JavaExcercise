package com.hanzyn.section05.typecasting;

public class Application3 {

	public static void main(String[] args) {
	//자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
		
		int inum = 10;
		long lnum = 100;
		
		//방법 1. 두 수의 연산결과를 int 형으로 변환 후 int 자료형 변수에 리턴 받는다.
		int isum = (int)(inum + lnum);
		System.out.println("isum = " + isum);
		
		//방법 2. long 형 값을 int로 강제 형변환
		int isum2 = inum + (int) lnum;
		System.out.println("isum2 = " + isum2);
		
		//방법 3. 결과값을 long 자료형으로 받는다. 자동형변환을 이용함.
		long lsum = inum + lnum;
		System.out.println("lsum = " + lsum);

		//주의! int 미만의 연산 처리 결과는 int 형이다.
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
		
		//byte result1 = byteNum1 + byteNum2;  //error
		int result1 = byteNum1 + byteNum2;
		//short result2 = (short) byteNum1 + shortNum1; //error
		short result2 = (short) (byteNum1 + shortNum1);
		
		System.out.println(result1 +" "+ result2);
		
		
	}

}
