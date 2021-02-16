package com.hanzyn.section03.access2;

//우선 import 필수
import com.hanzyn.section03.access.Aclass;

//protected 처리된 변수와 메서드는 처리 가능.
//protected는 같은 패키지만 처리하지만 상속관계에서는 생성자에서 this 참조변수를 사용하면 처리 가능
public class CClass extends Aclass{

	CClass(){
		this.varA = "varA";
		//this.varA2 = "varA2"; //
		this.methodA();
		//this.methodA2(); //
	}
}
