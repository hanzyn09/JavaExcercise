package com.hanzyn.excercise;

public class Excercise3 {
	public static void main(String[] args) {
		int[] score = {90, 80, 60, 100};
		int totalScore = 0;
		double avgScore = 0;
		
		//합과 평균 출력
		for(int i = 0; i<score.length; i++) {
			totalScore += score[i];
		}
		avgScore = totalScore / score.length;
		
		System.out.println("합: " + totalScore);
		System.out.println("평균: " + avgScore);
	}
}
