package com.hanzyn.section02.util;

import java.util.Arrays;

//Arrays 클래스는 클래스 내에서 제공하는 static 메서드를 이용해
//배열의 비교, 정렬 또는 배열의 내용을 특정 값으로 채우고자 하는 일을 수행한다.

public class ArraysEx {

	public static void main(String[] args) {
		String[] arr = {"홍길동", "이순신", "강감찬", "김유신"};
		Arrays.fill(arr, "임꺽정"); //다 임꺽정으로 채운다.
		
		for(String n : arr) System.out.println(n + ", ");
		System.out.println();
		Arrays.fill(arr, 1, 3, "X"); //1~2번 인덱스까지 X로 채운다.
		for(String n : arr) System.out.println(n + ", ");
	}

}
