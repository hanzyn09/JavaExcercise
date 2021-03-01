package com.hanzyn.section01.lang.system;

public class PropertyEx2 {

	public static void main(String[] args) {
		for(String var : System.getenv().keySet()) {
			System.out.println(var + "=" + System.getenv(var));
			//getenv()메서드는 환경변수를 읽어올 수 있다.
		}

	}

}
