package com.hanzyn.section03.method;

public class ParamEx {

	public static void main(String[] args) {
		
		Param p = new Param();
		
		p.add(10, 5); //int로 넘겨줘야 함.
		p.add2(10, 5); //정수는 실수형으로 자동 형변환이 가능하다. 
		p.add((int)10.5, (int)5.5); //실수형은 정수로 넘겨주기 위해서 강제 형변환이 필요하다.
	}

}

class Param {
	
	//접근제한자 리턴타입 메서드명 (매개변수, ...)
	void add(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}
}