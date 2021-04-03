package com.hanzyn.section01.create;

import java.util.stream.Stream;

public class StreamByBuilder {
	public static void main(String[] args) {
		//builder() 메서드로 Builder 생성
		Stream stream = Stream.builder()
				.add("무궁화")
				.add("삼천리")
				.add("화려강산")
				.add("대한사람")
				.build();
		//build() 메서드로 Stream 객체 생성
	
		//내부 반복자로 출력
		stream.forEach(s-> System.out.println(s + " "));
	}
}
