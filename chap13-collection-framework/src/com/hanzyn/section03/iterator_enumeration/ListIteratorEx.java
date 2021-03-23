package com.hanzyn.section03.iterator_enumeration;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Iterator의 장점
 * 1. 모든 컬렉션 프레임워크에 공통적으로 사용할 수 있다.
 * 2. 3 개의 메서드만 알면 되어서 사용하기 쉽다.
 * 3. 인덱스 처리없이 쉽게 데이터에 접근할 수 있다.
 * 
 * Iterator의 단점
 * 1. 대량의 데이터를 처리할 때 속도가 느려진다.
 * 2. 앞에서 뒤까지 단방향으로만 반복이 가능하다.
 * 3. 값을 변경하거나 추가할 수 없다.
 * 
 * ==> 개선하기 위해 ListIterator 라는 Iterator 인터레이스의 하위 인터페이스가 존재
 * 이 인터페이스는 양방향 조회 및 추가, 삭제가 가능하다.
 * */
public class ListIteratorEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i = 0 ; i<=5 ; i++) {
			list.add(i);
		}
		
		//listIterator 객체 생성
		ListIterator lit = list.listIterator();
		//다음 요소 반복 출력
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		//이전 요소 반복 출력
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
