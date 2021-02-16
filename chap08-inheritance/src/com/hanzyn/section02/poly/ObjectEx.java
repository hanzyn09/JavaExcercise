package com.hanzyn.section02.poly;

//모든 오브젝트를 매개변수로 받으려면 매개변수를 object 자료형으로 받는다.
//Object는 모든 클래스의 최상위 클래스이다.
public class ObjectEx {

	public static void main(String[] args) {
		
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia());
		allObject("안녕하세요!");
	
	}

	public static void allObject(Object obj) {
		System.out.println(obj.toString());
	}
	
}
