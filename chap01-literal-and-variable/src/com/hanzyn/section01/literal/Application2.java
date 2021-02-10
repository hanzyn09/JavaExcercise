package com.hanzyn.section01.literal;

/*자료형 간 연산*/
public class Application2 {
	public static void main(String[] args) {
		

		System.out.println("========== 정수와 정수의 연산 ============");
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);  
		System.out.println(123 % 10);  
		
		System.out.println("========== 실수와 실수의 연산 ============");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);
		
		
		System.out.println("========== 정수와 실수의 연산 ============");
		System.out.println(123 + 0.5);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
	
		System.out.println("========== 문자의 연산 ============"); //숫자값
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');
		System.out.println('a' / 'b');
		System.out.println('a' % 'b');
		

		System.out.println("========== 문자와 정수의 연산 ============"); //숫자값
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 2);
		System.out.println('a' / 2);
		System.out.println('a' % 2);
		
		
		System.out.println("========== 문자와 실수의 연산 ============"); //숫자값
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0);
		
		
		System.out.println("========== 문자열의 연산 ============");
		System.out.println("hello" + "world");
		//System.out.println("hello" - "world");	
		//System.out.println("hello" * "world");    
		//System.out.println("hello" / "world");	
		//System.out.println("hello" % "world");	
		

		System.out.println("========== 문자열과 다른 자료형의 연산 ============");
		System.out.println("helloworld" + 123);
		System.out.println("helloworld" + 123.456);
		System.out.println("helloworld" + 'a');
		System.out.println("helloworld" + true);
		
		System.out.println("========== 숫자형태의 문자열 연산 ============");
		System.out.println("123" + "456");
		
		// boolean의 연산
//		System.out.println(true + false); 
//		System.out.println(true - false); 
//		System.out.println(true * false); 
//		System.out.println(true / false); 
//		System.out.println(true % false); 
		
		//boolean과 정수의 연산
//		System.out.println(true + 1); 
//		System.out.println(true - 1); 
//		System.out.println(true * 1); 
//		System.out.println(true / 2);
//		System.out.println(true % 2);
		
		// boolean과 실수의 연산
//		System.out.println(true + 1.0); 
//		System.out.println(true - 1.0); 
//		System.out.println(true * 1.0); 
//		System.out.println(true / 2.0); 
//		System.out.println(true % 2.0); 
		
		// boolean과 문자의 연산
//		System.out.println(true + 'a'); 
//		System.out.println(true - 'a'); 
//		System.out.println(true * 'a'); 
//		System.out.println(true / 'a'); 
//		System.out.println(true % 'a');
		
		// boolean과 문자열의 연산
		System.out.println("============ boolean과 문자열의 연산 ============");
		System.out.println(true + "a");  
//		System.out.println(true - "a"); 
//		System.out.println(true * "a"); 
//		System.out.println(true / "a");
//		System.out.println(true % "a");
	}
}









