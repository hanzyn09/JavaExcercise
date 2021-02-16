package com.hanzyn.exercise;

public class Character {
	int hp;
	int power;
	
	int weapon, shield, heal; 
	
	Character(int h, int p){
		hp = h;
		power = p;
	}
	
	
	public static void attack(Object target) {
		System.out.println("공격");
	}
	
}
