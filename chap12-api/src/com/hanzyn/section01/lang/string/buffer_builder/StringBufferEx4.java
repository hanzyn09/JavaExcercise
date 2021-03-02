package com.hanzyn.section01.lang.string.buffer_builder;

//StringBuffer 클래스로 문자열끼리 + 연산을 백만번 수행하는 소스 : 실행 시간 측정
public class StringBufferEx4 {

	public static void main(String[] args) {
		//시작
		long start = System.currentTimeMillis();
				
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i<1000000 ; i++) {
			sb.append(i);
		}
				
		//끝
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start) /1000);

	}

}
