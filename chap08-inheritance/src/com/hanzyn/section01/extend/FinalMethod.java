package com.hanzyn.section01.extend;

//클래스와 메서드 앞에도, 변수앞에 처럼 final이라는 키워드를 사용할 수 있다.
//단, final 클래스는 상속이 불가능하다. == 다른 클래스의 부모 클래스가 될 수 없다.
//e.g. String, Math가 final class이다.

public class FinalMethod {
	
	void method() {
		// 재정의 가능
	}

	final void finalMethod() {
		// 재정의 불가능
	}

}

class SubFinalMethod extends FinalMethod{
	
	void method() { //재정의 가능
		System.out.println("method() 재정의");
	}
	
//	void finalMethod() { //재정의 불가
//		System.out.println("fianlMethod() 재정의");
//	}
}
