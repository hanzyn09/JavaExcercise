package com.hanzyn.section01.lang.wrapper;

/*
 * 기본자료형을 객체화 할 수 있는 클래스를 통틀어 Wrapper 클래스라고 한다.
 * 필요한 경우 :  기본자료형 변수를 객체로 처리해야 하는 경우
 * e.g. 다른 메서드에서 매개 변수가 객체로 정의되어 있거나,
 * 		객체로 저장해야 할 때, 객체간의 비교를 할 경우 기본 자료형 값들을 객체로 변환하여 작업을 수행해야한다.
 * 
 * 8개의 기본 자료형 (byte, char, short, int, long, float, double, boolean)을 대표하는
 * 8개의 Wrapper 클래스가 있는데, 이 클래스들을 이용하면 기본 자료형 값을 객체로 처리할 수 있다.
 * 
 * Wrapper 클래스의 이름은 기본자료형 이름의 첫 글자를 대문자로 한 것이다.
 * 
 * Wrapper 클래스의 생성자는 매개변수로 '문자열'이나 각 자료형의 값들을 인자로 받는다.
 * == 생성자가 overloading 되어있는 것
 * */
public class WrapperEx {

	/*기본자료형과 Wrapper 클래스 사이에는 자동 형변환이 가능하다 
	 * == 기본자료형의 값을 Wrapper 클래슬 변환 : Boxing (반대 개념은 Unboxing)*/
	
	public static void main(String[] args) {
		// 정수 10이 Integer 클래스 객체로 변환 (boxing)
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10); //Integer 클래스의 서로 다른 객체
		System.out.println("i1 == i2 : " + (i1==i2));
		System.out.println("i1.equals(i2) : " + i1.equals(i2)); //overriding : 값 비교
		System.out.println("i1.toString() : " + i1.toString()); //overriding

		//i1 객체가 100 정수로 변환 (unboxing)
		System.out.println("i1 == 10 : " + (i1==10));
		int i3 = 10;
		System.out.println("i1 == i3 : " + (i1==i3));
	}

}
