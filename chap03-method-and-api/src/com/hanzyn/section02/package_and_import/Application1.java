package com.hanzyn.section02.package_and_import;

public class Application1 {
	public static void main(String[] args) {
		/*
		 * 패키지와 임포트
		 * 
		 * 패키지 : 서로 관련이 있는 클래스 또는 인터페이스등을 모아서 하나의 묶음(그룹)으로 단위를 구성함.
		 * 		같은 패키지내에서는 동일한 이름의 클래스르 만들 수 없지만, 
		 * 		패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 있다.
		 * 		이전까지 클래스명에 패키지명을 함께 사용하지 않은 이유는 동일한 패키지 내에서 사용했기 때문이다.
		 * 		그렇기 때문에 서로 다른 패키지에 존재하는 클래스를 사용하는 경우에는 
		 * 		클래스명 앞에 패키지명을 명시해야한다.
		 * */
		
		//경로를 명시적으로 써줘야하는 경우도 있다. : 다른 패키지에서 같은 클래스명의 파일을 가지고 있을 때.
		//non-static
		com.hanzyn.section01.method.Calculator calc = new com.hanzyn.section01.method.Calculator();
		
		int min = calc.minNumOf(30, 20);
		System.out.println("30과 20 중 작은 값은? " + min);
		
		//static
		int max = com.hanzyn.section01.method.Calculator.maxNumOf(30, 20);
		System.out.println("30 과 20 중 큰 값은? " + max);
		
	}
}
