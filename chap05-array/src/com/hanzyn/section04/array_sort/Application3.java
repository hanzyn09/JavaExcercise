package com.hanzyn.section04.array_sort;

public class Application3 {

	public static void main(String[] args) {
		/*선택정렬
		 * 
		 * 배열을 전부 탐색하여 최솟값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		 * 데이터의 양이 적을 때 좋은 성능을 나타냄 (교환 횟수가 적음)
		 * 하지만, 배열을 전부 탐색하여 최솟값을 찾아야 하기 때문에
		 * 100개이상의 자료에서는 급격하게 속도가 저하된다.
		 * */

		//초기배열을 선언 및 초기회
		int[] iarr = {2,5,4,6,1,3};
		
		int min; //최솟값을 가진 데이터의 인덱스를 저장하는 변수
		
		int temp;
		
		for(int i = 0; i < (iarr.length - 1) ; i++) { //자기 자신을 제외할거라서 -1
			min = i;
			
			for(int j = (i+1) ; j < iarr.length; j++) { //자기 다음번 부터 비교해야한다.
				if(iarr[min] > iarr[j]) {
					
					min = j;
					
				}
			}
			temp = iarr[min];
			iarr[min] = iarr[i];
			iarr[i] = temp;
		}
		
		for(int i : iarr) {
			System.out.print(iarr[i-1] + " ");
		} System.out.println();
		
	}

}
