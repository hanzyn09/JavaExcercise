package com.hanzyn.section01.method;

public class Application7 {

	public static void main(String[] args) {
		/*매개변수의 리턴 값 복합 활용
		 * 
		 * 매개변수도 존재, 리턴값도 존재하는 메서드를 이용해서 간단한 계산기 만들기*/
		int num1 = 10;
		int num2 = 20;
		
		Application7 app7 = new Application7();
		
		System.out.println("sum = " + app7.sum(num1, num2));
		System.out.println("subtract = " + app7.subtract(num1, num2));
		System.out.println("multiple = " + app7.multiple(num1, num2));
		System.out.println("division = " + app7.division(num1, num2));

	}

	public int sum(int first, int second) {
		return first + second;
	}
	public int subtract(int first, int second) {
		int sub = first - second;
		return sub;
	}
	public int multiple(int first, int second) {
		return first * second;
	}
	public int division(int first, int second) {
		return first / second;
	}
	
	
}
