package com.hanzyn.section02.throwException;

//예외 재발생
/*하나의 메서드에서 발생할 수 있는 예외가 여러개인 경우, 
 * try catch 문을 통해서도 처리하고, 선언부에도 선언하여 양쪽에서 처리하도록 한다.
 * : try catch문으로 예외를 처리한 후, 강제로 예외를 다시 발생시키는 방법으로 처리*/
public class Throws2 {

	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("main() 예외처리"); //여기서도 throw로 떠넘겼다면 더이상 처리하지 못하고 프로그램이 에러를 출력하면서 종료됨.
			System.out.println(e.getMessage());
		}

	}
	
	static void first() throws Exception{
		try {
			second();
		} catch (Exception e) {
			System.out.println("first() 예외처리"); //second()에서 예외 재발생했기 때문에 반드시 예외처리를 해야함
			throw e; //예외 재발생
		}
	}
	static void second() throws Exception{
		try {
			throw new Exception ("예외 발생"); //예외를 강제 발생
		} catch (Exception e) {
			System.out.println("second() 예외처리"); //처리하고
			throw e; //예외 재발생
		}
		
	}

}
