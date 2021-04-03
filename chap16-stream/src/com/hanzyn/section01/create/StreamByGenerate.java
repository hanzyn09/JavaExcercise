package com.hanzyn.section01.create;

import java.util.stream.Stream;

//generate() 메서드를 이용하면 Supplier<T> 람다 인터페이스를 이용하여 값을 넣을 수 있다.
//Supplier<T> 는 매개변수가 없고 리턴값만 있는 함수형 인터페이스인데,
//generate() 메서드를 사용하여 생성되는 스트림은 크기가 정해져있지 않고 무한하기 때문에 "limit()" 메서드를 이용하여 최대 크기를 제한해야한다.
//그렇지 않으면 무한 반복 출력이 된다.

public class StreamByGenerate {

	public static void main(String[] args) {
		//generate() 메서드로 Stream 객체 생성
		//limit 10개 생성
		Stream<String> stream = Stream.generate(()->"애국가").limit(10);
		//내부 반복자로 출력
		stream.forEach(s->System.out.println(s));
	}
	
}
