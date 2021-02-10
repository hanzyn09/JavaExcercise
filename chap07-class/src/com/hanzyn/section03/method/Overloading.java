package com.hanzyn.section03.method;

//오버로딩: 매개변수를 다양하게 입력받기 위함
//매개변수의 자료형이나, 매개변수의 갯수 중에 하나가 다른데
//이름은 같은 메서드 처리
public class Overloading {

	public static void main(String[] args) {
		
		Operator op = new Operator();
		System.out.println(op.multiply(4,3));
		System.out.println(op.multiply(4.5,3.5));
		System.out.println(op.multiply(4,3.5));
		System.out.println(op.multiply(4.5,3));
		//println도 메서드이다.
		//PrintStream이라는 클래스를 통해 오버로딩된 메서드를 불러온다,
	}

}

class Operator {
	int multiply(int x, int y) {
		System.out.println("(int, int)" );
		return x * y;
	}
	
	double multiply(double x, double y) {
		System.out.println("(double, double)" );
		return x * y;
	}
	
	double multiply(int x, double y) {
		System.out.println("(int, double)" );
		return x * y;
	}
	
	double multiply(double x, int y) {
		System.out.println("(double, int)" );
		return x * y;
	}
}