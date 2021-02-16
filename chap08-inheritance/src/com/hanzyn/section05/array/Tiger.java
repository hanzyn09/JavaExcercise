package com.hanzyn.section05.array;

public class Tiger extends Animal {
		
	Tiger(String type, String name) {
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"은(는) 산 속에서 잠을 잔다.");
	}
}
