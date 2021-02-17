package com.hanzyn.section01.arithmetic_operator;

public class In_Decrement2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); //여기서는 10
		//a=11, b=20, c=30
		System.out.println((++a) + (b++)); //12 + 20
		//a=12, b=21
		System.out.println((a++) + (--b) + (--c)); //12 + 20 + 29
		//a=13, b=20, c=29

	}

}
