package com.hanzyn.section02.throwException;

//예외 떠넘김
public class Throws {

	public static void main(String[] args) {
		try{
			first();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void first() throws Exception{ //메서드에 예외 선언. 콤마(,) 를 통해 여러개 넣을 수 있음
		second();
	}
	static void second() throws Exception{ 
		throw new Exception("예외 발생");
	}
	/*
	 * second()에서 예외를 강제로 발생시켰는데, 직접 예외 처리를 하지 않고
	 * 메서드 선언부에서 throws하여 first()로 떠넘겼다.
	 * first()메서드도 try catch 하지않고 예외처리를 떠넘겼다.
	 * main()메서드에서는 try catch로 예외를 받아서 출력했다.
	 * 
	 * 만약 first() 메서드에서 throws를 하지않거나,
	 * main()에서 try catch 문으로 처리해주지 않으면 컴파일 에러가 난다.
	 * 
	 * 던져진 예외를 반드시 try catch문으로 처리하던 다시 떠넘기던 해야한다.
	 * 
	 * 메서드에서 예외를 떠넘기는 건 나쁜게 아니다.
	 * 오히려 메서드 선언부에 예외 클래스를 적어줌으로써 코드 해석 시 '이 메서드는 어떤 예외가 발생하겠구나'예측할 수 있다.*/
}
