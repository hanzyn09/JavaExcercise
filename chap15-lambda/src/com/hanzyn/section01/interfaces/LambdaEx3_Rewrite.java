package com.hanzyn.section01.interfaces;

//매개변수가 한개, 리턴값이 없는 람다식

public class LambdaEx3_Rewrite {
	public static void main(String[] args) {
		LambdaInterface3 li3 = (String name) -> {
			System.out.println("제 이름은 " + name + "입니다.");
		};
		
		/*동일한 코드*/
		LambdaInterface3 li3_1 = (name) -> { //매개변수의 자료형 생략
			System.out.println("제 이름은 " + name + "입니다.");
		};
		/*동일한 코드*/
		LambdaInterface3 li3_2 = name -> { //괄호 생략
			System.out.println("제 이름은 " + name + "입니다.");
		};
		/*동일한 코드*/
		LambdaInterface3 li3_3 = name -> System.out.println("제 이름은 " + name + "입니다."); //중괄호 생략
		
		li3.print("홍길동");
		li3_1.print("홍길동");
		li3_2.print("홍길동");
		li3_3.print("홍길동");
	}
}

@FunctionalInterface
interface LambdaInterface3{
	void print(String name);
}