package com.hanzyn.section05.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * groupingBy() 메서드로 Map 객체를 생성할 수 있다.
 * Shape 객체를 도형의 종류별로 묶어서 Map 객체로 저장하는 예제이다.
 * */
public class StreamGroupingBy {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		try {
			//객체 타입으로 그룹핑 (Rectangle, Circle)
			Map<Object, List<Shape>> map = list.stream()
					.collect(Collectors.groupingBy(f -> f.getClass())); //그룹핑 기준은 getClass()
			
			System.out.println("사각형 출력");
			map.get(Class.forName("com.hanzyn.section05.sorting.Rectangle")).stream().forEach(f -> System.out.println(f));
			//get() 메서드를 통해 키값으로 그룹핑된 stream 객체를 forEach() 메서드로 출력
			
			System.out.println("원 출력");
			map.get(Class.forName("com.hanzyn.section05.sorting.Circle")).stream().forEach(f -> System.out.println(f));
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
