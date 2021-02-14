package com.hanzyn.section01.extend;

//super() 는 부모 객체의 생성자를 의미
//부모 클래스의 생성자에 매개변수가 있는 경우, 자식 클래스의 생성자에서 반드시 super()로 부모 생성자를 실행해줘야한다.

public class SuperEx2 {
	
}

class Parent2{
	String name;
	
	Parent2(String name){ //매개변수가 존재하는 부모 클래스의 생성자
		this.name = name;
	}
}

class Child2 extends Parent2{
	Child2(String name){ //super()로 매개변수를 전달해주어 부모클래스의 생성자를 실행시켜줘야 한다.
		super(name); //먼저 실행되어, 부모 객체가 먼저 생성된다.
	}//이 메서드가 없으면 에러 발생.
}