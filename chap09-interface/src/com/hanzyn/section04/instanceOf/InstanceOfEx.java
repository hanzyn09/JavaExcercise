package com.hanzyn.section04.instanceOf;

/*
 * 객체 instanceof 클래스(인터페이스)
 * 
 * 앞에 객체가, 뒤쪽 클래스(인터페이스)의 객체인가? : true or false 
 * 쓰이는 이유는, 사전에 미리 instanceof를 이용하여 형변환이 가능한지 알 수 있따.
 * false이면 형변환 불가, true 이면 형변환 가능.
 * */
public class InstanceOfEx {

	public static void main(String[] args) {
		A a = new AAA();
		
		AA aa = new AAA();
		AAA aaa = new AAA();
		
		A b = new ABB();
		AB ab = new ABB();
		ABB abb = new ABB();
		
		System.out.println(" a > A : " + (a instanceof A)); //t
		System.out.println(" aa > A : " + (aa instanceof A)); //t
		System.out.println(" aaa > A : " + (aaa instanceof A)); //t
		
		System.out.println(" aaa > AB : " + (aaa instanceof AB)); //f

		boolean aA = a instanceof A;
		System.out.println(aA);
	}

}
