package com.hanzyn.excercise;

public class Excercise4 {

	public static void main(String[] args) {
		
		//아이디, 이름, 나이
		String[] member = {
				"hong,홍길동,30",
				"lee,이순신,40",
				"kim,김유신,50"
		};
		
		String[][] memBox = new String[3][3];
		
		for(int i=0; i<memBox.length; i++) {
			for(int j=0; j<memBox.length; j++) {
				memBox[i] = member[i].split(",");
			}
		}
		//이름만 출력
		for(int i=0; i<memBox.length; i++) {
			System.out.println(memBox[i][1]);
		} //member.split(",")[1]
		
		//평균나이 출력
		int ageSum = 0;
		for(int i=0; i<memBox.length; i++) {
			ageSum += (Integer.parseInt(memBox[i][2]));
		} //member.split(",")[2]
		
		System.out.println("평균 나이 : " + (double)ageSum/member.length);

	}

}
