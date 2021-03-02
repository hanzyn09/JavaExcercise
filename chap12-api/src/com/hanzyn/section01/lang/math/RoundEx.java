package com.hanzyn.section01.lang.math;

//원하는 소수점에서 반올림한 값 구하기

public class RoundEx {

	public static void main(String[] args) {
		
		//원주율을 소수점 3자리로 반올림
		double v1 = Math.PI * 1000;
		double v2 = Math.round(v1);
		double v3 = v2 /1000.0;
		System.out.println(v3);
		
		//한 줄로 표현
		System.out.println(Math.round(Math.PI  * 1000) / 1000.0);

	}

}
/*Math 클래스는 플랫폼에 따라서 메서드의 호출 결과가 달라질 수 있다.
 * 대용으로 StrictMath 클래스가 존재한다.
 * == 모든 플랫폼에서 동일한 연산 결과를 리턴한다.
 * Math보다 유용할 수 있지만, 플랫폼의 특정 기능을 사용하지 않아서 연산 속도가 떨어진다.*/
 