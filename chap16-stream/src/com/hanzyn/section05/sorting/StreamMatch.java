package com.hanzyn.section05.sorting;

import java.util.Arrays;
import java.util.List;

/*
 * 요소 조건 검사
 * : 스트림 내부 요소들이 특정 조건을 만족하는지 검사하는 메서드
 *  allMatch(Predicate P), anyMatch(), noneMatch()
 *  */
public class StreamMatch {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		//모든 요소들이 Shape 인스턴스(객체)인지 조건 비교
		boolean result = list.stream().allMatch(a-> (a instanceof Shape));
		System.out.println("모든 요소는 shape의 객체이다 -> " + result);
		
		//요소들 중 하나이상의 Rectangle 객체인지 조건 비교
		boolean result2 = list.stream().anyMatch(a-> (a instanceof Rectangle));
		System.out.println("요소 중 Rectangle의 객체가 존재한다 -> " + result2);
		
		//모든 요소가 Circle의 객체라는 조건에 해당하지 않는지 비교
		boolean result3 = list.stream().noneMatch(a-> (a instanceof Circle));
		System.out.println("모든 요소 중 circle의 객체가 존재하지 않는다 -> " + result3);
	}

}
