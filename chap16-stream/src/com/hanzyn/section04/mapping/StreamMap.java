package com.hanzyn.section04.mapping;
/*
 * mapXXX() 메서드는 요소를 새로 구성하여 새로운 스트림을 리턴한다.
 * */

import java.util.Arrays;
import java.util.List;

// 문자열 스트림 객체를 생성해 문자열의 길이 값으로 구성된 IntStream 객체를 생성한 후 내부 반복자로 해당요소의 값(문자열의 길이)을 출력하는 예제

public class StreamMap {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
		
		System.out.println("함수적 인터페이스 방식");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
		System.out.println();
		
		System.out.println("메서드 참조 방식");
		list.stream().mapToInt(String::length).forEach(len->System.out.println(len));
	}
}
