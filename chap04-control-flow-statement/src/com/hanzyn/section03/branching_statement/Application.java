package com.hanzyn.section03.branching_statement;

public class Application {

	public static void main(String[] args) {
		A_break a = new A_break();
		//a.testSimpleBreakStatement();
		//a.testSimpleBreakStatement2();
		//a.testJumpBreak();

		B_continue b = new B_continue();
		//b.testSimpleContinueStatement();
		b.testJumpContinue();
	}

}
