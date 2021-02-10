package com.hanzyn.section02.variable;

/*변수 선언(초기화)*/
public class Application1 {
	
	
	public static void main(String[] args) {
	
		
		System.out.println("=============== 급여와 보너스 계산 ============");
		System.out.println("이번 달 급여 : " + (1000000 + 200000) + "원");
		
		int salary = 1000000; 
		int bonus = 200000;   
		
		System.out.println("이번 달 급여 : " + (salary + bonus) + "원"); //괄호가 없으면 각자의 값이 출력 된다.
		
		System.out.println("================ 보너스 연속 출력 ================");
		
		int point = 100;
		System.out.println("1번 근무자 보너스: " + point + "원");
		System.out.println("2번 근무자 보너스: " + point + "원");
		System.out.println("3번 근무자 보너스: " + point + "원");
		System.out.println("4번 근무자 보너스: " + point + "원");
		System.out.println("5번 근무자 보너스: " + point + "원");
	
		
		
		System.out.println("=============== 변수 지정 후 연산 ==================");
		
		int sum = 0;
		
		sum = sum + 10;
	  
		System.out.println("sum = sum + 10 한 결과는: " + sum);
		
		
		sum = sum + 10;
		System.out.println("sum = sum + 10 한 결과는: " + sum);		
		
		
	}
}
