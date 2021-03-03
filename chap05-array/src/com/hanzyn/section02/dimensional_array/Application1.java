package com.hanzyn.section02.dimensional_array;

public class Application1 {

	public static void main(String[] args) {
		// 다차원 배열 : 2차원 이상의 배열을 의미
		// 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미.
		
		// 2차원 배열을 사용하는 방법 
		/*
		 * 1. 배열의 주소를 보관할 참조 변수 선언 (stack)
		 * 2. 여러개의 일차원 배열의 주소를 관리하는 배열을 생성 (heap) -- new 연산자 활용
		 * 3. 각 인덱스에서 관리하는 배열을 할당 (heap) 하여 주소를 보관하는 배열에 저장
		 * 4. 생성한 여러개의 1차원 배열에 차례로 접근해서 사용
		 * */

		int[][] iarr1;
		int iarr2[][];
		int[] iarr3[];
		
//		iarr1 = new int [][]; // 크기를 지정하지 않으면 에러 발생
//		iarr1 = new int[][5]; // 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 에러 발생
		iarr1 = new int[3][]; //가변 배열
		
		iarr1[0] = new int[5];
		iarr1[1] = new int[5];
		iarr1[2] = new int[5];
		
		System.out.println(iarr1.length); //3
		System.out.println(iarr1[1].length); //5
		
		iarr2 = new int[3][5]; //정변 배열
		
		for(int i = 0; i < iarr1[0].length; i++) {
			System.out.print(iarr1[0][i]+" "); //초기값이 0으로 초기화되어있는 걸 확인할 수 있다.
		}
		
		System.out.println();
		for(int i = 0; i < iarr1[1].length; i++) {
			System.out.print(iarr1[1][i]+" "); //초기값이 0으로 초기화되어있는 걸 확인할 수 있다.
		}
		
		System.out.println();
		for(int i = 0; i < iarr1[2].length; i++) {
			System.out.print(iarr1[2][i]+" "); //초기값이 0으로 초기화되어있는 걸 확인할 수 있다.
		}
		
		/** 위의 반복 식을 이중 포문으로 표현 **/
		System.out.println("\n");
		for(int i = 0 ; i < iarr1.length; i++) {
			for(int j = 0 ; j < iarr1[i].length; j++) {
				System.out.print(iarr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
