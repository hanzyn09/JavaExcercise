package com.hanzyn.section02.set.hash;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		//HashSet 객체 생성
		Set set = new HashSet();
		
		//문자열 객체 두개 추가
		set.add(new String("abc"));
		set.add(new String("abc"));
		
		//member 객체 두개 추가 (사용자 정의 클래스)
		set.add(new Member("홍길동", 40));
		set.add(new Member("홍길동", 40)); //객체는 중복으로 인식되지 못한다.
		//객체의 중복을 걸러내려면 equals 메서드와 hashCode로 검증할 수 있다.
		//두 메서드를 오버라이딩 해서 확인한다.
		set.add(new Member("고길동", 40)); //다른 객체로 인식

		
		System.out.println(set); 
		//[abc, (홍길동, 40), (홍길동, 40)]
		//[abc, (홍길동, 40)]

	}
}
