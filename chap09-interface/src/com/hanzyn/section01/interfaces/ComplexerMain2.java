package com.hanzyn.section01.interfaces;

//익명구현객체 생성 시, 이름이 없기 때문에 인터페이스 명으로 객체를 생성한다.
//익명구현객체는 여러개의 인터페이스를 한번에 다중 구현 하지 못한다.
// ==> 해결법 : 3개의 인터페이스를 상속하는 인터페이스를 만든다.
public class ComplexerMain2 {

	public static void main(String[] args) {
		
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send()");
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("여기는 익명 구현 객체의 receive()");
			}
		};
		// 구현 완료 후 세미콜론; 잊지 말 것!
		
		fax.send("1234");
		fax.receive("5678");
		

	}

}
