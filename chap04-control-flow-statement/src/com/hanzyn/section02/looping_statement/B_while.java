package com.hanzyn.section02.looping_statement;

import java.util.Scanner;

public class B_while {
	public void testSimpleWhileStatement() {
		/*while 문 표현식
		 * 
		 * while(조건식){
		 * 	조건을 만족하는 경우 수행할 구문(반복할 구문);
		 * 	증감식;
		 * }
		 * 
		 * */
		
		/*1~10 증가시키면서 i값 출력하는 반복문*/
		System.out.println("===== for =====");
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("===== while =====");
		for(int j = 1; j<=10 ; j++) {
			System.out.println(j);
		}
	}

	public void testWhileExample1() {
		/*입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기*/
		Scanner sc = new Scanner(System.in);
		System.out.println(" 문자열 입력 : ");
		String str = sc.nextLine();
		
		/* charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
		 * length() : String 클래스의 메서드로, 문자열의 길이를 int형으로 반환한다.
		 * 주의 : index 는 0 부터 시작하고, 마지막 인덱스는 항상 길이보다 1 작은 숫자를 가진다.
		 * 		 존재하지않는 index 접근시 StringIndexOutOfBoundsException 발생.
		 * */
		System.out.println("===== for =====");
		for(int i = 0; i < str.length(); i++){
			char ch =str.charAt(i);
			System.out.println(i + " : " + ch);
		}
		
		System.out.println("===== while =====");
		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
		
	}

	public void testWhileExample2() {
		/*정수를 입력 받아 1 부터 그 정수까지의 합계를 구한다*/
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("1 부터 "+num +" 까지의 합 : " + sum);
	}
	public void testWhileExample3() {
		/*중첩 while 을 이용하여 구구단 출력*/
		int dan = 2;
		while(dan < 10) {
			int su = 1;
			while(su < 10) {
				System.out.println(dan + " * " + su + " = " + (dan*su));
				su++;
			}
			System.out.println();
			dan++;
		}
	}
}
