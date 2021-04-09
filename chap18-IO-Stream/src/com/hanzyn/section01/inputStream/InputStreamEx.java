package com.hanzyn.section01.inputStream;

import java.io.IOException;
import java.io.InputStream;

/*
 * 바이트 기반 입력 스트림
 * 
 * 바이트 단위로 데이터가 전송되며 최상위 스트림은 InputStream이다.
 * InputStream은 하위클래스에서 공통으로 사용하기 위한 입력 관련 추상 메서드가 포함된 추상 클래스로,
 * 직접 객체로 생성될 수 없으며, 하위 클래스들이 상속받아 추상메서드를 구현하고 있다.
 * 
 * FileInputStream : 파일에서 읽음
 * ByteArrayInputStream : 메모리에서 읽음
 * FilterInputStream : 보조 스트림의 상위 클래스
 * 
 * read(), close()
 * */
public class InputStreamEx {
	public static void main(String[] args) {
		try {
			InputStream in = System.in; //콘솔에서 입력받아 출력
			int data = 0;
			while((data = in.read()) != -1) {
				System.out.println((char)data); //영문은 1byte, 한글은 2byte라서 깨짐. 한글은 문자 입출력 스트림 처리
			}
		} catch(IOException e) {}
	}
}

