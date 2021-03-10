package com.hanzyn.section02.encapsulation.problem2;

public class Application {

	public static void main(String[] args) {
		Monster monster1 = new Monster();
		monster1.name = "드라큘라";
		monster1.hp = 200;
		
		Monster monster2 = new Monster();
		monster2.name = "프랑켄슈타인";
		monster2.hp = 300;
		
		Monster monster3 = new Monster();
		monster3.name = "미이라";
		monster3.hp = 400;
		
		System.out.println(monster1.name);
		System.out.println(monster1.hp);
		
		System.out.println(monster2.name);
		System.out.println(monster2.hp);
		
		System.out.println(monster3.name);
		System.out.println(monster3.hp);
		
		//Monster클래스의 일부를 수정한 것 뿐인데 사용하는 곳에선 전부 수정해야하는 부담이 생긴다.
		//이 경우 유지보수에 악영향을 미친다.
		
		//problem 1 에서 처럼, 필드에 직접 접근하는게 아니라 메서드를 이용한 간접 접근으로 해결한다.
		
		
	}

}
