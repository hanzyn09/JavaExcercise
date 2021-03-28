package com.hanzyn.section04.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//(키, 값) 쌍으로 조회하는 예제
public class HashMapEx4 {
	public static void main(String[] args) {
		//map 객체 생성
		Map map = new HashMap();
			
		//이름이 담긴 문자열 배열 생성
		String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
		//숫자가 담긴 정수 배열 생성
		int[] nums = {1234, 4567, 2350, 9870, 2345};
		
		//map 객체에 key, value값을 쌍으로 저장
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//map 객체는 (키, 값) 쌍으로 이루어진 객체들의 모임
		//(키, 값) 쌍으로 조회
		Set entry = map.entrySet(); //entrySet() : 키가 중복이 안되므로, 중복이 허용되지 않음 ==> Set 객체로 리턴
		for(Object o : entry) {
			Map.Entry m = (Map.Entry) o; //(k, v) 쌍인 객체의 자료형 == Map.Entry
			System.out.println("key: " + m.getKey() + ", value : " + m.getValue());
		}
		/*map은 여러개의 데이터가 모아서 하나의 의미를 갖는 데이터를 만들 때 주로 사용한다.*/
	}
}
