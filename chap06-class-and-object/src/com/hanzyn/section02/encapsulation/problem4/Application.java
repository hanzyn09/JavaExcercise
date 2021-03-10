package com.hanzyn.section02.encapsulation.problem4;


public class Application {
	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
//		monster1.kinds = "프랑켄슈타인";
//		monster1.hp = 100;
		//필드에 접근제한을 둬서 직접접근하려면 compile error 가 발생한다.
		// == 접근을 허용하지 않았기 때문에 직접 접근 할 수 없다
		// ==> 메서드를 이용해서 간접 접근을 해야 한다!
		
		/*
		 * 선언한 필드대로 공간은 생성되어 있지만, 직접 접근하지 못하고
		 * public 으로 접근을 허용한 메서드만 이용할 수 있도록 해놓은 것이다.
		 * ==> 캡슐화 라고 부른다.
		 * 
		 * 캡술화는 유지보수성을 증가시키기 위해 필드의 직접접근을 제한하고,
		 * public 메서드를 이용해서 간접적으로 접근하여 사용하게 만든 기술이다.
		 * 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙이다.
		 * */
	
		monster1.setInfo("미이라");
		monster1.setHp(200);
		System.out.println(monster1.getInfo());
	}
}
