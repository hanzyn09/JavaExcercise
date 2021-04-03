package com.hanzyn.section05.sorting;

//내가 만든 클래스의 객체 정렬하기

abstract class Shape implements Comparable<Shape>{
	//필드
	int x, y;
	
	//생성자
	Shape() {
		this(0, 0);
	}
	
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//추상메서드
	abstract double area();
	abstract double length();
	
	//일반 메서드
	public String getLocation() {
		return "x : " + x + ", y : " + y;
	}
	
	@Override
	public int compareTo(Shape s) {
		return (int)(this.area() - s.area());
	} // 부모 클래스에서 comparable 인터페이스를 구현했으므로 상속받은 자식 클래스도 comparable 인터페이스의 구현 클래스가 된다.
}
