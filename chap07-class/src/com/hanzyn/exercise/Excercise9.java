package com.hanzyn.exercise;

//싱글톤 클래스 작성하기
public class Excercise9 {

	public static void main(String[] args) {

		Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();

		System.out.println("ex1 == ex2 : " + (ex1 == ex2));
	}

}

class Excercise{
	
	private static Excercise instance = new Excercise();
	
	private Excercise() {
		System.out.println("객체 생성");
	}
	
	//이 부분 만 있어도 ok
	public static Excercise getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
}
