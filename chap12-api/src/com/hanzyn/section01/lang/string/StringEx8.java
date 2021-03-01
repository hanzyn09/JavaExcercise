package com.hanzyn.section01.lang.string;

/*
 * vauleOf()를 활용하여 기본자료형에서 문자열로 형변환 할 수 있다.
 * == 매개변수만 다르기 때문에 overloading 가능.
 * 
 * 문자열을 기본자료형으로 변환하는 방법은 parse 하면 된다.
 * */
public class StringEx8 {

	public static void main(String[] args) {
		
		String[] str = {"1", "2", "3", "4"};
		
		int sum1 = 0;
		for (int i = 0; i<str.length ; i++) {
			sum1 += Integer.parseInt(str[i]);
		}
		System.out.println("Integer sum1 = " + sum1);
		
		long sum2 = 0;
		for (int i = 0; i<str.length ; i++) {
			sum2 += Long.parseLong(str[i]);
		}
		System.out.println("Long sum2 = " + sum2);
		
		double sum3 = 0;
		for (int i = 0; i<str.length ; i++) {
			sum3 += Double.parseDouble(str[i]);
		}
		System.out.println("Double sum3 = " + sum3);

	}

}
