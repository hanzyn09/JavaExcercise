package com.hanzyn.section01.lang.object.equals;

//String과 Wrapper class에서 equals : 주솟값비교가 아닌, 저장된 값을 비교한다.
//메서드 명이 같더라고 동일한 기능이라고 단정짓지 말고, 해당 내용을 잘 살펴볼 것. ==> 메서드 재정의 가능성

public class EqualsEx2 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if (str1 == str2) {
			System.out.println("str1 과 str2 는 동일한 객체");
		} else {
			System.out.println("str1 과 str2 는 다른 객체");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 과 str2 는 동일한 문자열");
		} else {
			System.out.println("str1 과 str2 는 다른 문자열");
		}

	}

}
