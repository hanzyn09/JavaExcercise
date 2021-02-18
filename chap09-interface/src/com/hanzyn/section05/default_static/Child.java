package com.hanzyn.section05.default_static;

//parent를 상속받고, 인터페이스 두개를 구현(다중 구현)한다.
public class Child extends Parent implements MyInterface1, MyInterface2{
	
	//defaultMethod()가 interface1과 interface2에도 있기 때문에
	//구현클래스에서는 반드시 메서드 재정의(overriding) 필요.
	@Override
	public void defaultMethod() {
		System.out.println("Child 클래스의 default 메서드");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}
	
	/*각 인터페이스의 default 메서드를 실행하기 위해 interface.super 키워드로 해당메서드를 실행시킨다.
	 * 
	 * "default 메서드"는 일반 메서드 이기 때문에 "객체로 접근"해야 하고, 
	 * 상위 클래스는 super 키워드를 이용한다.
	 * 
	 * 어느 인터페이스가 상위인지 알수 없기때문에 인터페이스명까지 적고 super를 붙인 것이다
	 * 
	 */

}

/*상속은 하나의 클래스만 (단일 상속)
 * 구현은 여러 인터페이스를 (다중 구현) 구현 할 수 있기때문에 이름이 같으면 구분을 정확히 해주어야 한다.*/
