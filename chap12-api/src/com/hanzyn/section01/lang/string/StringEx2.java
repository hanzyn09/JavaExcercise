package com.hanzyn.section01.lang.string;
/*
 * String 클래스의 객체를 생성하는 방법
 * 1. new 연산자를 사용해서 다른 클래스들 처럼 객체를 생성
 * 2. = 연산자를 사용해 대입하는 방식으로 객체를 생성
 * */
public class StringEx2 {

	public static void main(String[] args) {
		/***************** = 연산자로 객체 생성 *********************/
		//heap 메모리 영역이 아닌, 상수풀에 값이 저장된다. (메모리 절약)
		//같은 문자열 값을 대입연산자로 다른 객체에 생성하면, 이미 상수풀에 같은 값 존재
		//새로 추가되지 않고 기존의 주소를 참조변수에 저장한다.
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		if(name1 == name2) 
			System.out.println("name1 == name2");
		else System.out.println("name1 != name2");
		
		if(name1.equals(name2)) 
			System.out.println("name1.equals(name2)");
		else System.out.println("!name1.equals(name2)");
		
		
		/***************** new 연산자로 객체 생성 *********************/
		//heap 영역에 저장, 생성할 때마다 새로 저장
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");

		if(name3 == name4) 
			System.out.println("name3 == name4");
		else System.out.println("name3 != name4");
		
		if(name3.equals(name4)) //overriding 비교
			System.out.println("name3.equals(name4)");
		else System.out.println("!name3.equals(name4)");
	}

}
