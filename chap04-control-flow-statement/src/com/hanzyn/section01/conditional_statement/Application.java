package com.hanzyn.section01.conditional_statement;

public class Application {

	public static void main(String[] args) {
		A_if a = new A_if();
		a.testSimpleIfStatement();
		a.testNestedIfStatement();
		
		B_ifElse b = new B_ifElse();
		b.testNestedIfElseStatement();
	}

}
