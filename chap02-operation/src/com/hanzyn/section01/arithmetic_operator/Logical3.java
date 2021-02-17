package com.hanzyn.section01.arithmetic_operator;

public class Logical3 {

	public static void main(String[] args) {
		/* AND 와 OR 연산의 특징
		 * 
		 * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤는 실행하지 않는다.
		 * 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안한다.
		 */

		int num1 = 10;
		int result1 = (false && (++num1 > 0)) ? num1 : num1;
		int result2 = (false || (++num1 > 0)) ? num1 : num1;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}

}
