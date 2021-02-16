package com.hanzyn.section02.poly;

//매개변수의 다형성
public class Game {
	
	void display(GraphicCard gc) {
		gc.process();
		//이 메서드가 호출되려면 메인에서 다음과 같이 구현되어야한다.
		//Game g = new Game();
		//GraphicCard gc = new GraphicCard();
		//g.display(gc);
	}
	//메서드는 다양한 자료형을 매개변수로 받을 수 있다.
	//메서드 정의할 때 매개변수의 자료형을 상위 클래스 타입으로 지정했음.
	
	
	/**********************************************************************************
	//overloading 가능.
	void display(Amd a) {
		a.process();
	}
	
	void display(Nvidia n) {
		n.process();
	}
	//하지만, 다형성 개념을 이용하면 GraphicCard만 매개변수로 받는 메서드 하나만으로도 세가지를 모두 처리할 수 있다.
	//참고: Computer2.class
	 * 
	 */
}
