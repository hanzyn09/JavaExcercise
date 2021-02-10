package com.hanzyn.section01.object;

//자신의 객체를 생성할 경우
public class MemberMain2 {

	public static void main(String[] args) {
		
		MemberMain2 m1 = new MemberMain2();
		MemberMain2 m2 = new MemberMain2();
		
		if (m1 == m2) {
			System.out.println("m1 and m2 are same.");
		} else {
			System.out.println("m1 and m2 are not same.");
		}

	}

}
