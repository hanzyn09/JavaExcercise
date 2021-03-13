package com.hanzyn.section02.set.hash;

import java.util.HashSet;
import java.util.Set;

/*Set 객체는 중복을 허용하지 않는다, 객체의 추가된 순서와 조회된 순서는 다르다*/

public class HashSetEx {
	public static void main(String[] args) {
		
		//Object 타입의 배열생성
		Object[] arr = {"홍길동", "이순신","홍길동", "이순신", 1, 2, "1", "2"};
		
		//HashSet 객체 생성
		Set set = new HashSet();
		
		//set객체에 배열의 모든 요소 add
		for(int i = 0 ; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set); //[1, 1, 2, 2, 홍길동, 이순신]
	}
}
