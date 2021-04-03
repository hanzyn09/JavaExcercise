package com.hanzyn.section03.filtering;
/*
 * 데이터 분석, 가공, 축소 : Reduction
 * ==> 데이터의 합계, 평균, 갯수, 최대/최솟값이 reduction의 결과.
 * 이런 결과를 얻기 위해 중간 처리 작업이 필요한데,
 * 
 * 중간처리작업은 Filtering, Mapping, Sorting, Grouping이 있다.
 * 이런 작업을 통해 스트림을 가공할 수 있다.
 * */

import java.util.Arrays;
import java.util.List;

public class FilterStream {
/*
 * 스트림 내의 요소를 걸러내는 기능.
 * 주요 메서드
 * : 중복을 제거해주는 distinct() 와 filter() 메서드 == 둘 다 Stream 객체가 갖고 있는 공통 메서드
 * 
 * distinct() : 중복 제거
 * filter() : 스트림의 각 요소를 1개씩 입력받아서 boolean을 리턴하는 표현식을 이용해서 true 를 리턴하는 데이터만 모아서 새로운 스트림을 생성해서 리턴.
 * 		조건에 맞는 요소를 선택한다.
 * */
	public static void main(String[] args) {
		//list 객체 생성
		List<String> list = Arrays.asList("홍길동", "김유신", "홍길동", "이순신", "홍길동", "유관순");
		
		//distinct() 메서드로 중복 제거 후 내부 반복자로 출력
		System.out.println("distinct()");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		//"홍"으로 시작하는 문자열로 필터링 후 내부 반복자로 출력
		System.out.println("filter()");
		list.stream().filter(n->n.startsWith("홍")).forEach(n->System.out.println(n));
		System.out.println();
		
		//중복 제거 후 "홍"으로 시작하는 문자열 내부 반복자로 출력
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n->n.startsWith("홍")).forEach(n->System.out.println(n));
	}
}
