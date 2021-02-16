package com.hanzyn.section05.packages;

//패키지명을 생략해도 되는 경우
//1. 작성 중인 클래스와 사용하려는 클래스가 같은 패키지에 있다.
//2. 상단 import에 이미 정의 되어 있다.
//3. java.lang 패키지에 있는 클래스를 사용한다. (System, String class)

//import 단축키: ctrl + shift + o
//동일한 클래스명인데 다른 패키지에도 있다면 선택해주어야 한다.

public class PackageEx2 {

	public static void main(String[] args) {
		
		//같은 패키지 안에 있기 때문에 클래스명만으로 불러왔음.
		TestPackage test = new TestPackage();
		test.method();

	}

}
