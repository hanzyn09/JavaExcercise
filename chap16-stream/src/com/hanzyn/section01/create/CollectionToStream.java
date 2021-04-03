package com.hanzyn.section01.create;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//컬렉션 프레임워크의 타입 (Collection, List, Set)의 경우
//해당 인터페이스에 정의되어있는 디폴트 메서드 stream() 을 이용해서 스트림을 만들 수 있다. 

public class CollectionToStream {
	public static void main(String[] args) {
		//문자열 배열을 컬렉션 프레임워크 Lisf로 변환
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		
		//list 객체를 stream() 메서드를 이용하여 Stream 객체로 생성
		Stream<String> stream = list.stream();
		
		//내부반복자를 이용하여 출력
		stream.forEach(s->System.out.println(s));
	}
}
