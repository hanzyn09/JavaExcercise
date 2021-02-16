package com.hanzyn.exercise;

public class Wizard extends Character{

	
	Wizard(int hp, int power, int h){
		super(hp, power);
		heal = h;
		
	}
	
	public static void healing(Object target) {
		System.out.println("치료 마법");
	}
}