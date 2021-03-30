package com.hanzyn.section01.type;

public class GenericEx3 {
	Generic2<String, Integer> gen0 = new Generic2<String, Integer>();
	//gen0.set("홍길동", 1111);
	//gen.set("홍길동", "1111"); //에러
	//System.out.println(gen0.getName() + " : " + gen0.getId());
	
	Generic2<String, String> gen1 = new Generic2<String, String>();
	//gen1.set("홍길동", "1111");
	//System.out.println(gen1.getName() + " : " + gen1.getId());
}

class Generic2<K,V>{
	K name;
	V id;
	
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	
	K getName() {
		return name;
	}
	
	
	V getId() {
		return id;
	}
}

