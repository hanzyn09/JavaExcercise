package com.hanzyn.array.level02;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
		 * 검색할 문자를 하나 입력 받아 
		 * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 문자열을 하나 입력하세요 : helloworld
		 * 검색할 문자를 입력하세요 : l
		 * 
		 * -- 출력 예시 --
		 * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 하나 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("검색할 문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		
		System.out.println("입력하신 문자열 " + str + " 에서 찾으시는 문자 " + ch + "은(는) " + search(str, ch) + "개 입니다.");
	}
	
	public static int search(String str, char ch) {
		
		int size = str.length();
		int count = 0;
		
		char[] carray = new char[size];
		
		for(int i = 0 ; i < carray.length ; i++) {
			carray[i] = str.charAt(i);
		}
		
		for(int i = 0 ; i < carray.length ; i++) {
			if(carray[i] == ch)
				count++;
		}
		
		return count;
	}
}
