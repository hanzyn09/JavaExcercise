package com.hanzyn.section05.sorting;

public class Circle extends Shape{
	
	double r;
	
	Circle() {
		this(1);
	}

	Circle(int r) {
		this.r = r;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return r*2*Math.PI;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "넓이 : " + this.area();
	}
	

}
