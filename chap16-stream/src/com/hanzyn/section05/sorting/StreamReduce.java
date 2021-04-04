package com.hanzyn.section05.sorting;

import java.util.Arrays;
import java.util.List;

/*
 * 사용자 집계 메서드
 * 
 * 스트림에서 기본적으로 제공되는 집계메서드 외에 사용자가 다양한 집계 결과물을 생성할 수 있는 reduce() 메서드가 제공된다.
 * reduce() 메서드는 매개변수 타입 XXXOperator 를 이용하여
 * Stream, IntStream, LongStream, DoubleStream 을 전달해준다.
 * */
public class StreamReduce {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		double areaSum = list.stream().mapToDouble(Shape::area).sum();
		System.out.println("sum() 을 이용한 면적 합계 : " + areaSum);
		areaSum = list.stream().mapToDouble(Shape::area).reduce((a, b) -> a+b).getAsDouble();
		System.out.println("reduce(Operator) 를 이용한 면적 합계 : " + areaSum);
		
		areaSum = list.stream().mapToDouble(Shape::area).reduce(0, (a,b)-> a+b);
		System.out.println("reduce(0, operator) 를 이용한 면적 합계 : " + areaSum);
		
	}
}
