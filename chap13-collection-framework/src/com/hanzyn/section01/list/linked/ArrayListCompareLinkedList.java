package com.hanzyn.section01.list.linked;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * LinkedList
 * ArrayList와 마찬가지로 list 인터페이스를 구현한 클래스.
 * 메서드가 유사하고 사용방법이 같은데, 내부적으로 구현방법의 차이가 있다.
 * 
 * 두 자료구조 모두 참조자료형이지만,
 * ArrayList와 같은 배열 형태의 자료구조는 인덱스를 기반으로 데이터가 연속적으로 존재하고
 * LinkedList는 데이터끼리 서로 연결된 형태로 존재한다.
 * 
 * 어레이의 경우 중간에 새로운 값을 추가/삭제 시 데이터를 복사하는 과정이 필요한데,
 * 링크드리스트는 참조하는 주솟값만 수정하면 되므로 처리속도가 빠르다.
 * 
 * 자바에서의 LinkedList는 단순한 링크드리스트가 아니라, 속도향상을 위해
 * 이중 원형 LinkedList 구조로 되어있다.
 * 다음 요소 참조 기능외에도 이전 요소도 참조하며,
 * 마지막 요소는 첫번째 요소를 참조한다.
 * */

/*
 *  ArrayList : 인덱스 기반 == 읽기성능 빠름 == 추가/삭제 성능이 비효율적 : 데이터의 갯수가 변하지 않는 경우
 *  LinkedList : 읽기성능 느림 == 추가/삭제 성능이 효율적 : 데이터의 추가/삭제가 빈번한 경우
 *  
 *  컬렉션 프레임워크에서는 두 클래스들 간의 변환기능을 제공한다 == 혼용사용 가능
 *  
 *  밑의 예제는 두 클래스간의 성능차이를 비교하는 코드이다.
 * */

public class ArrayListCompareLinkedList {
	//단순 추가
	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		LinkedList llist = new LinkedList();
		
		for(int i=0; i<100000; i++) {
			alist.add(i);
			llist.add(i);
		}
		
		System.out.println("ArrayList Access");
		long start = System.currentTimeMillis();
		for(int i=0; i<alist.size(); i++) {
			alist.get(i);
		}
		long end =System.currentTimeMillis();
		System.out.println(end - start);
		
		System.out.println("LinkedList Access");
		start = System.currentTimeMillis();
		for(int i=0; i<llist.size(); i++) {
			llist.get(i);
		}
		end =System.currentTimeMillis();
		System.out.println(end - start);
	}
}
