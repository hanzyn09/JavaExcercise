package com.hanzyn.section01.interfaces;

//세개의 인터페이스를 한번에 구현하는 구현 클래스.
//여기에선 인터페이스의 추상 메서드를 모두 구현해주어야 한다.

public class Complexer implements Printer, Scanner, Fax{
	
	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "에서 " + tel+"로 FAX 전송");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " + FAX_NUMBER +"로 FAX 수신" );
	}
	
	@Override
	public void scan() {
		System.out.println("스캔 실행");
	}
	
	@Override
	public void print() {
		System.out.println("출력 실행");
	}
	
}
//이렇게 구현클래스를 따로 만드는 경우가 일반적이다.
//그러나, 한번 사용하는 경우엔 새로 생성하는게 더 불편할 수 있다.
//그래서 실행 클래스에서 이름이 없는 익명 구현 객체로 객체를 생성할 수 있는 방법이 있다.
//안드로이드같은 GUI 프로그래밍에서, 이벤트 처리 시/ 스레드 사용하는 프로그래밍 시 자주 사용한다.