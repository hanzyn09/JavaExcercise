package com.hanzyn.section02.encapsulation.problem1;

public class Application {

	//필드에 직접 접근하는 경우 발생할 수 있는 문제점
	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
		monster1.name = "두치";
		monster1.hp = 200;
		
		System.out.println(monster1.name);
		System.out.println(monster1.hp);
		
		Monster monster2 = new Monster();
		monster2.name ="뿌꾸";
		monster2.hp = -200;
		
		System.out.println(monster2.name);
		System.out.println(monster2.hp);
		//검증되지 않은 값을 넣으면 문제가 발생할 수 있다.
		
		//setHp 메서드 이용
		Monster monster3 = new Monster();
		monster3.name = "드라큘라";
		monster3.setHp(200);
		System.out.println(monster3.name);
		System.out.println(monster3.hp);
		
		//잘못된 값을 검증하여 필드값을 수정하는 기능으로 위에서 발생한 문제를 해결
		Monster monster4 = new Monster();
		monster4.name = "프랑켄슈타인";
		monster4.setHp(-1000);
		System.out.println(monster4.name);
		System.out.println(monster4.hp);
	}

}
