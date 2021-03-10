package com.hanzyn.section03.abstraction;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		/*
		 * 카레이서가 자동차를 운전하는 프로그램 작성
		 * 
		 * 기능을 최대한 단순화 시켜서 프로그램 작성하기 !!!
		 * 
		 * ====== 기획 ======
		 * 1. 자동차는 처음에 멈춘 상태로 대기
		 * 2. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우, 다시 시동을 걸 수 없다.
		 * 3. 카레이서가 엑셀레이터를 밟으면 시동이 걸린 상태일 경우 자동차는 시속이 10km/h로 증가하며 앞으로 나간다.
		 * 4. 자동차가 달리는 중이면, 브레이크를 밟았을 때 시속은 0으로 떨어지며 멈춘다.
		 * 5. 브레이크를 밟을 때, 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다.
		 * 6. 카레이서가 시동을 끄면, 더 이상 자동차는 움직이지 않는다.
		 * 7. 자동차가 달리는 중이면, 시동을 끌 수 없다.
		 *  
		 * */
		
		//여기서 필요한 객체는 카레이서와 자동차.
		
		/* 카레이서가 수신하는 메세지 == 해야할 일과 동일
		 * 1. 시동 걸기
		 * 2. 엑셀레이터 밟기
		 * 3. 브레이크 밟기
		 * 4. 시동 끄기
		*/
		
		/* 자동차가 수신하는 메세지 == 자동차가 해야 할 일과 동일
		 * 1. 시동 걸기
		 * 2. 앞으로 가기
		 * 3. 멈추기
		 * 4. 시동 끄기
		 * */
		
		/*카레이서 1명 등장합니다.*/
		CarRacer racer = new CarRacer();
		// 입력받은 메뉴에 따라 카레이서의 행동이 달라진다.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======= 카레이싱 프로그램 =======");
			System.out.println(" 1. 시동 걸기"
					+ "\n 2. 전진"
					+ "\n 3. 정지"
					+ "\n 4. 시동 끄기"
					+ "\n 9. 프로그램 종료");
			System.out.println("======= 메뉴선택 : =======");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : racer.startUp(); break;
				case 2 : racer.stepAccelator(); break;
				case 3 : racer.stepBreak(); break;
				case 4 : racer.turnOff(); break;
				case 9 : System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("잘못된 번호를 입력하셨습니다."); break;
			}
			
			if(no == 9) break;
		}
		
		sc.close();
	}
}
