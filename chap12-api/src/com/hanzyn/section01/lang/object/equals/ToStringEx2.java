package com.hanzyn.section01.lang.object.equals;

//toString override
//toString은 public 접근제한자 이기 때문에 public으로 재정의해야한다. : 상위 클래스의 메서드의 접근제한잡다 같거나 더 넓다
public class ToStringEx2 {

	public static void main(String[] args) {
		Fruit2 f = new Fruit2("사과", "빨강");
		System.out.println(f);

	}

}


class Fruit2{
	String name;
	String color;
	
	public Fruit2(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "과일 이름 : " + this.name + "\n과일 색상 : " + this.color;
	}
}