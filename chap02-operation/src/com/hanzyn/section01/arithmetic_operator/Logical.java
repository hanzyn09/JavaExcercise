package com.hanzyn.section01.arithmetic_operator;

public class Logical {

	public static void main(String[] args) {
		
		/* 논리연산자: 논리값(true, false)을 취급하는 연산자
		 * 
		 * && : AND : 두 개의 논리식 모두 참일 경우 참을 반환
		 * 			둘 중 한개라도 거짓인 경우 거짓을 반환
		 * || : OR : 두 개의 논리식 중 하나라도 참일 경우 참을 반환
		 * 			둘 다 거짓일 경우 거짓을 반환
		 * ! : NOT : 논리식의 결과가 참이면 거짓으로 바꾸고,
		 * 			거짓이면 참으로 바꿔준다.
		 * 
		 * 연산자의 결합 방향: 왼쪽에서 오른쪽으로.
		 * */
		boolean t = true;
		boolean f = false;
		
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (t && f));
		System.out.println("false && true : " + (f && t));
		System.out.println("false && false : " + (false && false));
		
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (t || f));
		System.out.println("false || true : " + (f || t));
		System.out.println("false || false : " + (false || f));
		
		System.out.println("!true : " + !t);
		System.out.println("!false : " + !f);
		
	}

}
