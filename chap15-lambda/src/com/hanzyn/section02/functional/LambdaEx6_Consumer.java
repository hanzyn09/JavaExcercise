package com.hanzyn.section02.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

//Consumer는 매개변수는 있고 리턴타입은 없는 functional interface
//추상메서드는 accept이다.

public class LambdaEx6_Consumer {
	public static void main(String[] args) {
		Consumer<String> c1 = name -> System.out.println("제 이름은 " + name + "입니다.");
		c1.accept("홍길동");
		
		BiConsumer<String, String> c2 = (lastname, firstname) -> System.out.println("제 이름은 " + lastname + firstname + "입니다.");
		c2.accept("홍", "길동");
		
		DoubleConsumer c3 = (score) -> System.out.println("제 점수는 " + score + "입니다.");
		c3.accept(95.9);
		
		ObjIntConsumer<String> c4 = (lecture, i) -> {System.out.println("제 " + lecture +"점수는 " + i + "입니다.");};
		c4.accept("국어", 100);
	}
}


