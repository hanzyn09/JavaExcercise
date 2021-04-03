package com.hanzyn.section01.create;

import java.util.stream.Stream;

//iterate() 메서드를 이용하여 스트림에 내부 요소를 만들 수 있다.
//generate() 메서드 방식처럼 최대 갯수에 제한을 둬야한다.
//iterate() 메서드의 매개변수로는 초기값과 함수형 인터페이스가 람다표현식으로 정의된다.

public class StreamByIterator {
	public static void main(String[] args) {
		//generate() 메서드로 Stream 객체 생성
		//리미트 10개 생성
		Stream<Integer> stream = Stream.iterate(1, n->n+1).limit(10);
		//내부 반복자로 출력
		stream.forEach(s->System.out.println(s));
	}
}
