package com.hanzyn.section02.util;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		while(true) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			if("".equals(name)) break;
			System.out.println(name + "님 안녕하세요!");
			cnt++;
		}
		System.out.println("총 입력된 회원 수 : " + cnt);
	}

}
