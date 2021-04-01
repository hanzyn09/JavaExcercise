package com.hanzyn.section01.interfaces;

//인터페이스를 구현하는 람다식을 작성하기

public class Excercise2 {
	public static void main(String[] args) {
		InterfaceLambda il = (x,y) -> x+y;
		System.out.println(il.sum(1,2));
	}
}

interface InterfaceLambda{
	public int sum(int x, int y);
}
