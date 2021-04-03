package com.hanzyn.section04.mapping;

import java.util.Arrays;

/*
 * flatXXX(), mapXXX()외에도 asDoubleStream(), asLongStream(), boxed() 메서드가 있다.
 * 이 메서드들은 stream 객체들을 형변환 할 수 있는 메서드이다.
 * */
public class StreamOther {
	public static void main(String[] args) {
		int intArr[] = {10, 20, 30, 40, 50, 60};
		
		//double 타입의 요소를 갖는 DoubleStream으로 형변환
		Arrays.stream(intArr).asDoubleStream().forEach(d->System.out.println(d));
		System.out.println();
		
		//int 타입의 요소를 갖는 Stream<Integer>로 형변환
		Arrays.stream(intArr).boxed().forEach(i->System.out.println(i.getClass()));
		
	}
}
