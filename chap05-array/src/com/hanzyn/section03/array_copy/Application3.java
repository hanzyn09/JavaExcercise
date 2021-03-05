package com.hanzyn.section03.array_copy;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {
		/*
		 * 깊은 복사
		 * 깊은 복사는 heap 에 생성된 배열이 가지고 있는 또 다른 배열에 복사를 해놓은 것이다.
		 * 서로 같은 값을 갖고 있지만, 두 배열은 서로 다른 배열이기에
		 * 하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지않는다.
		 * 
		 * 깊은 복사를 하는 방법 4가지
		 * 1.  for 문 이용하여 동일한 인덱스의 값 복사
		 * 2.  Object의 clone() 메서드를 이용한 복사
		 * 3.  System의 arraycopy()를 이용한 복사
		 * 4.  Arrays의 copyOf()를 이용한 복사
		 * 
		 * */ 

		// 원본 배열 할당 및 초기화
		int[] originArr = new int[] {1,2,3,4,5};
		print(originArr);
		
		/* 1. for문을 이용한 동일한 인덱스 값 복사 */
		int[] copyArr1 = new int[10];
		for(int i = 0; i<originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		print(copyArr1); //원본 배열과 복사한 값을 가지고 나머지 인덱스는 다른 값, 다른 주소를 갖는다.
		
		
		
		/* 2. object의 clone()메서드를 이용한 복사 */
		int[] copyArr2 = originArr.clone(); // clone : 동일한 길이, 값을 갖는 배열 생성-복사, 다른 주소.
		print(copyArr2); //주소는 다른데, 값의 위치나 길이가 같다. : deepCopy 중 유일함
		
		
		
		/* 3. System 클래스의 arraycopy()를 이용한 복사 */
		int[] copyArr3 = new int[10];
						//원본배열,복사시작할 인덱스,복사본배열,복사를시작할인덱스,복사할 길이
		System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
		print(copyArr3); //복사한 만큼의 값은 같지만, 길이와 주소는 다르다.
		
		
		
		/* 4. Arrays의 copyOf()를 이용한 복사 */
		int[] copyArr4 = Arrays.copyOf(originArr, 7);
		print(copyArr4); //복사한만큼의 값은 같지만, 길이와 주소는 다르다.
		
		
	}

	public static void print(int[] iarr) {
		//전달받은 배열의 해쉬코드 출력
		System.out.println("iarr의 해쉬코드 : "  + iarr.hashCode());
		
		for(int i = 0 ; i<iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}System.out.println();
	}
}
