package com.hanzyn.section02.kinds;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * 스트림API는 java.util.stream 패키지에 정의되어있다.
 * 구조는
 * BaseStream (Stream, IntStream, LongStream, DoubleStream) 이있다.
 * Stream은 Object 요소를 처리한다.
 * */

public class IntStreamEx {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Arrays.Stream() IntStream 생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStream 생성하기");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		//두번째 매개변수 인덱스 포함안됨
		System.out.println("IntStream.range(1,6) IntStream 생성하기");
		IntStream intstream3 = IntStream.range(1, 6);
		intstream3.forEach(s->System.out.print(s + "\t"));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1,5) IntStream 생성하기");
		IntStream intstream4 = IntStream.rangeClosed(1, 5);
		intstream4.forEach(s->System.out.print(s + "\t"));
		System.out.println();
	}
}
