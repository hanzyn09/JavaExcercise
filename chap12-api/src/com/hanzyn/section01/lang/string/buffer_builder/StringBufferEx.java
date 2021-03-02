package com.hanzyn.section01.lang.string.buffer_builder;

//갹체 자체의 수정이 가능한 StringBuffer 클래스 == 동적 문자열
//StringBuffer 클래스에서는 값 비교를 위해 equals() 메서드를 오버라이딩하지 않았기 때문에,
//문자열 자체의 값을 비교하려면 String 클래스로 비교한 후, equals() 메서드를 이용한다.

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println("문자열 연결 전 sb1 = "
				+ System.identityHashCode(sb1));
		sb1.append("efgh"); //매개변수값을 문자열로 변환하여 문자열값의 뒤에 붙인다.
		
		System.out.println("문자열 연결 후 sb1 = "
				+ System.identityHashCode(sb1));
		
		 System.out.println(sb1.toString().equals("abcdefgh"));

	}

}
