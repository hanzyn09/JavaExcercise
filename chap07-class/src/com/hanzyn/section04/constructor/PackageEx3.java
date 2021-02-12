package com.hanzyn.section04.constructor;

//다른 패키지에 있기때문에 import 하였음.
import com.hanzyn.section05.pacakge.TestPackage;
//import com.hanzyn.*; //이하 구조 모두 포함을 의미

public class PackageEx3 {

	public static void main(String[] args) {
		
		TestPackage test = new TestPackage();
		test.method();

	}

}
