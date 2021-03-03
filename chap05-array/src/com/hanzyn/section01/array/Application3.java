package com.hanzyn.section01.array;

public class Application3 {

	public static void main(String[] args) {
		// 기본적으로 배열을 선언하고 할당하고 나면, 배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화 된다.
		// heap 영역에는 값이 없는 빈 공간이 존재할 수 없다.
		
		//값의 형태 별 기본 값
		/*
		 * 정수 : 0
		 * 실수 : 0.0
		 * 논리 : false
		 * 문자 : \u0000
		 * 참조 : null
		 * */

		int[] iarr = new int[5];
		System.out.println(iarr[0]);
		
		int[] iarr2 = {11,22,33,44,55};
		int[] iarr3 = new int[] {11,22,33,44,55};
		
		System.out.println(iarr2.length);
		System.out.println(iarr3.length);
		
		for(int i = 0; i<iarr2.length; i++) {
			System.out.println(iarr2[i]);
		}
		for(int i = 0; i<iarr3.length; i++) {
			System.out.println(iarr3[i]);
		}
		
		//문자열도 배열로 사용할 수 있다.
		String[] sarr = {"apple", "banana", "orange", "grape"};
		for(int i = 0; i<sarr.length; i++) {
			System.out.println(sarr[i]);
		}
	}

}
