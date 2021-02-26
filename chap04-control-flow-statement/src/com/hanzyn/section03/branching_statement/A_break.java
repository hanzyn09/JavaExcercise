package com.hanzyn.section03.branching_statement;

public class A_break {

	public void testSimpleBreakStatement() {
		/*break 문은 반복문 내에서 사용. 
		 * (switch 문은 반복문은 아니지만 예외적으로 사용)
		 * 
		 * 해당 반복문에서 빠져나올때 사용.
		 * 반복문의 조건문 판단결과와 상관없이 반복문을 빠져나올 때 사용! 
		 * if(조건식){break;}
		 * 가장 가까운 반복문에서 나간다.
		 * */
		/************************* for ***************************/
		int sum2 = 0;
		for(int i2 = 1; ;i2++) { //무한 반복을 의미. 무조건 참이다.
			sum2 += i2;
			
			if(i2 == 100) break; //가장 가까운 반복문에서 나간다.
		}
		System.out.println(sum2);
		
		/************************* while ***************************/
		int sum = 0;
		int i = 1;
		while(true) {
			sum += i;
			
			if(i == 100) break;
			
			i++;
		}
		System.out.println(sum);
	}

	public void testSimpleBreakStatement2() {
		/*중첩 반복문 내에서 분기문의 활용
		 * break는 모든 반복문을 종료하는게 아니라,
		 * 자신에게 가장 인접한 반복문 실행만 멈춘다.
		 * */
		// 2~9단 출력, 단, 각 단의 수가 5보다 큰 경우는 출력을 생략 !!!!!
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				
				if(j>5) break;
				System.out.println(i +" * "+ j + " = " + i*j);
			}
			System.out.println();
		}
	}
	public void testJumpBreak() {
		
		label: //break 가 나왔을 때 나갈 이름을 지정해줌 menu: 이면 밑에 menu 로만 바꿔주면 된다.
			//for, while 모두 적용 가능. 이름을 부여한 기능이다.
		for(;;) {
			for(int i=0; i<10; i++) {
				System.out.println(i);
				if(i == 3) break label;
			}
		}
	}
}
