package com.hanzyn.section02.interfaces;

public class OuterMain {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		
		//다형성 적용
		out.setInterfaceEx(new InterfaceExImple());
		out.outerMethod();
		out.setInterfaceEx(new InterfaceExImple2());
		out.outerMethod();
	}

}
