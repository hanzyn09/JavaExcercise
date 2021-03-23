package com.hanzyn.section03.iterator_enumeration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
	/* 
	 * Iterator
	 * : 컬렉션 프레임워크에서 저장되어 있는 각 요소들을 읽어오는 방법을 표준화한 인터페이스 중 하나
	 * 모든 컬렉션 객체는 iterator 객체로 변환할 수 있다.
	 * 자료구조에 포함된 데이터의 모양에 상관없이 다음 데이터를 접근할 수 있도록 만들어주는 포인터로,
	 * 유사한 개념으로 데이터베이스에 cursor 라는 개념이 있다.
	 * 
	 * */
	public static void main(String[] args) {
		Iterator it = null;
		
		List list = new ArrayList();
		Set set = new HashSet();
		
		for(int i = 0 ; i <= 5; i++) {
			list.add(i);
			set.add(i+5);
		}
		
		System.out.println(list);
		System.out.println(set);
		
		//list 에서 iterator 객체로 생성
		it = list.iterator();
		
		//list의 iterator 객체 출력
		System.out.println("List Iterator 출력");
		iteratorPrint(it);
		
		//set 에서 iterator 객체로 생성
		it = set.iterator();
		
		//set의 iterator 객체 출력
		System.out.println("Set Iterator 출력");
		iteratorPrint(it);
		
		System.out.println(list); //remove되어서 빈 collection으로 출력된다.
		System.out.println(set); //remove되어서 빈 collection으로 출력된다.
	}
	
	private static void iteratorPrint(Iterator it) {
		//Iterator 객체 반복(다음 요소가 있으면 반복)
		while(it.hasNext()) { //hasNext() : 읽어올 다음 요소가 있는지 여부
			//iterator 객체의 다음 요소를 읽어와서 출력
			System.out.println(it.next()); //next() : 다음 요소를 읽어 옴. hasNext를 먼저 써줘야 에러 방지가능.
			
			//현재 요소 삭제
			it.remove();
		}
	}
}
