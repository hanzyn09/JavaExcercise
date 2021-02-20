package com.hanzyn.excercise;

public class Excercise2_sol {

	public static void main(String[] args) {
		
		System.out.println(new Out().new In().name);

	}

}

class Out{
	class In{
		String name = "JAVA";
	}
}