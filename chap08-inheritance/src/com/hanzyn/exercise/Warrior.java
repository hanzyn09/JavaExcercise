package com.hanzyn.exercise;

public class Warrior extends Character{
	
	Warrior(int hp, int power, int w){
		super(hp, power);
		weapon  = w;
	}
	
	static void defence(Object target) {
		System.out.println("방어");
	}
}