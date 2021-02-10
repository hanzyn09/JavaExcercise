package com.hanzyn.section02.field;

public class LocalValEx {

	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name); //null
		
		local.process();
		System.out.println(local.name); //process 안에서 name이 선언됐으므로 출력 됨.
		
		
		local.printAge1();
		local.printAge2();
		
		for (int i=0; i<10; i++) {
			int temp = 0;
			temp += 10;
		}
		//System.out.println(temp); //temp는 for문 안에서만 사용되는 지역변수.
	}

}

class Local {
	
	String name;
	
	void process() {
		name = "홍길동";
	}
	
	void printAge1() {
		int age = 20;
		System.out.println(age);
	}
	
	void printAge2() {
		int age =30;
		System.out.println(age);
	}
}

