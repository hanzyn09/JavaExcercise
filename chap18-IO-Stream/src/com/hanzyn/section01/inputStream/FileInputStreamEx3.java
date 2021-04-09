package com.hanzyn.section01.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

//read(byte[] b) 와 비슷한 read(byte[] b, int off, int len) 메서드를 이용한 예제

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		
		FileInputStream fis = null; //객체를 먼저 선언 해준다.
		
		try {
			fis = new FileInputStream("src/com/hanzyn/section01/inputStream/InputStreamEx.java");
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while((data = fis.read(buf, 0, buf.length)) != -1) { //파일에서 읽은 내용을 buf 배열의 0번지부터 저장, buf.length만큼 읽어 buf 배열에 저장
				System.out.println(new String(buf, 0, data));
			}
		} catch(IOException e) {
			
		} finally {
			try {
				fis.close(); //close()를 통해서 시스템 자원을 반납하고 스트림을 해제 : 반드시 실행되어야 한다 !!!
			} catch(Exception e) { //예외 발생 가능성이 있으므로 예외처리를 해준다
				System.out.println(e);
			}
		}
	}
}
