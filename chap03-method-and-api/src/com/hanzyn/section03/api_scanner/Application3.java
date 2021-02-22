package com.hanzyn.section03.api_scanner;

import java.util.Scanner;

//next(); 이후 scanner사용시 공백 처리의 중요성
//공백포함 문자열 입력 시 오류나는 예제
public class Application3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요 : "); 
		String str1 = sc.next(); //nextLine 이면 오류 안남. //안녕하세요 반갑습니다.
								//안녕하세요
								//반갑습니다. 		스플릿되어 저장된다.
		
		System.out.println("str1 : " + str1); //안녕하세요
		
		String str2 = sc.next(); //반갑습니다.
		System.out.println("str2 : " + str2); //반갑습니다.
		
		String str3 = sc.next(); //입력을 기다리게 된다.
		System.out.println("str3 : " + str3); 
		
		//18-22 line 대신 sc.nextLine(); 을 추가해줘도 오류가 나지않는다. 공백포함 문자열을 받아줌.
		
		System.out.println("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		//에러 발생 : 입력하라했는데 이미 입력된 것을 가져다 써서 문제 발생. 반갑습니다. 를 int로 받아서 에러.
		//앞에서 공백포함 문자열 입력시 오류
		
		/*****************************************************************************************/
		
		//정수, 실수, 논리값 입력 후 nextLine()으로 받은 후 문자열 입력받을 때
		System.out.println("공백이 있는 문자열 하나를 입력해주세요 : ");
		sc.nextLine(); //엔터값을 받아준다. 그러면 39번째에서, 입력받은 걸 보여줄 수 있다.
		String str4 = sc.nextLine();
		System.out.println("str4 : " + str4); //입력전에 바로 출력된다. 앞전에서 엔터값을 입력받아버렸다.
	}

}
