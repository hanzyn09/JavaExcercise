package com.hanzyn.section01.object;

public class CarMain {

	public static void main(String[] args) {
		Car tico = new Car();
		Car pride = new Car();
		
		tico.color="white";
		tico.company="daewoo";
		tico.type="경차";
		
		pride.color="블랙";
		pride.company="kia";
		pride.type="소형";
		
		tico.go();
		pride.go();
		
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
	}

}
