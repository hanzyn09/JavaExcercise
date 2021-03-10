package com.hanzyn.section03.abstraction;

/* 카레이서가 수신하는 메세지 == 해야할 일과 동일
 * 1. 시동 걸기
 * 2. 엑셀레이터 밟기
 * 3. 브레이크 밟기
 * 4. 시동 끄기
*/

public class CarRacer {
	
	//CarRacer가 상호작용할 Car 클래스를 알고 있어야한다 == 필드에 가지고 있다.
	private Car car = new Car();
	
	/*
	 * <pre>
	 * 카레이서가 자동차의 시동을 걸 수 있는 메서드
	 * </pre>
	 * */
	public void startUp() {
		car.startUp();
	}
	
	/*
	 * <pre>
	 * 카레이서가 엑셀레이터를 밟아 가속할 수 있는 메서드
	 * </pre>
	 * */
	public void stepAccelator() {
		car.go();
	}
	
	/*
	 * <pre>
	 * 카레이서가 브레이크를 밟아 정지할 수 있는 메서드
	 * </pre>
	 * */
	public void stepBreak() {
		car.stop();
	}
	
	/*
	 * <pre>
	 * 카레이서가 시동을 끌 수 있는 메서드
	 * </pre>
	 * */
	public void turnOff() {
		car.turnOff();
	}
}
