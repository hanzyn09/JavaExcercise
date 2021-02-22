package com.hanzyn.section03.api_scanner;

import java.util.Scanner;

public class Application1 {

	//java.util 안에 Scanner 라는 클래스가 있다.
	//다양한 자료형 값 입력 받기 ==> 콘솔화면에 값을 입력 받아 출력해보기
	//non static method ==> 객체 생성 
	
	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력 받기 :  nextLine()
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("입력하신 이름은 : " + name + "입니다.");
		
		//정수형을 입력 받기 : nextInt()
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("입력하신 나이는 : " + age + "입니다.");
		
		//long형을 입력 받기 : nextLong()
		System.out.println("금액을 입력하세요 : ");
		long money = sc.nextLong();
		System.out.println("입력하신 금액은 : " + money + "원 입니다.");

		//실수형 입력 받기 : nextFloat()
		System.out.println("키를 입력하세요 : ");
		float height = sc.nextFloat();
		System.out.println("입력하신 키는 : " + height + "cm 입니다.");
		
		//더블형 입력 받기 : nextDouble()
		System.out.println("원하는 실수를 입력하세요 : ");
		double number = sc.nextDouble();
		System.out.println("입력하신 실수는 : " + number + "입니다.");
		
		//논리형 입력 받기 : nextBoolean() == 입력받은 값을 boolean 형으로 반환.
		//true or false 외 값이 들어오면 InputMismatchException 발생
		System.out.println("참 과 거짓 중 한 가지를 true or false 로 입력하세요 : ");
		boolean isTrue = sc.nextBoolean();
		System.out.println("입력하신 논리값은 : " + isTrue + "입니다.");
		
		//문자형 (char형)은 입력받는 기능이 따로 없다. 문자열로 들어온 것 중 위치값을 찾아서 쓰도록 돼있다.
		//안 녕 하 세 요; 에서 안 or 요로 찾는 방법은
		//0  1  2 3 4 번째 인덱스를 활용한다. ==> java.lang.String에서 charAt(int index) 메서드 활용.
		//문자열로 입력 받아서,  원하는 순번의 문자를 분리해서 사용 !!!!!!!!!!!!!!!!
		// index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자형으로 반환
		
		sc.nextLine();
		System.out.println("아무 문자나 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0); //첫번째 문자만 가져온다.
		System.out.println("입력하신 문자는 " + ch + "입니다." );
		
		sc.close();
	}

}
