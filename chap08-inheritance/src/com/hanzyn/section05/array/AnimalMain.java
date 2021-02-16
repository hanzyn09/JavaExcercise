package com.hanzyn.section05.array;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] ani = new Animal[4];
		
		Animal eagle = new Eagle("조류", "독수리");
		Animal lion = new Lion("포유류", "사자");
		Animal shark = new Shark("어류", "상어");
		Animal tiger = new Tiger("포유류", "사자");
		
		ani[0] = eagle;
		ani[1] = lion;
		ani[2] = shark;
		ani[3] = tiger;
		
		for(int i=0; i<ani.length; i++) {
			ani[i].sleep();
		}
		
		for(Animal a : ani) {
			a.sleep();
		}
	}

}
