package com.hanzyn.section05.sorting;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/*
 * 스트림API는 요소들의 최솟값, 최댓값, 합계, 평균값, 갯수를 구할 수 있는 메서드를 제공한다.
 * 이 메서드들 중 합계와 갯수를 구해주는 메서드 외의 나머지 메서드들은 모두 Optional 로 시작하는 타입으로 리턴한다.
 * */
public class StreamOptional {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
		}
		
		//리턴값 long
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : " + count);
		
		//리턴값 int
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : " + sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 : " + first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최댓값 : " + max.getAsInt()); 
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최솟값 : " + min.getAsInt());
		 
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균값 : " + avg.getAsDouble());
	}

}
