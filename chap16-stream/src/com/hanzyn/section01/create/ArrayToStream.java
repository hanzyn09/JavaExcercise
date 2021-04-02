package com.hanzyn.section01.create;

import java.util.Arrays;
import java.util.stream.Stream;

//배열은 Arrays.stream() 메서드를 활용해서 스트림 객체로 생성

public class ArrayToStream {
	public static void main(String[] args) {
		//문자열 배열 객체 생성
		String[] arr = new String[] {"a","b","c","d","e","f"};
		
		//배열전제 Stream객체로 변환
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		//인덱스 지정해서 변환 (2<= i <5)
		Stream<String> stream2 = Arrays.stream(arr, 2, 5);
		stream2.forEach(s->System.out.print(s + " "));
	}
}
