package com.hanzyn.section05.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

//stream 객체에 해당 요소가 존재하지 않는 경우

public class StreamOptionalNoElem {

	public static void main(String[] args) {
		//요소가 없는 빈 ArrayList 객체 생성
		List<Integer> list = new ArrayList<Integer>();
		
		long count = list.stream().count();
		System.out.println("요소들의 갯수 : " + count);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : " + sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		//요소가 존재하는 경우에만 평균 출력
		if(avg.isPresent()) {
			System.out.println("요소들의 평균 : " + avg.getAsDouble());
		}
		
		//요소값이 없는 경우 기본값 설정
		//OptionalInt max = list.stream().mapToInt(Integer::intValue).max(); //오류
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최댓값: " + max);
		
		//요소값이 없는 경우 기본값 설정
		//OptionalInt min = ist.stream().mapToInt(Integer::intValue).min(); //오류
		int min= list.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("요소들 중 최솟값 : " + min);
		
		//요소가 존재하면 실행
		//OptionalInt first = list.stream().mapToInt(Integer::intValue).findFirst(); //오류
		list.stream().mapToInt(Integer::intValue).findFirst()
				.ifPresent(a -> System.out.println("요소들 중 첫번째 값 : " + a));
		
	}

}
