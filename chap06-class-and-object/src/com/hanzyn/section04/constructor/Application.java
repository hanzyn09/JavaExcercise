package com.hanzyn.section04.constructor;

public class Application {
	public static void main(String[] args) {

		/*
		 * 객체를 생성했을 때 썼던 코드를 확인해보면
		 * 클래스명 레퍼런스변수 = new 클래스명(); 이렇게 객체를 생성했을 것이다.
		 * --> new 연산자 뒤에 클래명은 사실 생성자(Constructor)라 불리는 메소드를 
		 *     호출하는 구문이다.
		 *     -> 클래스명 레퍼런스변수 = new 생성자(); 라고 표현한다.
		 *     
		 * 생성자란?
		 * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
		 * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
		 * 기본생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고
		 * 사용할 수 있었다.
		 * 
		 * 
		 * */
		/* 기본생성자 호출하여 인스턴스 생성 후 필드값 출력 */
		User user1 = new User();
		System.out.println(user1.getInformation());
		
		User user2 = new User("user01","pass01","홍길동");
		System.out.println(user2.getInformation());
		
		// Date클래스는 날짜관련된 정보를 다를때 사용하는 클래스
		// 기본생성자로 인스턴스를 생성하면 현재 프로그램이 동작하는 운영체제 상의 
		// 날짜/시간 정보를 이용해 인스턴스를 생성한다.
		User user3 = new User("user02","pass02","이순신",new java.util.Date());
		System.out.println(user3.getInformation());
		
		/* 복사 생성자를 호출하여 인스턴스 생성 후 필드값 출력 */
		User user4 = new User(user3);
		System.out.println(user4.getInformation());
	}
}