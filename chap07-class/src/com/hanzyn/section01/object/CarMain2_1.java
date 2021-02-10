package com.hanzyn.section01.object;

public class CarMain2_1 {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		for(int i=0; i<3; i++) {
			cars[i] = new Car();
			cars[i].color = "white";
			cars[i].company = "daewoo";
			cars[i].type = "소형";
		}
		System.out.println("cars[0].color = " + cars[0].color);
		System.out.println("cars[1].color = " + cars[1].color);
		System.out.println("cars[2].color = " + cars[2].color);
		
		cars[0].color = "black";
		
		System.out.println("cars[0].color = " + cars[0].color);
		System.out.println("cars[1].color = " + cars[1].color);
		System.out.println("cars[2].color = " + cars[2].color);
		//객체를 각각 선언 했기 때문에 0번째의 색을 바꿔도 다른 인덱스에 영향을 끼치지 않는다.
	}

}
