package com.hanzyn.section02.encapsulation.problem1;

public class Monster {
	String name;
	int hp;
	
	/**
	 * <pre>
	 * 매개변수로 전달받은 정수를 이용해서 hp 값을 변경해주는 메서드.
	 * 단, 매개변수로 전달받은 값이 양수인 경우 전달받은 값으로 변경하고,
	 * 0보다 작거나 같으면 0으로 설정한다.
	 * </pre>
	 * @param hp
	 */
	public void setHp(int hp) {
		
		/*
		 * this 는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
		 * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근한다.
		 * 전역변수에 접근하기 위해서 this. 를 명시해야한다.*/
		
		if(hp > 0) {
			System.out.println("양수값으로 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
			this.hp = hp;
		}
		else {
			System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
			this.hp = 0;
		}
		
	}
}

