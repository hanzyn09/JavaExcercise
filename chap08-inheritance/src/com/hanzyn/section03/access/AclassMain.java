package com.hanzyn.section03.access;

//Aclass와 AclassMain은 같은 클래스안에 있기 때문에 
//protected, default 접근제한자를 가진 변수와 메서드 모두 사용이 가능함
public class AclassMain {

	public static void main(String[] args) {
		
		Aclass ac = new Aclass();
		ac.varA = "varA";
		ac.varA2 = "varA2";
		
		ac.methodA();
		ac.methodA2();

	}

}
