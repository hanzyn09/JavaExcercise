package com.hanzyn.section04.abstracts;

//일반 메서드: 선언부 + 구현부{}
//추상 메서드: 선언부

//추상 메서드는 new를 통해 객체화 할 수 없다. 부모클래스로만 사용가능.
//상속받는 자식 클래스는 부모클래스의 메서드 중 추상클래스가 있다면 이 추상메서드를 반드시 구현해야한다. == 메서드 재정의(오버라이딩)
abstract class Shape{
	String type;
	
	Shape(String type){
		this.type = type;
	}
	
	//구체화 되어야 기능을 구현할 수 있다.
	abstract double area();
	abstract double length();
}

class Circle extends Shape{
	int r;
	
	Circle(int r) {
		super("원");
		this.r = r;
	}
	
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return 2 * Math.PI * r;
	}
}

class Rectangle extends Shape {
	int width, height;
	
	Rectangle(int width, int height){
		super("사각형");
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		return height * width;
	}
	@Override
	double length() {
		return  2 * (width + height);
	}
}

public class ShapeEx {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이: " + s.area() + ", 둘레: " + s.length());
		}
	}
}

/*추상 클래스를 만드는 이유
 * 
 * 1. 클래스 설계 시, 변수와 메서드의 이름을 공통적으로 적용시키기 위한 것.
 * 유사한 특성을 가진 클래스를 모아서 공통 변수나 메서드의 이름을 통일 시켜 각 클래스에 맞게 재정의하게 한다.
 * 
 * 2. 중복 소스를 줄이기 위한 것.
 * 상속관계는 변수와 메서드를 물려받기 때문에 개발 시간을 줄일 수 있다.
 * 
 * 3. 다형성 적용 가능.
 * 소스의 수정이나 변경사항이 있을 떄, 전체를 변경하는 게 아니라 특정 클래스만 바꾸면 쉬운 수정이 가능하다.*/
 