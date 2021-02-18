package com.hanzyn.section01.classes;

public class Amain {

	public static void main(String[] args) {
		A a = new A(); //A 객체 생성
		
		/*static 멤버 클래스 객체 생성*/
		A.B b = new A.B(); //B 객체 생성 : A.B() 형태로 A클래스의 객체 생성 없이 B 클래스 객체 생성 : static 내부 클래스이기 때문!!!!!!!!!!
		b.var1 = 3;
		b.method1(); //static 내부 클래스의 method1()
		
		A.B.var2 = 3; 
		A.B.method2(); //static 내부 클래스의 static method2()
		//var2 와 method2() 는 static 이어서 b 객체를 통하지 않고 A.B로 접근하였다. 
		
		/*instance 멤버 클래스 객체 생성*/
		A.C c = a.new C(); //C 객체 생성 : 인스턴스 멤버 클래스이기 때문에 A 클래스의 객체 a를 통해 객체를 생성한다.
		c.var1 = 3;
		c.method1(); //인스턴스 내부 클래스의 method1()
		
		
		/*로컬 내부 클래스 객체 생성을 위한 메소드 호출*/
		a.method(); //D 객체 생성, 로컬 내부 클래스의 method1()
		
	}

}
