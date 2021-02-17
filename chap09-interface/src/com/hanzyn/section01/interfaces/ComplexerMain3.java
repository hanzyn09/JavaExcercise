package com.hanzyn.section01.interfaces;

public class ComplexerMain3 {

	public static void main(String[] args) {
		
		ComplexerInterface c1 = new ComplexerInterface() {
			
			@Override
			public void send(String tell) {
				System.out.println("여기는 익명 구현 객체의 send()");
			}
			@Override
			public void receive(String tell) {
				System.out.println("여기는 익명 구현 객체의 receive()");
			}
			@Override
			public void print() {
				System.out.println("여기는 익명 구현 객체의 print()");
			}
			@Override
			public void scan() {
				System.out.println("여기는 익명 구현 객체의 scan()");
			}
		};
		
		c1.send("1234");
		c1.receive("5678");
		c1.print();
		c1.scan();

	}

}
