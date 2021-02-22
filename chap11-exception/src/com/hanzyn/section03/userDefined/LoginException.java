package com.hanzyn.section03.userDefined;
/*
 * Exception 클래스를 상속받아 클래스를 정의했다.
 * 추가로 변수나 메서드도 정의할 수 있다.
 * 생성자를 통해 메시지를 입력받아 상위 클래스(Exception)의 생성자로 메시지를 매개변수로 넘겨주며 실행한다 : super()
 * */

//사용자 정의 예외 클래스
public class LoginException extends Exception{
	LoginException(String msg){
		super(msg);
	}
}
