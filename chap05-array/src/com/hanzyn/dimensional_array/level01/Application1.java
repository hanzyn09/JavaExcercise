package com.hanzyn.dimensional_array.level01;

public class Application1 {

	public static void main(String[] args) {
		
		/* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
		 * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
		 * 그 값을 출력하는 코드를 작성하시오. 
		 * 
		 * -- 출력 예시 --
		 * 1  2  3  4
		 * 5  6  7  8
		 * 9 10 11 12
		 * 
		 * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
		 * */
		int row = 3, col = 4;
		int num = 1 ;
		int[][] arr = new int[row][col];
		
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
	}

}
