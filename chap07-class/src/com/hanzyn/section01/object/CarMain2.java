package com.hanzyn.section01.object;

public class CarMain2 {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		Car tico = new Car();
		
		tico.color="white";
		tico.company="daewoo";
		tico.type="경차";
		
		for (int i=0; i<cars.length; i++) {
			cars[i]=tico;
		}
		System.out.println("2번 인덱스 color: "+cars[2].color);
		
		cars[0].color="black";
		
		System.out.println("0번 인덱스 color: "+cars[0].color);
		System.out.println("2번 인덱스 color: "+cars[2].color);
		//cars가 같은 주소값을 가지는 참조 자료형으로 선언됐기때문에
		//0번 정보가 바뀜에 따라 2번의 정보도 변경된다.
		//즉, 값이 저장된 곳은 하나 == 참조하는 모든 변수도 바뀐값을 참조하게 됨
	}

}
