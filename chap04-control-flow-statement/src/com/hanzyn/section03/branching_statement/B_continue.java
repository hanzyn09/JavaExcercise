package com.hanzyn.section03.branching_statement;

public class B_continue {
	/*continue
	 * 
	 * 반복문 내에서 사용.
	 * 해당 반복문의 반복 회차를 중간에 멈추고, 다시 증감식으로 넘어가게 해준다.
	 * 
	 * if(조건식) continue; 
	 * 
	 * 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용
	 * 
	 * */
	public void testSimpleContinueStatement() {
		
		//각 단에서 짝수의 su 가 포함된 식은 스킵.
		for(int dan = 2; dan <= 10 ; dan++) {
			for(int su = 1; su < 10; su++) {
				if(su % 2 == 0) continue; //가장 가까운 반복문의 탈출에 해당
				
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
			System.out.println();
		}
	}
	
	public void testJumpContinue() {
		// 중첩 반복문 내에서 분기문 continue를 이용해서 한번에 여러개의 반복문을 건너뛰기
		
		menu: 
		for(int dan = 2 ; dan < 10 ; dan++) {
			for(int su = 1; su < 10; su++) {
				if(su % 2 == 0) continue menu; //continue를 통해 맨 바깥으로 나가게 해줌.
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
			System.out.println();
		}
	}
	
}
