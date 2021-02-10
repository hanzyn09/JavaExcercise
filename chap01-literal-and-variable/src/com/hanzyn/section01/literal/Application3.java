package com.hanzyn.section01.literal;

/*숫자형 자료형 연산*/
public class Application3 {
	public static void main(String[] args) {
		
		System.out.println("============== 정수와 문자열 합치기 ============");
		System.out.println(9 + 9);  	// 18
		System.out.println("9" + 9);  	// 99
		System.out.println(9 + "9");  	// 99
		System.out.println("9" + "9");  // 99
		
		System.out.println("============== 세개 이상의 정수와 문자열 합치기 ============");
		System.out.println(9 + 9 + "9");	// 189 
		System.out.println(9 + "9" + 9);    // 999
		System.out.println("9" + 9 + 9);    // 999
		
		System.out.println("9" + (9 + 9)); // 918
 	}
}
