package com.hanzyn.section05.packages;

//싱글톤: 기능적인 요소가 많은 클래스, 유틸에 많이 사용.
// 객체의 무분별한 사용 방지, 메모리 절약
//Member클래스로 각 회원의 객체를 생성해야 할때는 맞지 않음.
//회원 100명을 하나의 객체에 담을 수 없다 == 100개의 객체에 담아야 모두 다른 회원의 값이 저장되기 때문.

public class SingletonMain {

	public static void main(String[] args) {
		
		//Singleton s = new Singleton(); //error
		// Singleton이 private 접근제한자여서 생성할 수 없다.
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}

}
