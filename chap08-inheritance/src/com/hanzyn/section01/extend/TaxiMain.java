package com.hanzyn.section01.extend;

//overriding(메서드 재정의): 부모클래스의 메서드를 자식클래스가 변경해서 정의한다.
//중단하다, 우선시하다.
//1. 부모클래스와 자식클래스의 선언부가 동일해야함. (다르면 overloading 임)
//2. 자식클래스의 재정의 된 메서드의 접근 제한자의 사용 범위 > 부모클래스의 메서드 접근 제한자.
// 즉, 자:부 = public : private != private : public
public class TaxiMain {

	public static void main(String[] args) {
		
		Taxi t = new Taxi();
		t.go();

	}

}

/*
 * overriding vs. overloading
 * 관계: 상속 vs. 같은 클래스
 * 메서드명: 동일 vs. 동일
 * 매개변수: 동일 vs. 다름
 * 리턴타입: 동일 vs. 상관없음
 * 접근제한: 같거나 넓은 자식의 범위 vs. 상관없음*/
 