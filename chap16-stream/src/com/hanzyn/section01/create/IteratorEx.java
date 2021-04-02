package com.hanzyn.section01.create;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"홍길동", "김유신", "이순신", "유관순"}); //문자열 배열을 컬렉션 프레임워크(List)로 변환
		
		System.out.println("for문 이용");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { //요소를 읽어오는 표준화 클래스 이용
			System.out.println(it.next());
		}
		
		System.out.println("내부 반복자 이용");
		list.stream().forEach(s->System.out.println(s)); //매개변수로 함수형 인터페이스 구현
	}
}
