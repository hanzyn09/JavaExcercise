package com.hanzyn.excercise;

public class Excercise2 {

	public static void main(String[] args) {
	
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.In();
	}

}

class Outer{
	public class Inner{
		String name = "JAVA";
		
		void In(){
			System.out.println(name);
		}
		
	}
}