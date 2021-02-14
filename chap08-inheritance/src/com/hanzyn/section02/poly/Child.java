package com.hanzyn.section02.poly;

public class Child extends Parent {
	
	String name;
	
	void run() { //재정의된 메서드
		System.out.println("자식이 달린다.");
	}
	
	void eat() { //추가된 메서드
		System.out.println("자식이 먹는다.");
	}
}
