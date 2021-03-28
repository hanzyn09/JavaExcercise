package com.hanzyn.section04.map;

import java.util.HashMap;
import java.util.Map;

//map 에 push, get 하기
public class HashMapEx {
	/* [Map]
	 * : 키(Key)와 값(Value) 쌍으로 저장
	 * 주요 클래스
	 * : HashMap, Hashtable, TreeMap, Properties, LinkedHashMap
	 * 
	 * key 와 value는 모두 객체로 이루어지고,
	 * key는 중복이 불가능하고, value는 중복저장이 가능하다.
	 * Map은 데이터를 찾아갈 수 있는 키와 실제 데이터인 밸류를 저장해서 Dictionary라고도 한다.
	 * 
	 * 해쉬 맵 : 키의 순서를 알 수 없다.
	 * 트리 맵 : 키의 순서가 크기 순이다.
	 * 링크드해쉬맵 : 키의 순서가 저장된 순서이다.
	 * 
	 * 저장하고 싶은 데이터 값이 value, 이 값을 가져올 때 필요한 것이 key 이다.
	 * 동일한 키에 데이터를 두번이상 저장하면 두번째 부터는 데이터가 업데이트 된다.
	 * 
	 * */
	
	public static void main(String[] args) {
		//맵 객체 생성
		Map map = new HashMap();
		
		//이름이 담긴 문자열 배열 생성
		String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
		//숫자가 담긴 정수 배열 생성
		int[] nums = {1234, 5678, 2350, 9870, 2345};
		
		//map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//출력
		System.out.println(map);
		System.out.println("홍길동 번호 :  " + map.get("홍길동")); //map.get("") : key 값으로 저장된 객체를 검색하는 메서드.
		System.out.println("이순신 번호 :  " + map.get("이순신")); // "~" 가 key 인 value를 리턴함.
		System.out.println("김유신 번호 :  " + map.get("김유신")); //중복되어서 한개만 저장되므로 새로운 값으로 대체 된다.
	}
}
