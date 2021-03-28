package com.hanzyn.section04.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//value 값 가져오기 예제
public class HashMapEx3 {
	public static void main(String[] args) {
		//map 객체 생성
		Map map = new HashMap();
		
		//이름이 담긴 문자열 배열 생성
		String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
		//숫자값이 담긴 정수 배열 생성
		int[] nums = {1234, 4567, 2350, 9870, 2345};
		
		//map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
		for(int i = 0 ; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//map 객체에서 value 들만 조회하기
		Collection values = map.values(); //value() : value 값 조회하는 메서드
		/*values는 중복이 안되야한다는 보장도 없고, 저장된 순서를 유지하지 않는다.
		 * 그러므로 map 인터페이스의 values() 메서드의 리턴 타입은 Set이나 List가 아닌 Collection 타입으로 리턴한다.*/
		
		//향상된 for문으로 출력
		for(Object obj : values) {
			System.out.println(obj);
		}
		
		//Iterator 객체로 출력
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
