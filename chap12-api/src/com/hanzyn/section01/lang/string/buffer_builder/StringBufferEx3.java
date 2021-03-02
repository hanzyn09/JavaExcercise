package com.hanzyn.section01.lang.string.buffer_builder;
/*
 * StringBuilder 클래스는 
 * StringBuffer 클래스와 메서드도 동일하고 거의 비슷하나,
 * 모든 메서드가 스레드에 동기화되어 있지 않다는 차이점이 있다.
 * (StringBuffer 클래스의 모든 메서드는 스레드에 동기화되어 있다.)
 * 
 * ==> String 클래스와 문자열을 다루는 방법, 구조도 비슷하고
 * 나중에 toString()으로 다시 문자열로 변환해야하는 번거로움이 있다.
 * 
 * 하지만, 다양한 메서드를  통해 문자열 값을 추가 변경할 수 있다.
 * 특히 속도가 매우 빠르다.
 * 
 * 대량의 문자열을 처리하는 경우
 * String 보다 StringBuffer 클래스나 StringBuilder 클래스를 사용한다.
 * 
 * */

//String 클래스로 문자열끼리 + 연산을 백만번 수행하는 소스 : 실행 시간 측정
public class StringBufferEx3 {

	public static void main(String[] args) {
		
		//시작
		long start = System.currentTimeMillis();
		
		String str = "";
		for(int i = 0 ; i<1000000 ; i++) {
			str += i;
		} /*연산할때마다 새로운 객체를 생성하기 때문에 속도가 느리다.*/
		
		//끝
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start) /1000);

	}

}
