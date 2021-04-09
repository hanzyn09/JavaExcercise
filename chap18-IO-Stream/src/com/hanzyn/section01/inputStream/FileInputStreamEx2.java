package com.hanzyn.section01.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

//read(byte[] b) 로 내용을 한꺼번에 읽어와서 출력

public class FileInputStreamEx2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/com/hanzyn/section01/inputStream/InputStreamEx.java");
			int data = 0;
			byte[] buf = new byte[fis.available()]; //fis.available() : 해당 파일의 읽기 가능 바이트 수
			while((data = fis.read(buf)) != -1) { //파일에서 읽은 내용을 buf에 저장
				System.out.println(new String (buf, 0, data)); //바이트 배열을 0~바이트 수만큼 문자열로 변환
			}
		} catch(IOException e) {}
	}
}
