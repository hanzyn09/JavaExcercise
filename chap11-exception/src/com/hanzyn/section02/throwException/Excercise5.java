package com.hanzyn.section02.throwException;

public class Excercise5 {

	public static void main(String[] args) {
		try {
			test1();
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5"); //test1() 메서드가 exception 처리 했음. 실행되지 않음.
		}

	}
	
	public static void test1() throws Exception{
		try {
			test2();
			System.out.println("1"); //catch 되어서 실행되지 않음
		} catch (NullPointerException e) {
			System.out.println("2");
		} finally {
			System.out.println("3"); //항상 실행됨.
		}
		System.out.println("7");
	}

	public static void test2() throws Exception{
		throw new NullPointerException();
	}
}
