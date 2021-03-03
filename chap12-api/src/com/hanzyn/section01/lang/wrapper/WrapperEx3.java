package com.hanzyn.section01.lang.wrapper;

/*문자열을 숫자(기본자료형)으로 변환 : ___.parse___("")
 * 문자열을 Wrapper 클래스 객체로 변환 : ___.valueOf("")*/

public class WrapperEx3 {

	public static void main(String[] args) {
		String number = "100";
		
		int i1 = Integer.parseInt(number); // 일반적
		int i2 = new Integer(number).intValue();
		int i3 = Integer.valueOf(number); 
		//valueOf() 는 리턴타입이 Integer 객체인데, int 변수에 대입이 된것은 자동으로 기본자료형으로 변환 된 것.
		// == autoboxing
		
		System.out.println("i1 : " + i1);
		System.out.println("i2 : " + i2);
		System.out.println("i3 : " + i3);
	}

}
