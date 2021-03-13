package com.hanzyn.section01.list;

import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 프레임워크 
 * : 효율적인 객체의 저장 및 처리를 위해 추가/검색/삭제를 할 수 있는 
 * 다양한 클래스와 인터페이스들의 모임. 인터페이스를 통해 객체처리방식을 정형화했다.
 * 
 * 크게 3가지 종류로 구분하고, 각 종류별로 인터페이스를 정의할 수 있다.
 * List와 Set 인터페이스는 Collection 인터페이스라는 공통적인 인터페이스로 정의할 수 있다.
 * == 유사한 부분이 많다
 * Map은 Collection 인터페이스의 하위 클래스로 정의할 수 없다.
 * 
 * 인터페이스와 다형성, 객체지향에 대한 이해를 명확하게 알게 해주는 개념.
 */


public class ListEx {
	/* [Collection]
	 * List
	 * : 데이터의 저장되는 순서 유지, 중복 저장 가능 
	 * 주요 클래스
	 * : ArrayList, Stack, Vector, LinkedList
	 * 하위 인터페이스
	 * : Queue
	 * 자주 쓰이는 메서드
	 *  : add, contains, set, get, indexOf, clear, remove
	 * 
	 * 길이를 자유롭게 변경할 수 있는 객체.
	 * 저장순서유지 == 인덱스를 통해 원하는 객체에 직접 검색 가능
	 * 
	 * */
	
	/*
	 * ArrayList
	 *  : 데이터를 연속적으로 순서대로 저장
	 *  접근 속도는 빠르지만 중간에 있는 데이터를 삭제/삽입할 경우 LinkedList보다 느리다.
	 * 
	 * LinkedList
	 *  : 데이터를 순서와 상관없이 다음 데이터의 참조를 기억해서 순서대로 저장
	 *  중간에 삽입/삭제 시 ArrayList보다는 빠르지만 데이터를 순회하는 속도는 느리다.
	 *  
	 *  Stack : LIFO
	 *  Queue : FIFO
	 *  */
	public static void main(String[] args) {
		List list = new ArrayList(); //가장 많이 쓰는 리스트 객체
		//List 인터페이스는 직접 객체를 생성할 수 없고, 이 인터페이스를 구현한 ArrayList로 객체를 생성한 것
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list); //toString() 메서드의 재정의 확인 가능
		
		for(int i = 0 ; i<list.size(); i++) { //size(). 어레이는 length
			System.out.println(i + ":" + list.get(i));
		}
	}
}
