package com.hanzyn.section03.userDefined;

import java.util.Scanner;

/*
 * 자바에서 제공하는 예외 클래스 외에 개발자가 직접 새로운 예외 클래스를 정의해서 사용할 수 있다.
 * throwable 클래스나 그 하위 클래스로부터 상속받아 사용자 정의 예외클래스를 생성한다.
 * Exception 클래스로부터 상속받아 클래스를 만드는 경우가 많다.
 * */

public class ExceptionEx8 {
	static String user_id = "seo";
	static String user_pw = "smg1234";
	
	public static void main(String[] args) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("ID : ");
			String input_id = sc.nextLine();
			
			System.out.println("PW : ");
			String input_pw = sc.nextLine();
			
			/********************************************************************************************/
			if(!user_id.equals(input_id)) { //값이 일치하지 않으면 LoginException클래스를 통해 예외 메시지를 전달.
				throw new LoginException("Check your ID");
			}
			else if(!user_pw.equals(input_pw)) {
				throw new LoginException("Check your PW.");
			}
			else {
				System.out.println("success");
			}
			/********************************************************************************************/
		
		} catch (Exception e) { //위의 if else 구문이 main() 메서드 내에서 try catch 문을 통해 예외 처리가 되고 있다. 
			System.out.println(e.getMessage()); //LoginException 예외 발생시 메시지 출력.
		}
		
	
	}
}
