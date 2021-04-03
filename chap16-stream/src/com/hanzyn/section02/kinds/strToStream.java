package com.hanzyn.section02.kinds;

import java.util.stream.IntStream;

//문자열을 Stream 으로 처리하기 위해서는 chars() 메서드를 사용한다.
//char 자료형은 문자 자료형이지만 숫자이기 때문에 아래처럼 내부 반복자로 처리할 수 있다.
//char 자료형은 정수타입이므로 IntStream 객체로 생성한 후, 내부 반복자로 출력하면서 문자로 (char) 강제 형변환을 해줘야한다.

public class strToStream {
	public static void main(String[] args) {
		String str = "자바 세상을 만들자";
		
		//Stream 객체 생성
		IntStream isr = str.chars();
		isr.forEach(s->System.out.print((char)s));
	}
}
