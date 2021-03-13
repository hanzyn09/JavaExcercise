package com.hanzyn.section01.list;

import java.util.List;
import java.util.ArrayList;

public class ListEx3 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Circle(3.0));
		list.add(new Rectangle(3, 4));
		list.add(new Circle(5));
		list.add(new Rectangle(5, 6));
		
		System.out.println(" 전체 도형의 면적의 합 : " + getArea(list));
		System.out.println(" 전체 도형의 둘레의 합 : " + getLength(list));
	}
	
	private static double getLength(List list) {
		double value = 0;
		
		for(int i = 0; i<list.size(); i++) {
			
			//list 객체 형변환
			Shape s = (Shape)list.get(i); //인덱스의 객체를 리턴하는 메서드.
			//리턴타입이 Object 여서 Shape로 강제형변환을 했다.
			value += s.length(); //다형성. 원/사각형의 length가 호출된다.
		}
		
		return value;
	}
	
	private static double getArea(List list) {
		double value = 0;
		
		for(int i=0 ; i < list.size() ; i++) {
			//list 객체 형변환과 메서드 호출을 동시에
			value += ((Shape)list.get(i)).area(); //우선순위에 따른 괄호적용 주의
		}
		
		return value;
	}
}
