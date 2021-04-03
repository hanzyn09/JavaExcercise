package com.hanzyn.section05.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder3 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println("정렬하지 않고 출력");
		list.stream().forEach(System.out::println); //메서드 참조 방식 출력
		
		System.out.println("둘레(length()) 순으로 정렬");
		System.out.println("함수적 인터페이스로 구현");
		list.stream().sorted(
				new Comparator<Shape>() { //comparator 인터페이스 객체를 sorted() 메서드안에서 정의
					@Override
					public int compare(Shape s1, Shape s2) {
						return (int)(s1.length() - s2.length());
					} // 이 안에서 sorting 방식 구현해주면 된다.
				}).forEach(System.out::println); 
		
		System.out.println("람다 표현식을 이용하여 둘레순으로 정렬"); //comparator 인터페이스는 FunctionalInterface이므로 람다표현식으로 정의해도 됨.
		list.stream().sorted(
				(a, b) -> (int)(a.length() - b.length())
				).forEach(System.out::println);
		
	}

}
