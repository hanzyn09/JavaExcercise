package com.hanzyn.section01.basicStructure;

//exception이 발생하지 않아서 catch문을 실행하지않는다.
public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
