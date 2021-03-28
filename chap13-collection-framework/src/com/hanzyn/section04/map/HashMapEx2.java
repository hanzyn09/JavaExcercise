package com.hanzyn.section04.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//key값 가져오기 예제
public class HashMapEx2 {
	public static void main(String[] args) {
		//Map 객체 생성
		Map map = new HashMap();
		
		//이름이 담긴 문자열 배열 생성
		String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
		//숫자가 담긴 정수 배열 생성
		int[] nums = {1234, 4567, 2350, 9870, 2345};
	
		//map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//map 객체에 key 만 조회
		Set<String> keys = map.keySet(); //keySet() : map 객체의 key들만 조회하는 메서드, key 는 중복불가여서 Set 객체로 리턴.
		for(String key : keys) {
			System.out.println(key + " = " + map.get(key));
		}
		System.out.println("Iterator로 출력");
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			String a = (String)it.next();
			System.out.println(a + " = " + map.get(a));
		}
	}
}
