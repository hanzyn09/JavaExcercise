package com.hanzyn.section03.typecasting;

public class AnimalMain {

	public static void main(String[] args) {
		Animal eagle = new Eagle();
		
		eagle.sleep();
		//eagle.eat(); //error: Animal 자료형으로 선언돼서 Animal 에는 eat() 메서드가 없기 때문.
						// 만약 Eagle 자료형으로 선언 했다면 호출 가능.
		//Animal 은 상위클래스, Eagle은 하위클래스. 
		//상위클래스는 하위클래스로 자동 형변환이 되지않는다!
		
		Eagle eagle2 = new Eagle();
		eagle2.sleep();
		eagle2.eat(); 
		
		Eagle eagle3 = (Eagle)eagle; //강제 형변환
		eagle3.sleep();
		eagle3.eat();
		
		

	}

}
