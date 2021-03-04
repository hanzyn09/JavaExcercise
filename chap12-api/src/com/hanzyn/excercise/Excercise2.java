package com.hanzyn.excercise;

class Car{
	String name;
	String company;
	
	public String toString() {
		return name + ":" + company;
	}
}

public class Excercise2 {

	public static void main(String[] args) {

		Car car = new Car();
		car.name = "그랜저";
		car.company = "현대자동차";
		
		System.out.println(car);

	}

}
