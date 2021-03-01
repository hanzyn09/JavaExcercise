package com.hanzyn.section01.lang.object.clone;

/*
 * clone : 객체를 복제하기 위한 메서드. 원본 객체의 필드값과 동일한 값을 갖는 새로운 객체를 새로 생성.
 * */
public class CloneEx {

	public static void main(String[] args) {
		String[] arr = {"홍길동", "이순신", "김유신", "안중근"};
		String[] arr2 = arr.clone();
		
		System.out.println(arr == arr2); //다른 주소를 참조하므로 false : 독립적인 변수
		
		for(String v : arr2) {
			System.out.println(v);
		}
		
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		System.out.println(arr == arr3);//다른 주소를 참조하므로 false : 독립적인 변수
		
		for(String v : arr3) {
				System.out.println(v);
		}

	}

}
