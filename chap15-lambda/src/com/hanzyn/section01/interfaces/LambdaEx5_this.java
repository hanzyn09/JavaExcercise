package com.hanzyn.section01.interfaces;

/*
 * 람다식에서 사용되는 this
 * : 람다식은 내부클래스의 익명객체로 인식되므로 람다식 내부의 this는 람다 객체 자신을 의미한다.
 * 람다 표형식 내에서 지역변수 접근 시 지역변수는 상수화도 필요하다.
 * */
public class LambdaEx5_this {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

@FunctionalInterface
interface LambdaInterface5{
	void method();
}

class Outer{

	public int iv =10;
	
	void method() {
		final int iv =10;
		LambdaInterface5 f5 = ()->{
			System.out.println("Outer.this.iv : " + Outer.this.iv);
			System.out.println("this.iv : " + this.iv);
			System.out.println("iv : " + iv);
		};
		f5.method();
	}
}
