package com.hanzyn.section01.extend;

//super. 는 자신이 속한 클래스가 아닌, 상위 클래스에서만 멤버를 찾는다.
//super() 은 부모객체의 생성자를 실행 할 때 사용.

//this && super == static 메서드에서 사용 불가 == main() 메서드에서 사용 불가

public class SuperEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.print();
	}

}


class Parent{
	int number = 3;
	
	Parent(){
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent{
	int number = 2; //이것을 지정하지 않는다면 this.number는 3 (부모클래스와 동일하게 적용)
	
	Child(){
		System.out.println("자식 객체 생성");
	}
	void print() {
		int number = 1;
		System.out.println(number); //객체 생성은 부모 클래스가 먼저 실행
		System.out.println(this.number); //자기 자신 객체를 가리키는 참조변수 this
		System.out.println(super.number); //부모 객체를 가리키는 참조변수 super 
	}
}