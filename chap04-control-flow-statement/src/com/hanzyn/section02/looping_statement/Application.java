package com.hanzyn.section02.looping_statement;

public class Application {

	public static void main(String[] args) {
		A_for a = new A_for();
		//a.testSimpleForStatement();
		//a.testForExample1();
		//a.testForExample2();
		//a.testForExample3();
		//a.testForExample4();
		//a.printSimpleGugudan();
		
		A_nestedFor aa = new A_nestedFor();
		//aa.printGugudanFromTwoToNine();
		//aa.printUpgradeGugudanFromTwoToNine();
		//aa.printStarInputRowTimes();
		//aa. printTriangleStars();
		
		B_while b = new B_while();
		//b.testSimpleWhileStatement();
		//b.testWhileExample1();
		//b.testWhileExample2();
		//b.testWhileExample3();
		
		C_doWhile c = new C_doWhile();
		//c.testSimpleDoWhileStatement();
		c.testSimpleDoWhileExample1();
	}
}