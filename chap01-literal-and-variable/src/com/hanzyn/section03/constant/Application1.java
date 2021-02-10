package com.hanzyn.section03.constant;

public class Application1 {

	public static void main(String[] args) {
		
		//상수 선언: final 붙이고, 변수명은 대문자로 사용.
		final int AGE;
		
		//초기화
		AGE = 20;
		// AGE = 30; //한 번 초기화했으면 값 재 대입 불가능.
		
		System.out.println("AGE:" + AGE);
		
		int sum = AGE; //다른 변수에 대입은 가능.
		
		//AGE = AGE + 10;
	}

}
