package com.hanzyn.section02.package_and_import;

//일반 사용하려는 클래스까지 작성
import com.hanzyn.section01.method.Calculator;
//static import의 경우에는 사용하려는 static 메서드 까지 전부 써준다.
import static com.hanzyn.section01.method.Calculator.maxNumOf;;

public class Application2 {

	public static void main(String[] args) {
		/*
		 * 패키지와 임포트
		 * 
		 * 임포트 : 서로 다른 패키지에 존재하는 클래스를 사용하는 경우
		 * 		패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
		 * 		하지만 매번 다른 클래스의 패키지명까지 기술하기 번거롭다.
		 * 		패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
		 * 		[선언 위치]
		 * 		package 선언문 ---사이에 작성--- class 선언문 
		 * 		ctrl + shift + o 누르면 자동으로 추가된다.
		 * 		빨간 줄에서 선택할 수도 있다.
		 * */
		
		//non static 메서드
		Calculator calc = new Calculator();
		int min = calc.minNumOf(50, 60);
		System.out.println("50 과 60 중 작은 수 : " + min);
		
		//static 메서드
		int max = Calculator.maxNumOf(50, 60); //static의 경우에도 import 필요
		System.out.println("50 과 60 중 큰 수 : " + max);
		
		
		
		//만약 static 메서드를 호출 할 때, 클래스명도 생략하고 사용할 수 있다.
		int max2= maxNumOf(100, 200);
		System.out.println("100과 200 중 큰 수 : " + max2);
		//import static ~경로.메서드명;

	}

}
