package com.hanzyn.section02.field;

public class VarEx {

	public static void main(String[] args) {
		System.out.println("Avante 제조사: " + Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		
		a1.color = "white";
		a2.color = "black";
		
		System.out.println("a1 color: " + a1.color);
		System.out.println("a2 color: " + a2.color);
		
		a1.company = "kia";
		
		System.out.println("Avante 제조사: " + Avante.company);
		System.out.println("a1 제조사: " + a1.company);
		System.out.println("a2 제조사: " + a2.company);

	}

}

class Avante{
	String color;
	static String company = "현대";
	//static은 클래스 변수, static 없는 것은 인스턴스 변수
	//클래스 변수는 객체 생성을 하지 않아도 사용가능 == 모든 객체들이 공유되는 변수
	//인스턴스 변수는 객체를 먼저 생성하고, 객체를 통해 사용해야 함 == 객체마다 독립적인 값을 가짐
}
