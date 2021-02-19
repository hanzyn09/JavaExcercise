package com.hanzyn.section01.method;

public class Application9 {

	public static void main(String[] args) {
		
		// 다른 클래스에 작성한 메서드 호출
		
		// 최댓값, 최솟값을 비교할 수 있는 두 정수를 선언
		int first = 100;
		int second = 50;
		
		/* 두 메서드를 차례로 호출
		 * 
		 * 1. non static 메소드
		 * 클래스가 달라도 사용방법은 동일
		 * 클래스명 사용할이름 = new 클래스명();
		 * 사용할이름.메소드명();
		 * */
		Calculator cal = new Calculator();
		int min = cal.minNumOf(first, second);
		System.out.println("최솟값: " + min);
		
		/* 2. static 메소드는 객체를 생성하지 않아도 호출 가능
		 * 다른 클래스에 작성한 경우에는 반드시 클래스명을 기술해서 호출
		 * 클래스명.메서드명();
		 * */
		int max = Calculator.maxNumOf(first, second);
		//int mx = maxNumOf(first, second); //error
		System.out.println("최댓값: " + max);
		
		
		
		// 주의 !
		/*
		 * static 메서드도 non-static 메서드처럼 호출 가능
		 * 하지만, 권장하지 않음.
		 * ==> 이미 메모리에 로딩된 static 메서드는 여러개의 객체가 공유한다.
		 * 그 때 객체로 접근하게 되면, instance(객체)가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있어서
		 * 사용을 제한해달라는 경고가 뜬다.*/
		//int max2 = cal.maxNumOf(first, second); // 노란 줄: 오작동을 낼 수 있으니 주의하라고 경고
		//System.out.println(max2); // 주솟값 충돌을 일으킬 수 있다.

	}

}
