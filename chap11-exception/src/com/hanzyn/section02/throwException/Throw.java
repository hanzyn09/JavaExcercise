package com.hanzyn.section02.throwException;
/*
 * throw : 개발자가 직접 예외를 "강제로 발생"시킬 수 있다.
 * throw new Exception("예외 발생");*/
public class Throw {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			throw new Exception("예외 발생"); 
			//Exception 객체 생성 시, 생성자에 문자열 값을 넣어주면 Exception 객체의 메세지로 저장된다.
		} catch (Exception e) {
			System.out.println(e.getMessage()); //여기서 출력됨.
		}
		System.out.println("프로그램 종료");

	}

}
