package com.hanzyn.excercise;

interface Player {
	//추상 메서드
	void play();
}

public class Excercise {

	public static void main(String[] args) {
		Player p1 = new BaseballPlayer();
		Player p2 = new FootballPlayer();
		
		playGame(p1);
		playGame(p2);

	}
	
	public static void playGame(Player p) {
		p.play();
	}

}
