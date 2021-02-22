package com.hanzyn.section01.basicStructure;

//다중 catch문
//상위 클래스는 가장 하단에 배치한다.
public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
			System.out.println(3/0); //실행되지않음
			Integer.parseInt("a"); //실행되지않음
			//11 line은 NumberFormatException.
			//해당 에러에 대한 예외처리를 안해놔서 마지막 exception 구문이 실행된다.
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음.");
		} catch (ArrayIndexOutOfBoundsException e) { //위 catch문 실행 후 여기로 옴.
			System.out.println("인덱스 범위 초과");
		} catch (Exception e) { // 모든 예외클래스의 상위클래스여서 모든 예외를 잡아낸다.
			System.out.println("예외 발생"); //상위클래스는 가장 하단에 배치 !!!
		}

	}

}
