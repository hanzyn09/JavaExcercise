package com.hanzyn.section04.mapping;

/*
 * mapping이란, 컬렉션 프레임워크에서 map 인터페이스의 key 와 value 처럼 매핑된 개념을 생각하면 된다.
 * 매핑은 스트림의 데이터를 매개변수로 받고 가공해서 새로운 스트림을 만들어 리턴한다.
 * ==> 데이터의 변환을 위한 기능
 * 스트림의 요소를 다른 요소와 매핑해서 대체할 수 있는 기능
 * 
 * flatMapXXX(), mapXXX(), asDoubleStream(), asLongStream(), boxed() 메서드가 있다.
 * */

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamFlatMap {
	/*
	 * flatXXX() 메서드는 다른 타입의 요소를 가진 스트림을 리턴한다.
	 * */
	public static void main(String[] args) {
		//문자열을 공백으로 분리해서 매핑
		List<String> list1 = Arrays.asList("동해물과","백두산이","마르고 닳도록");
		list1.stream().flatMap(data-> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
		System.out.println();
		
		//문자열을 ,로 분리해서 double 자료형으로 변환해서 매핑
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3", "4.4, 5.5, 6.6");
		DoubleStream dsr = list2.stream().flatMapToDouble(data->{
			String[] strArr = data.split(",");
			double[] dArr = new double [strArr.length];
			for(int i=0; i<dArr.length; i++) {
				dArr[i] = Double.parseDouble(strArr[i].trim());
			}
			return Arrays.stream(dArr);
		});
		dsr.forEach(n->System.out.println(n));
		System.out.println();
		
		//문자열을 ,로 분리해서 int 자료형으로 변환해서 매핑
		List<String> list3 = Arrays.asList("1,2,3","4,5,6");
		IntStream isr = list3.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
		isr.forEach(n->System.out.println(n));
	}
}
