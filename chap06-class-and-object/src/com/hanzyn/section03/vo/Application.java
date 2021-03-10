package com.hanzyn.section03.vo;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 캡슐화의 원칙에는 일부 어긋나지만, 매번 추상화를 하지않아도 되는 객체도 존재한다.
		 * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 값 객체 (Value Object)
		 * 
		 * 값 객체를 설계할 때는 행위가 아닌, 데이터 위주이며, 캡슐화의 원칙을 준수하여
		 * 모든 필드는 private로 직접 접근을 막고, 
		 * 각 필드값을 변경하거나 반환하는 메서드를 세트로 미리 작성해둔다.
		 * 
		 * private 필드의 필드값을 수정하는 설정자 == setter
		 * 필드에 접근하는 접근자 == getter들로 구성.
		 * */
		
		Member m1 = new Member();
	}

}
