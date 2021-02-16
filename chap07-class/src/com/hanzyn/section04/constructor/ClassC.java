package com.hanzyn.section04.constructor;

import com.hanzyn.section05.packages.ClassA;

public class ClassC {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.print();
		
//		ClassB cb = new ClassB(); //접근 제한자 때문에 에러발생
//		cb.print(); //같은 패키지 안에 없다. (default)
	}

}
