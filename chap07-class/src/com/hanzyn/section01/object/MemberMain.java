package com.hanzyn.section01.object;

//다른 클래스의 객체를 생성한다
public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		Member m2 = new Member();
		
		if (m == m2) {
			System.out.println("m1 and m2 are same.");			
		} else {
			System.out.println("m1 an m2 are not same");
		}

	}

}
