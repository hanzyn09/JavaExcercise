package com.hanzyn.exercise;

public class CharacterMain {

	public static void main(String[] args) {
		Character warriors = new Warrior(1, 2, 3);
		Character gladiators = new Gladiator(11, 22, 33);
		Character wizards = new Wizard(111, 222, 333);
		
		System.out.println(warriors.hp);
		System.out.println(warriors.power);
		System.out.println(warriors.weapon);
		Warrior.attack(warriors);
		Warrior.defence(warriors);
		
		System.out.println(gladiators.hp);
		System.out.println(gladiators.power);
		System.out.println(gladiators.shield);
		Gladiator.attack(gladiators);
		Gladiator.powerAttack(gladiators);
		
		System.out.println(wizards.hp);
		System.out.println(wizards.power);
		System.out.println(wizards.heal);
		Wizard.attack(wizards);
		Wizard.healing(wizards);
	}

}
