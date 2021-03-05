package com.hanzyn.section03.array_copy;

public class Application4 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1.clone();
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] += 10;
		}
		
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}System.out.println();
		
		/* 향상된 for 문 : JDK 1.5 ver 부터 추가
		 * 배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행함
		 * 
		 * 주의 !!!
		 * 배열에 인덱스에 차례로 접근할 때에는 편하게 사용할 수 있지만,
		 * 값을 변경할 수는 없다.
		 * == 변경하는 목적이 아니고, 사용하는 것이 목적이라면 편하게 사용할 수 있다.
		 * */
		for(int i : arr2) {//int i 가 임시 변수 , arr2는 접근 할 배열
			i += 10; //해당 인덱스에 값을 추가하는 중
		}
		
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}System.out.println();
		//값이 증가되어있지 않다 : 인덱스에 접근해서 값을 변경한게 아니라 꺼낸 값을 복사해서 쓴 것
		
		
		for(int i : arr2) {
			System.out.println(i + " "); //인덱스에 접근
		}System.out.println();
		

		
	}

}
