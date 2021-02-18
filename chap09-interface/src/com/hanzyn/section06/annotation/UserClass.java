package com.hanzyn.section06.annotation;

public class UserClass {
	
	@UserAnnot (value="A")
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	
	@UserAnnot (value="B", number=10)
	public void methodB() {
		System.out.println("methodB() 실행");
	}

	//두 개의 메서드에 어노테이션 적용.
	//괄호 안 의 속성 값이 어노테이션의 속성으로 전달 된다.
}
