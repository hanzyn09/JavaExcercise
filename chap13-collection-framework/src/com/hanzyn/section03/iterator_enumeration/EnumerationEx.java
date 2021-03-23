package com.hanzyn.section03.iterator_enumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationEx {
	/*
	 * Enumeration은 Iterator 인터페이스의 구버전으로, 
	 * Collection 프레임워크 이전에 사용했던 인터페이스 이다.
	 * 
	 * Vector, HashTable 클래스의 객체만 Enumeration 객체로 변환 할 수 있다.*/
	
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0 ; i<=5; i++) {
			v.add(i);
		}
		
		//enumeration으로 출력
		Enumeration e = v.elements();
		System.out.println("Enumeration으로 출력");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//iterator로 출력
		Iterator it = v.iterator();
		System.out.println("Iterator 출력");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*콜렉션 프레임워크가 나오기전 클래스들은 약간 다른 방식으로 요소들을 처리했었는데,
		 * 콜렉션 인터페이스가 추가되고 이 인터페이스의 하위 클래스로 포함되면서
		 * 기존 방식과 콜렉션 인터페이스 방식이 공존하는 형태로 사용이 가능하다.
		 * ==> 기존 소스를 사용하고 있는 경우, 코드의 변경으로 인해 오류가 나지 않게하기 위한 것
		 * ==> 객체지향 프로그래밍의 특징
		 * */
	}
}
