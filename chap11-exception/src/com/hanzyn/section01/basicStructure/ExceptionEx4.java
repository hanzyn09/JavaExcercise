package com.hanzyn.section01.basicStructure;

//finally : 마지막에 실행된다.
//예외 없이 정상적으로 실행이 되던, 예외가 발생하던 무조건 실행되는 구문이다.
public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("DB연결 시작");
		try {
			System.out.println("DB 작업");
		} catch (Exception e) {
			System.out.println("DB 작업 중 예외발생");
		} finally { //예외가 발생하지 않아도 실행
			System.out.println("DB연결 종료");
		}

	}

}
