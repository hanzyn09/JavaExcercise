package com.hanzyn.section01.arithmetic_operator;

public class In_Decrement {

	public static void main(String[] args) {
		// 증감 연산자
		// 피연산자의 앞/뒤에 사용 가능.
		// ++ : 1 증가, --: 1 감소
		
		int num = 20;
		System.out.println("num: "+ num);
		
		num++;
		System.out.println("num: "+ num);
		
		++num;
		System.out.println("num: "+ num);
		
		num--;
		System.out.println("num: "+ num);
		
		--num;
		System.out.println("num: "+ num);
		
		int firstNum = 20;
		int result = firstNum++ * 3; //60
		
		System.out.println(result);
		System.out.println(firstNum);
		
		int secondNum = 20;
		int result2 = ++secondNum * 3;
		System.out.println(result2); //63
	}

}
