package com.hanzyn.section01.array;

public class Application1 {

	public static void main(String[] args) {
		/*
		 * 배열이란?
		 * 
		 * 동일한 자료형의 모음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도).
		 * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
		 * */

		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int value = 0;
		
		for(int i = 0 ; i<arr.length; i++) {
			arr[i] = value += 10;
		}
		
		int sum = 0;
		for(int i = 0 ; i<arr.length; i++) {
			sum += arr[i];
		}
	}

}
