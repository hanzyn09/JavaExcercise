package com.hanzyn.section05.packages;

//final 클래스: 상속 불가. e.g. String, Math
//final 메서드: 재정의 불가. 오버라이딩 불가. 상속관계에서 자식은 부모 메서드를 재정의할 수 있는데 final 메서드는 불가.
//final 변수/상수: 값 변경 불가. 초기값 지정 후 변경불가한데, 생성자에서 초기화하는 경우엔 변경 가능.


public class FinalEx {

	public static void main(String[] args) {
		Final f = new Final();
		// f.number = 200; //error. 변경 불가

	}

}

class Final{
	final int number;
	
	Final(){
		number= 100;
	} //생성자에서 초기화를 가능하게 해준 이유: 객체 마다 다른 값을 가질 수 있게 하기 위한 것.
}