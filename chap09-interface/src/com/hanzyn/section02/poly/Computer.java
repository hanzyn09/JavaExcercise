package com.hanzyn.section02.poly;

public class Computer {

	public static void main(String[] args) {
		GraphicCard gc = new Amd();
		//Amd는 "GraphicCard 인터페이스를 implements 한" 클래스.
		
		System.out.println("메모리: " + gc.MEMORY);
		
		//AMD 로 생성
		gc= new Amd(); //자동 형변환
		gc.process();
		
		//Nvidia로 교체
		gc= new Nvidia(); //자동 형변환
		gc.process();
		
		/******************** 매개변수 다형성 확인 **********************/
		Game g = new Game();
		Amd ga = new Amd();
		g.display(ga);
		
		Nvidia gn = new Nvidia();
		g.display(gn);
		

	}

}

/*
 * 상속보다, 인터페이스 다형성을 적용하는 경우가 많은 이유:
 * 선임 개발자나 클래스 설계자가 인터페이스를 구현해놓으면
 * 이 인터페이스의 메서드를 반드시 구현하도록 강제할 수 있어서 클래스 설계용도로 많이 사용한다.*/
 