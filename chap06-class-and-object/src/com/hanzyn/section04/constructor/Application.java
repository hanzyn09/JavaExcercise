package com.hanzyn.section04.constructor;

public class Application {
	public static void main(String[] args) {
		/*
		 * 객체를 생성했을 때 코드
		 * 클래스명 레퍼런스 변수 = new 클래스명();
		 * 
		 * ==> new 연산자뒤의 클래스명은 사실, 생성자(Constructor) 라 불리는 메서드를 호출하는 구문.
		 * 클래스명 레퍼런스 변수 = new 생성자();
		 * 
		 * 생성자란?
		 * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리작성해주고,
		 * 인스턴스를 생성 할 때 호출된다.
		 * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 한다.
		 * 기본생성자는 컴파일러에 의해 자동으로 추가된다.
		 * */
		
		User user1 = new User();
		System.out.println(user1.getInformation()); //기본값은 null
		
		User user2 = new User( "hong", "user1", "pass1");
		System.out.println(user2.getInformation());
		
		User user3 = new User( "gil", "user2", "pass2", new java.util.Date());
		System.out.println(user3.getInformation());
		
		User user4 = new User(user3);
		System.out.println(user4.getInformation());
	}
}
