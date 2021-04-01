package com.hanzyn.section02.functional;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

//Supplier는 매개변수는 없고 리턴타입은 있는 functional interface.
//추상메서드는 get(), getAs자료형()

public class LambdaEx7_Supplier {
	public static void main(String[] args) {
		Supplier<String> s1 = ()->{
			return "홍길동";
		};
		System.out.println(s1.get());
	
		s1 = () -> "이순신";
		System.out.println(s1.get());
		
		IntSupplier s2 = () -> {
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};
		System.out.println("주사위 : " + s2.getAsInt());
		
		DoubleSupplier s3 = () -> Math.PI;
		System.out.println("랜덤값 : " + s3.getAsDouble());
	}
}
