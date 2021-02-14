package com.hanzyn.section02.poly;

//다형성 : 하위 클래스의 객체를 상위 클래스의 자료형으로 변환 가능
public class PolyEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.run(); //자식에서 정의된 메서드만 실행.
		
		Parent p = new Child(); //부모 클래스가 더 큰 범위라서 자동 형변환 된 것이다.
		// 즉 p 는 child 객체인데 parent로 형변환 되었다. == 다형성 적용
		p.run(); //자식에서 재정의 == overridng 된 메서드만 실행.
		//p.eat(); // error :

	}

}

/* 자료형변환 예시
 * 
 * int a =10; 
 * double b = a; 에서 a가 더블형으로 자동 형변환 되는 형태.
 * 
 * double c = 10.5;
 * int d = c; 는 에러 발생.
 * int d = (int) c로 강제 형변환 필요
 * */
 