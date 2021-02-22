package com.hanzyn.section01.basicStructure;

//try 구문 사용시 반드시 하나 이상의 catch 구문이나 finally 가 존재해야한다.
public class Finally {

	public static void main(String[] args) {
		System.out.println("DB연결 시작");
		
		try {
			System.out.println("DB 작업");
			System.out.println(3/0);
		} catch(Exception e) {
			System.out.println("DB작업 중 예외 발생");
		} finally { //DB 연결 종료 시 필수. 서버자원 낭비 문제 방지.
			System.out.println("DB연결 종료");
		}

	}

}
