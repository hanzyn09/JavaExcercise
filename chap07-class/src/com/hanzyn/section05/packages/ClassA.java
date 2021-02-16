package com.hanzyn.section05.packages;


//접근제한자는 클래스, 메서드, 생성자, 변수에 모두 사용 가능.
//파일 이름으로 만들어진 클래스는 public 이나 default만 지정 가능.

//하나의 파일에 여러 개의 클래스를 작성할 경우, public은 한개만 지정 가능 && 그 클래스가 파일 이름.

//private과 protected는 클래스 안에 만들어지는 내부 클래스에서만 사용 가능

//public: 공용, private: 해당 클래스 내부
//default: 같은 패키지, protected: 같은 패키지의 자식클래스

public class ClassA {
	
	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.print();
	}
	
	public void print() {
		System.out.println("여기는 class A.");
	}
}

class ClassB{
	void print() {
		System.out.println("여기는 class B.");
	}
}