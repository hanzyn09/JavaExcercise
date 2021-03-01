package com.hanzyn.section01.lang.string;

//보통 변수를 선언할때 초기값을 지정하지 않으면 기본 값으로 초기화 되는데,
//string은 참조자료형이기 때문에 null 로 초기화 된다.
//일반적으로 null 보다는 "" 빈 문자열로 초기화 해주는 형태를 많이 사용한다.
public class StringEx4 {

	public static void main(String[] args) {
		String text = "Hello, My name is hanjin.";
		
		System.out.println("0번째 인덱스 : " + text.charAt(0));
		
		for(int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}

	}

}
