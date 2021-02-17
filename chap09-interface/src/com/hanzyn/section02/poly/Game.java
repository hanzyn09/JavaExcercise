package com.hanzyn.section02.poly;

/*
 * 매개 변수의 다형성
 * 
 * 매개 변수 역시 상속과 마찬가지로, 다형성 개념을 적용해
 * 여러 구현 클래스들을 인터페이스 자료형으로 선언해 매개 변수 값을 다양화 할 수 있다.
 * */
public class Game {

	void display(GraphicCard gc) {
		gc.process();
	}
	
}
