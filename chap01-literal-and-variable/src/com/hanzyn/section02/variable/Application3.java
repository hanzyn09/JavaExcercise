package com.hanzyn.section02.variable;

public class Application3 {

	public static void main(String[] args) {
		
		/**************** 변수 선언 규칙 ********************/
		//동일한 범위 내에서 같은 변수명을 가질 수 없다.
		int age_1 = 20;
		//int age=30;
		
		//예약어는 변수명으로 사용 할 수 없다.
//		int class = 10;
//		int static;
//		int void;
//		int public;
//		int int;
//		int package; 
		//int true = 1;
		//int for = 20;
		
		//변수명은 대소문자를 구별한다.
		int age = 10; //그렇지만 변수명의 첫글자는 소문자. 
		int Age = 20; //클래스명만 대문자로 시작
		
		//변수명은 숫자로 시작 할 수 없다.
		//int 123;
		int age1=10; //숫자가 도중에 삽입된 경우는 가능.
		
		//특수기호는 _, $ 만 가능하다.
		int ag_g;
		int $ag$;
		//int #age;
		
		//변수명의 길이 제한은 없지만 적당히 써야한다.==간단명료
		int aklaklaklaklaklaklaklaklaklakl;
		
		//변수명이 합성어면 첫 단어는 소문자, 두번째 단어는 대문자로 시작
		int userNum;
		int minAge=10;
		int maxAge=30;
		
		//언더바는 단어와 단어사이의 연결시에 사용하지 않음. 
		int user_name; //되지만 쓰지않음
		int userName; //이것을 더 선호
		
		//한글로 변수명을 선언해도 된다.
		int 이름; //하지만 사용하지 않는다.
		
		//변수가 가지는 의미를 명확하게 표현
		String s; //의미를 유추하기 어려움
		String name; //이름을 의미한다는 걸 알 수 있다.
		
		//변수명은 명사형태로 작성한다. 메서드는 동사형태(기능)
		String goHome; //기능으로 취급
		String home; //추천
		
		//전형적인 변수명을 우선적으로 사용
		int sum = 0;
		int min = 1;
		int max = 10;
		int count = 1;
		
		//boolean값은 긍정 의문문 형태로 작성
		boolean isAlive = true; //선호
		boolean isDead = false;
		/**************************************************/
		
		/************** 상수 선언 규칙 ***********************/
		//상수는 변하지 않는 값, 한번 정하면 바꿀 수 없다.
		//final 을 붙여줘야 한다.
		final int AGE;
		
	}

}
