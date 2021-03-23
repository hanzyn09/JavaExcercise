package com.hanzyn.section03.iterator_enumeration;

import java.util.ArrayList;
import java.util.Iterator;

/*iterator 객체를 사용해서 
 * 1. list 객체의 모든 요소들을 차례대로 하나씩 출력하거나 처리할 수 있다.
 * 2. for 문을 통해 size() 메서드를 이용해 인덱스로 처리할 수 있다.
 * 
 * 둘 다 완전히 동일한 결과를 나타내지만,
 * 기왕이면 size() 메서드를 활용해서 속도를 빠르게 한다.
 * */
public class IterVSsize {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i<10000000; i++) {
			list.add(i);
		}
		
		//iterator 실행시간
		long start = System.currentTimeMillis();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			it.next();
		}
		long end = System.currentTimeMillis();
		System.out.println("Iterator 소요시간 : " + (end - start));
		
		//size 실행시간 == 더 짧다
		start = System.currentTimeMillis();
		for(int i=0; i<list.size(); i++) {
			list.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("size() 소요시간 : " + (end - start));
	}
}
