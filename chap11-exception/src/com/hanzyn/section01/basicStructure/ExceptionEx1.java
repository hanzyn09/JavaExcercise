package com.hanzyn.section01.basicStructure;

//catch 문 실행시 캐치문 이후의 결과만 출력
public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
