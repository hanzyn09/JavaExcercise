package com.hanzyn.section01.lang.string.buffer_builder;

public class StringEx9 {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abcd";
		
		System.out.println("str1 = " + System.identityHashCode(str1));
		System.out.println("str2 = " + System.identityHashCode(str2));
		//같은 상수풀에 저장된 메모리 주소를 참조한다.
		
		str1= str1 + "efg";
		System.out.println("str1 = " + System.identityHashCode(str1));
		//새로운 객체가 생성되었다.
	}

}
