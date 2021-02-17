package com.hanzyn.section01.arithmetic_operator;

public class Comparison {

	public static void main(String[] args) {
		/*비교 연산자: 피연산자 간 상대적인 크기를 판단하여 참/거짓을 반환함
		 * 
		 * == : 좌항(피연산자), 우항이 같으면 true, 다르면 false 반환
		 * != : 좌항, 우항이 다르면 true, 같으면 false 반환
		 * >  : 좌항 > 우항이면 true
		 * >= : 좌항 >= 우항이면 true
		 * <  : 좌항 < 우항이면 true
		 * <= : 좌항 <= 우항이면 true
		 * */
		
		//정수값 비교
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		
		//실수값 비교
		float fnum1 = 10.0f;
		float fnum2 = 20.0f;
		
		System.out.println("fnum1 == fnum2 : " + (fnum1 == fnum2));
		System.out.println("fnum1 != fnum2 : " + (fnum1 != fnum2));
		System.out.println("fnum1 > fnum2 : " + (fnum1 > fnum2));
		System.out.println("fnum1 >= fnum2 : " + (fnum1 >= fnum2));
		System.out.println("fnum1 < fnum2 : " + (fnum1 < fnum2));
		System.out.println("fnum1 <= fnum2 : " + (fnum1 <= fnum2));
		
		//문자값 비교
		char ch1 = 'a';
		char ch2 = 'A';
		
		System.out.println("ch1 == ch2 : " + (ch1 == ch2));
		System.out.println("ch1 != ch2 : " + (ch1 != ch2));
		System.out.println("ch1 > ch2 : " + (ch1 > ch2));
		System.out.println("ch1 >= ch2 : " + (ch1 >= ch2));
		System.out.println("ch1 < ch2 : " + (ch1 < ch2));
		System.out.println("ch1 <= ch2 : " + (ch1 <= ch2));
		
		//논리값 비교 : == 와 != 만 가능하다. 대소비교는 불가능!
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 == b2 : " + (b1 == b2));
		System.out.println("b1 != b2 : " + (b1 != b2));
		//System.out.println("b1 < b2 : " + (b1 < b2)); //error
		
		//문자열 비교 : == 와 != 만 가능하다. 대소비교는 불가능!
		String str1 = "JAVA";
		String str2 = "JAVA";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 != str2 : " + (str1 != str2));
		//System.out.println("str1 < str2 : " + (str1 < str2)); //error
		//사실상, 여기선 값을 비교하는 거로 보이지만 주솟값 비교하는게 더 정확한 방식이다.
		
		

	}

}
