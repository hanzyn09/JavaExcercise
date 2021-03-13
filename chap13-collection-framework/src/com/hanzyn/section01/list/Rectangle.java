package com.hanzyn.section01.list;

public class Rectangle extends Shape{

	//필드
	int w, h;
	
	//생성자
	Rectangle(){
		this(1,1);
	}
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	//오버라이딩
	@Override
	double area() {
		return w * h;
	}
	@Override
	double length() {
		return 2 * (w + h);
	}
}
