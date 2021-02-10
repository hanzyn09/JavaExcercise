package com.hanzyn.section03.method;

public class ReturnEx {

	public static void main(String[] args) {
		
		Return obj = new Return();
		
		String name = obj.getName();
		int age = obj.getAge();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

}

class Return {
	
	String getName() {
		return "홍길동";
		//리턴값은 있을 수도, 없을 수도 있음(void)
		//리턴 타입을 지정했으면 반드시 리턴 값을 지정해야 함.
	}
	
	int getAge() {
		return 25;
	}
}