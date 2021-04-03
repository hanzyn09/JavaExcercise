package com.hanzyn.section05.sorting;

import java.util.Arrays;
import java.util.List;

/*
 * 요소 전체를 반복하는 메서드는 forEach(), peek() 이 있다.
 * 
 * forEach() : 최종 단계 반복
 * peek() : 중간 처리 반복자로, 중간 단계에서 전체요소를 반복하며 추가 작업을 하기위해 사용된다.
 * 	그래서 최종 처리 메서드가 호출돼야 작동한다.
 * */
public class StreamPeek {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		//list.parallelStream().mapToDouble(a-> a.area()).peek(a->System.out.println(a));
		//이대로는 출력되지 않는다. peek() 은 중간단계 메서드여서, 최종 처리 메서드가 호출되어야만 동작 된다.
		
		list.parallelStream().mapToDouble(a-> a.area()).peek(a->System.out.println(a)).sum();
		//중간 처리 결과가 보여진다.
		/*
		 * sum() 메서드는 DoubleStream 클래스에 있는 메서드로, 
		 * mapToDouble() 메서드에 의해 DoubleStream 타입으로 변환되고,
		 * 마지막으로 최종 처리 메서드인 sum() 메서드가 호출되어서 각각의 요소들이 출력된다.
		 * 
		 * 단, forEach()는 최종처리반복자이므로 sum()메서드는 호출 할 수 없다.*/
	}
}
