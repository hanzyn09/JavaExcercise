package com.hanzyn.section01.lang.object.equals;

//toString() : 객체를 문자열화할 때 사용되는 메서드.
//리턴값은 클래스명@16진수의 해쉬코드값.

/* 	public String toString(){
 * 		return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 	}
 * getClass(), getName(), hashCode() 메서드는 Object 클래스의 메서드이기 때문에 객체 생성 없이 직접 실행 가능.
 * */

public class ToStringEx {

	public static void main(String[] args) {
		Fruit f = new Fruit("사과", "빨강");
		System.out.println(f); //f는 참조변수 이므로 실제 실행된 문자열은 syso(f.toString());

	}

}
class Fruit{ 
	//이 클래스에는 toString() 메서드가 존재하지않으므로, 
	//상위 클래스인 Object 클래스의 toString() 메서드가 실행되어 클래스명@16진수 해쉬코드값이 출력될 것이다.
	String name;
	String color;
	
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
}