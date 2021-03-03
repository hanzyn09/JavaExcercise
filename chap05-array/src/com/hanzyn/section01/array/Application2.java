package com.hanzyn.section01.array;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		/*배열의 선언
		 * 자료형[] 변수명;
		 * 자료형 변수명[];
		 * 
		 * stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것*/
		
		int[] iarr;
		char carr[];
		
//		iarr = new int[]; //크기를 지정해주지 않아서 에러 발생 ==> 배열 할당 시 반드시 배열의 크기를 지정해주어야한다.
		iarr = new int[5];
		carr = new char[10];
		
		int[] iarr2 = new int[5];
		char[] carr2 = new char[10];
		
		System.out.println(iarr2); //참조변수 값. 주솟값을 반환한다.
		System.out.println(carr2);
		
		/*hashCode() : 객체의 주솟값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다. */
		System.out.println(iarr2.hashCode()); //참조변수 값. 주솟값을 반환한다.
		System.out.println(carr2.hashCode());
		/*동일 객체: 주솟값이 같은 객체, 동등 객체: 주솟값이 달라도 안에 들어있는 값이 같은 객체*/
		
		System.out.println(iarr2.length);
		System.out.println(carr2.length);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 할당할 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println(darr.hashCode());
		System.out.println(darr.length);
		/*** 배열의 크기는 한번 지정하면, 변경할 수 없다 ***/
		
		darr = new double[30]; //사이즈를 변경한게 아니라, 새로운 배열을 생성해서 그 주솟값을 참조하는 레퍼런스변수에 덮어 쓴것이다.
		System.out.println(darr.hashCode()); //전혀 새로운 것이 할당 됐기 때문에 다른 값이 출력된다.
		System.out.println(darr.length);
		
		//한번 할당된 배열은 지울 수 없다.
		//다만, 레퍼런스 변수를 null로 변경해서 더이상 주소를 참조할 수 없게된 배열은
		//일정 시간이 지난 후 gc 가 삭제시킨다.
		darr = null;
		System.out.println(darr.length); //널포인터exception
		
	}

}
