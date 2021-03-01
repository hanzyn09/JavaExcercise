package com.hanzyn.section01.lang.object.equals;

public class HashCodeEx {

	public static void main(String[] args) {
	
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1.hashCode() : " + str1.hashCode()); //hashcode 메서드는 JVM이 객체를 식별할 수 있는 정수값을 리턴
		System.out.println("str2.hashCode() : " + str2.hashCode()); //객체의 메모리 주소를 이용해 해쉬코드를 생성래서 리턴
		//원래는 두 개의 다른 객체인 경우 해쉬코드 값도 다르다.
		//String 클래스의 hashCode() 메서드는 문자열 값이 같으면, 동일한 해쉬코드를 리턴하도록 재정의되어있다.
		
		
		//System.identityHashCode()메서드는 Object 클래스의 hashCode()메서드처럼 객체의 주솟값으로 해쉬코드를 생성
		System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
		System.out.println("System.identityHashCode(str2) : " + System.identityHashCode(str2));
		//모든 객체에 대해 항상 다른 해쉬코드값을 리턴.
		//프로그램 실행할 때마다 해쉬코드값이 다르게 리턴. == str1과 str2는 해쉬코드는 같아도 서로 다른 객체라는 걸 알 수 있다!
	}

}
/*
 * 생성된 객체의 해쉬코드 : 프로그램이 실행 될 때마다 할당되는 메모리 주소가 다르므로, 매번 다른 값을 갖는다.
 * 					프로그램 실행 중에는 같은 값을 유지.
 * equalsEx처럼 객체가 같은지 비교하는 경우, hashCode()도 같이 오버라이딩 해줘야한다.
 * 같은 객체인 경우 hashCode() 메서드의 결과값인 해쉬코드도 같아야하기 때문이다.
 * 오버라리딩 하지않으면, 원래 Object 클래스에 정의된 대로 모든 객체가 서로 다른 해쉬코드 값을 갖는다.
 * 그래서 equals() 메서드와 hashCode()메서드를 같이 오버라이딩 하는 경우가 많다.*/
 