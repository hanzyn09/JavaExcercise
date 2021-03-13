package com.hanzyn.section01.list;

//추상 클래스
/*abstract 메서드를 포함 했기 때문*/
abstract class Shape {

	//필드
	int x, y;
	
	//생성자
	Shape() {
		this(0, 0);
	}
	
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//추상 메서드
	abstract double area();
	abstract double length();
	
	//일반 메서드
	public String getLocation() {
		return "x :" + x + " y : " + y;
	}
}
