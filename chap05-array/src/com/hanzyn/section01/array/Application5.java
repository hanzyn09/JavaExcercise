package com.hanzyn.section01.array;

public class Application5 {

	public static void main(String[] args) {
		// 랜덤한 카드 한 장 뽑아서 출력.
		// 모양과 카드 숫자 별로 값을 저장할 배열을 생성
		
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
		
		//배열 인덱스 범위의 난수를 발생시킨다.
		int randomShapeIndex = (int)(Math.random() * shapes.length); // * 갯수 + 시작 점
		int randomCardNumberIndex = (int)(Math.random() * cardNumbers.length);
		
		//index를 이용해서 출력
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " 
							+ cardNumbers[randomCardNumberIndex] + " 카드 입니다.");
	}

}
