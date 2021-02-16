package com.hanzyn.section05.array;

public class Lion extends Animal {

	Lion(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name+ "은(는) 숲 속에서 잠을 잔다.");
	}
	
}
