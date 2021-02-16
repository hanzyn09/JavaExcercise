package com.hanzyn.section03.access;

/*접근제한자
 * public: 아무데서나 자유롭게
 * private: 자신의 클래스 내에서만
 * default: 같은 패키지 내에서
 * protected: 같은 패키지 내에서 or 상속관계에 있으면 생성자에서 this 참조변수를 사용해서 처리 가능*/
public class Aclass {
	protected String varA;
	String varA2;
	
	protected void methodA() {
		System.out.println("methodA");
	}
	void methodA2() {
		System.out.println("methodA2");
	}
}
