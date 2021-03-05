package com.hanzyn.section03.array_copy;

public class Application1 {

	public static void main(String[] args) {
		/*
		 * 배열의 복사
		 * : 두가지 종류가 있다.
		 * 
		 * 1. 얕은 복사 (shallow copy) 多   : stack의 주솟값만 복사
		 * 2. 깊은 복사 (deep copy)   : heap의 배열에 저장된 값을 복사
		 * 
		 * */
		
		/* 얕은 복사 
		 * stack 에 저장되어 있는 배열의 주솟값만 복사한다는 것
		 * 따라서 두개의 레퍼런스 변수는 동일한 배열의 주솟값만 갖고 있다.
		 * */
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;
		//copyArr은 originArr에 저장된 배열의 주소를 copyArr에도 저장한다,.
		//두개의 레퍼런스 변수는 동일한 주소를 갖고 있다.
		System.out.println(originArr.hashCode());
		System.out.println(copyArr.hashCode());
		
		//원본 배열과 복사본 배열의 값 출력
		for (int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		} System.out.println();
		
		for (int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		} System.out.println();
		
		// 값변경후 결과확인
		//복사본 배열의 값을 변경한건데, 원본 배열에도 영향을 미친다 
		// == 서로 같은 배열을 가리키고 있기때문 !!!
		copyArr[0] = 99;
		for (int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		} System.out.println();
		
		
		
		/**************************************************************/
	}

}
