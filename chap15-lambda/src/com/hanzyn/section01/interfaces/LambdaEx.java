package com.hanzyn.section01.interfaces;

/*
 *인터페이스 변수 = 람다식;
 *
 * 람다식이 인터페이스에 대입되는 구조.
 * 이 구조가 앞에서 배운 익명 구현 객체를 생성하는 것이 된다.
 * 인터페이스는 직접 객체를 생성할 수 없고 구현 클래스로만 객체를 생성할 수 있는데 이 람다식이 구현 클래스의 객체를 생성하는 역할을 한다.
 * 
 * 자바의 모든 인터페이스를 람다식을 이용해서 객체를 생성할 수 있는 것은 아니다.
 * 인터페이스 중 단 하나의 추상메서드만 갖고 있는 인터페이스만 람다식으로 객체를 생성 할 수 있다.
 * 추상 메서드가 한개만 존재하기 때문에 이름없는 메서드 형태로 선언이 가능하다.
 * 만약 인터페이스에 메서드가 두 개 이상이라면 람다식 표현을 사용할 수 없다.
 * 이러한 인터페이스를 함수적 인터페이스 (Functional Interface) 라고 부른다.
 * 
 * */
public class LambdaEx {
	public static void main(String[] args) {
		LambdaInterface li = () -> { //여기서 print() 함수를 재정의한 것
			String str = "메서드 출력";
			System.out.println(str);
		};
		li.print();
	}
}
interface LambdaInterface{
	void print();
	//void print2(); //오류발생
}
