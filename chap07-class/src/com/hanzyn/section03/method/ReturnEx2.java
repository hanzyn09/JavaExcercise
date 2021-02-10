package com.hanzyn.section03.method;

public class ReturnEx2 {

	public static void main(String[] args) {
		
		Return2 obj = new Return2();
		
		obj.getTest(0);
		obj.getTest(1);
		
		System.out.println(obj.getName(0));
		System.out.println(obj.getName(1));
	}

}

class Return2 {
	
	void getTest(int type) {
		System.out.println("getTest() 메서드 시작");
		
		if (type == 1) {
			return; //리턴 값이 없으면 메서드 종료.
		}
		
		System.out.println("getTest() 메서드 끝");
	}
	
	String getName(int type) {
		
		if (type == 1) {
			return ""; //빈 문자열을 리턴하고 메서드 종료.
		}
		return "홍길동"; //리턴 값은 유일하게 한 개.
	}
}
