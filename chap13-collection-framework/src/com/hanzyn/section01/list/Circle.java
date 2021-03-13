package com.hanzyn.section01.list;

public class Circle extends Shape{
	
	//필드
	double r;
	
	//생성자
	Circle(){
		this (1);
	}
	Circle(double r){
		this.r = r;
	}
	
	//메서드 재정의 (오버라이딩)
	@Override
	double area() {
		return (r * r) * Math.PI;
	}
	@Override
	double length() {
		return (2 * r) * Math.PI;
	}
	

	
}
