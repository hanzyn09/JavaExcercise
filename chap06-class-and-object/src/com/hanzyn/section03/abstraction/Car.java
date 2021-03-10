package com.hanzyn.section03.abstraction;

/* 자동차가 수신하는 메세지 == 자동차가 해야 할 일과 동일
 * 1. 시동 걸기
 * 2. 앞으로 가기
 * 3. 멈추기
 * 4. 시동 켜기
 * */

public class Car {
	
	private boolean isOn; //초기에는 시동이 꺼진 false 상태
	private int speed;
	
	/*
	 * <pre>
	 *  자동차의 시동을 걸기 위한 메서드
	 * </pre>
	 * */
	public void startUp() {
		if(isOn) {
			System.out.println("이미 시동이 걸려있습니다.");
		} else {
			this.isOn = true;
			System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다. ");
		}
	}
	
	/*
	 * <pre>
	 *  자동차를 가속시키기 위한 메서드.
	 *  시동이 걸린 상태인 경우에만 호출시 마다 10km/h로 속도를 증가시킨다.
	 * </pre>
	 * */
	public void go() {
		if(isOn) {
			System.out.println("차가 앞으로 움직입니다.");
			this.speed += 10; //차의 성능에 따라 차 스스로가 결정한다.
			System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
		} else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
		}
	}
	
	/*
	 * <pre>
	 *  자동차를 멈추기 위한 메서드.
	 *  시동이 걸려있고, 달리는 상태일 경우에만 멈출 수 있다.
	 * </pre>
	 * */
	public void stop() {
		if(isOn) {
			if(this.speed > 0) {
				this.speed = 0;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.\n");
			} else {
				System.out.println("차는 이미 멈춰있는 상태입니다.\n");
			}
			
		} else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.\n");
		}
	}
	
	/*
	 * <pre>
	 *  자동차를 시동을 끄기 위한 메서드.
	 * </pre>
	 * */
	public void turnOff() {
		if(isOn) {
			if(speed > 0) {
				System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈추세요.\n");
			} else {
				this.isOn = false;
				System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요.\n");
			}
			
		} else {
			System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.\n");
		}
	}
}
