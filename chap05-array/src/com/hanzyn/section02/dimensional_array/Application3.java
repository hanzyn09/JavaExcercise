package com.hanzyn.section02.dimensional_array;

public class Application3 {

	public static void main(String[] args) {
		/*이차원 배열 중에서 가변 배열 (dynamic array)을 선언 및 할당하고 차례로 값을 대입 후 출력*/

		/*
		 * 1. 배열의 선언 및 할당
		 * 가변 배열의 경우 : 각 인덱스 별 배열을 따로 할당해야한다.
		 * 선언과 동시에 모든 배열을 할당 할 수 없으며, 할당할 배열의 갯수만 지정하고 
		 * 각 인덱스에 서로 다른 길이의 배열을 따로 할당해야한다.
		 *  자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][];
		 *  변수형[배열 인덱스] = new 자료형[배열의길이];
		 * */
		
		//1. 주소를 관리하는 배열의 주소를 보관하기 위한 변수 선언
		int[][] iarr = new int[3][];
		
		//2. 주소를 관리하는 배열의 각 인덱스마다 배열을 할당하여 주솟값 대입
		iarr[0] = new int[3];
//		iarr[1] = new char[2]; //자료형이 다른 배열은 하나로 묶어서 관리할 수 없다.
		iarr[1] = new int[2];

		int[] arr = new int[5];
		iarr[2] = arr; //미리 할당해 둔 배열을 활용할 수 있다.
		 
		//3. 각 배열의 인덱스마다 접근하여 값을 대입하고 출력
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
//		iarr[0][3] = 4; //ArrayIndexOutOfBoundsException : 존재하지않는 인덱스에 접근하면 예외처리 발생
		
		iarr[1][0] = 4; 
		iarr[1][1] = 5;
		
		iarr[2][0] = 6; //배열이 할당되어 있지 않으면 NullPointerException 발생
		iarr[2][1] = 7;
		iarr[2][2] = 8;
		iarr[2][3] = 9;
		iarr[2][4] = 10;
		
//		iarr[3][0] = 11; //ArrayIndexOutOfBoundsException : 존재하지않는 배열에 접근하는 경우에도 예외처리 발생
		System.out.print(iarr[0][0] + "");
		System.out.print(iarr[0][1] + "");
		System.out.print(iarr[0][2] + "");
		
		System.out.println();
		
		System.out.print(iarr[1][0] + "");
		System.out.print(iarr[1][1] + "");
		
		System.out.println();
		
		System.out.print(iarr[2][0] + "");
		System.out.print(iarr[2][1] + "");
		System.out.print(iarr[2][2] + "");
		System.out.print(iarr[2][3] + "");
		System.out.print(iarr[2][4] + "");
		
		System.out.println();
		
		int value = 0;
		
		for(int i = 0; i<iarr.length ; i++) {
			for(int j = 0; j < iarr[i].length ; j++) {
				iarr[i][j] = ++value;
			}
		}
		
		for(int i = 0; i<iarr.length ; i++) {
			for(int j = 0; j < iarr[i].length ; j++) {
				System.out.print(iarr[i][j] + " ");
			} System.out.println();
		}
		
	}

}
