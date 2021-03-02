package com.hanzyn.section01.lang.math;
/*
 * 생성자의 접근 제한자가 private이기 때문에 다른 클래스에서 객체 생성을 할 수 없다.
 * 모든 멤버가 static 예약어가 붙어있는 클래스 멤버이므로 Math.멤버명으로 접근할 수 있다.
 * 
 * Math 클래스 안에는 인스턴스 멤버가 하나도 없고,
 * 멤버 중 상수 멤버는 2개고 나머지는 모두 메서드 멤버이다.
 * 또한 final 클래스이므로 다른 클래스에서 상속받을 수 없다.
 * 
 * 상수 멤버는 PI(원주율), E(자연로그) 가 있는데, 상수이기때문에 대문자로 정의되어있다.
 * */
public class MathEx {

	public static void main(String[] args) {

		System.out.println("Math.abs(10) = " + Math.abs(10));
		System.out.println("Math.abs(-10) = " + Math.abs(-10));
		System.out.println("Math.abs(3.141592) = " + Math.abs(3.141592));
		System.out.println("Math.abs(-3.141592) = " + Math.abs(-3.141592));
		
		System.out.println("Math.ceil(5.4) = " + Math.ceil(5.4));
		System.out.println("Math.ceil(-5.4) = " + Math.ceil(-5.4));
		
		System.out.println("Math.floor(5.4) = " + Math.floor(5.4));
		System.out.println("Math.floor(-5.4) = " + Math.floor(-5.4));
		
		System.out.println("Math.max(5,4) = " + Math.max(5,4));
		System.out.println("Math.max(5.3, 5.4) = " + Math.max(5.4, 5.3));
		
		System.out.println("Math.min(5,4) = " + Math.min(5,4));
		System.out.println("Math.min(5.3, 5.4) = " + Math.min(5.3, 5.4));
		
		System.out.println("Math.random() = " + Math.random());
		//0.0 ~ 1.0 미만
		/*
		 * int random0 = random.nextInt(10) + 0; 					//10: 갯수, 0: 시작 수
		 * int random1 = (int) (Math.random() * ((15-10)+1)) + 10; 	// * 갯수, + 시작 수
		 * 
		 * */
		
		System.out.println("Math.rint(5.4) = " + Math.rint(5.4));
		//실수 d와 가장 가까운 정수값을 double로 리턴
		System.out.println("Math.rint(-5.4) = " + Math.rint(-5.4));
		
		System.out.println("Math.round(5.4) = " + Math.round(5.4));
		System.out.println("Math.round(-5.4) = " + Math.round(-5.4));
		//소수점 첫번째 자리에서 반올림해서 정수타입으로 리턴한다.
		

	}

}
