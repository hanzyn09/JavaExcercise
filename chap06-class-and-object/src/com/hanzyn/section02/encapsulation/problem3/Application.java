package com.hanzyn.section02.encapsulation.problem3;

public class Application {

	public static void main(String[] args) {
		Monster monster1 = new Monster();
		monster1.setInfo("드라큘라");
		monster1.setHp(100);
		System.out.println(monster1.getInfo());
		
		Monster monster2 = new Monster();
		monster2.setInfo("미이라");
		monster2.setHp(-100);
		System.out.println(monster2.getInfo());
		
		Monster monster3 = new Monster();
		monster3.kinds = "두치";
		monster3.hp = -500;
		System.out.println(monster3.kinds + " " + monster3.hp);
		//문제점 발생

	}

}
