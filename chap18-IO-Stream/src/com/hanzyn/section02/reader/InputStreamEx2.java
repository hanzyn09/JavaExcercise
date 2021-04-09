package com.hanzyn.section02.reader;
/*
 * 문자 기반 입력 스트림의 최상위 클래스 : Reader 클래스
 * 
 * 추상 메서드를 갖는 추상 클래스로, 직접 객체로 생성될 수 없다.
 * Reader 클래스의 객체는 읽어들일 때의 기준이 문자 기준이다. == 2byte 기준
 * 
 * 바이트 기반 입력스트림은 InputStreamReader 클래스를 통해 Reader 클래스의 객체로 생성할 수 있다.
 * 
 * Reader 클래스의 하위 클래스로는 FileReader, InputStreamReader, BufferedReader 가 있다.
 * 
 * read(), close()
 * */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//콘솔에서 입력받는 예제

public class InputStreamEx2 {
	
	public static void main(String[] args) {
		try {
			//InputStreamReader 객체 생성
			Reader in = new InputStreamReader(System.in);
			int data = 0;
			while ((data = in.read()) != -1) {
				System.out.println((char)data);
			}
			
		} catch(IOException e) {}
	}
	
}
