package com.hanzyn.excercise;

import java.util.Arrays;
import java.util.stream.Stream;

//문자열 배열을 스트림으로 변환한 후 forEach() 메서드로 출력하기

public class Excercise2 {
	public static void main(String[] args) {
		//문자열 배열
		String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
		
		//코드 작성
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(s -> System.out.println(s));
	}
}
