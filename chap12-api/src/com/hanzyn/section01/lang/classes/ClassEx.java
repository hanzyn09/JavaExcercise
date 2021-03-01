package com.hanzyn.section01.lang.classes;

/*
 * class 클래스는 클래스를 메모리에 로드하거나,
 * 클래스나 인터페이스의 이름-생성자-필드-메서드 정보를 확인할 수 있는 클래스이다.
 * 
 * class 객체를 얻는 방법은 객체를 이용해서 생성하는 방법과
 *  문자열 주소를 이용해서 생성하는 방법이 있다.
 *  */

public class ClassEx {

	public static void main(String[] args) {
		EnvEx env = new EnvEx();
		
		//객체를 이용해서 생성
		Class c1 = env.getClass();
		System.out.println(c1.getName());
		
		//문자열 주소로 생성
		try {
			Class c2 = Class.forName("chap12.PropertyEx");
			System.out.println(c2.getName());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
class EnvEx {
	public EnvEx() {
		
	}
}
