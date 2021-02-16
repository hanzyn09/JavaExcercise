package com.hanzyn.section05.packages;


//싱글톤은 객체의 무분별한 생성(new=메모리 부족=시스템 느려짐)을 막기위해 사용한다.
//특정 클래스는 하나의 객체만 생성되도록 프로그래밍.
//생성자에 private 접근 제한자를 붙여서, 외부 클래스에서는 실행할 수 없도록 제한한다.
//static 변수로 객체를 생성해두고, static 메서드에서 이 객체를 리턴하게 정의하면 단 하나의 객체만 생성해서 사용한다.

// 메인 호출:  Singleton s1 = Singleton.getInstance();

public class Singleton {
	
	//static 변수
	private static Singleton instance = new Singleton();
	/*private으로 선언 되었기 때문에 해당 클래스 내부에서만 사용.
	 * static이 적용되었기때문에 클래스 로드 될때 한번만 실행 됨.
	 * == 10에 의해 이미 객체가 생성되어 공유할 수 있는 변수가 되어있음.*/
	
	//생성자에 private 접근 제한자
	private Singleton() {
		System.out.println("객체 생성.");
	}
	
	//static 메서드
	public static Singleton getInstance() {
		System.out.println("객체 리턴.");
		return instance;
	}
	/*public 접근제한자로, 외부에서는 이 메서드를 통해서만 이미 만들어진 객체를 사용하게 한다.
	 * static 메서드이기때문에 객체 생성없이 직접 호출하게하는 메서드이다.*/
}
