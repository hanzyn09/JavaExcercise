package com.hanzyn.section04.array_sort;

public class Application2 {

	public static void main(String[] args) {
		/* 순차 정렬
		 * 
		 * 순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘 
		 * 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
		 * */
		
		//초기 배열 선언 및 초기화
		int[] iarr = {2, 5, 4, 6, 1, 3};
		
		//첫번째 인덱스는 비교할 필요가 없어서 1번인덱스부터 비교 시작.
		for(int i=1; i<iarr.length; i++) {
		
			for(int j=0; j<i; j++) {
				//오름차순 정렬을 위한 처리
				if(iarr[i] < iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
		
		for(int i : iarr) {
			System.out.print(iarr[i-1] + " ");
		}System.out.println();

	}

}
