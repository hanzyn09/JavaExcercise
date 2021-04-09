package com.hanzyn.section01.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 경로설정 방법
 * 1. 절대 경로
 * http://www.korea.com/
 * c:\windows\temp.dat
 * 
 * 2. 상대 경로 : 현재 위치를 기준으로 설정
 * ../ : 상위 디렉토리
 * src/sample.java : 현재 디렉토리 안의 src 안의 파일
 * ../bin/sample.class : 현재 디렉토리의 상위 디렉토리 안의 bin 안의 파일
 * */


public class FileInputStreamEx {
	/*
	 * 파일 인풋 스트림 클래스
	 * 
	 * 파일에서 바이트 단위로 데이터를 읽을 수 있는 기능을 가진 클래스
	 * 
	 * 두개의 생성자를 갖는다.
	 * 1. 문자열을 매개변수로 받는다
	 * 	: 경로까지 포함된 파일명을 지정할 수 있는 값
	 * 
	 * 2. 파일 객체를 매개변수로 받는다
	 * 	: 파일 클래스의 객체를 매개변수로 지정할 수 있다.
	 * 
	 * */
	public static void main(String[] args) {
		//파일명을 문자열로 매개변수로 지정해 read() 메서드로 읽어서 출력
		
		try {
			FileInputStream fis = new FileInputStream ("src/com/hanzyn/section01/inputStream/InputStreamEx.java");
			int data = 0;
			while((data = fis.read()) != -1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {}
	}
}
