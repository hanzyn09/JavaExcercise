package com.hanzyn.section05.sorting;

public class Rectangle extends Shape{
	int w, h;
	
	Rectangle() {
		this (1, 1);
	}

	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return w*h;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return (w+h)*2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "넓이 : " + this.area();
	}
	
	
 
}
