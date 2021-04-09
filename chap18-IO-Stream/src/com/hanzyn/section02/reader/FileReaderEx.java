package com.hanzyn.section02.reader;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 클래스
 * 
 * FileInputStream 과 마찬가지로 파일을 읽을 수 있다.
 * 생성자의 매개변수는 파일의 경로나, File 객체로 지정할 수 있다.
 * 파일이 존재하지 않으면 FileNotFoundException 예외를 발생시킨다.
 * fis와의 차이점은 한글이 깨지지 않는다는 것 : 문자 스트림으로 한 글자씩 읽기 때문이다.
 * */
public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader ("src/com/hanzyn/section01/inputStream/InputStreamEx.java");
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.println((char)data);
			}
		} catch(IOException e) {
			
		} finally {
			try {
				fr.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
