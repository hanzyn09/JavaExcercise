package com.hanzyn.exercise;

public class Gladiator extends Character{
	
	Gladiator(int hp, int power, int s){
		super(hp, power);
		shield = s;
	}
	
	public static void powerAttack(Object target) {
		System.out.println("파워 공격");
	}
	
}