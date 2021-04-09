package com.hanzyn.section03.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

//write(byte[] b) 메서드로 데이터를 한번에 출력

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test2.txt", true); 
			
			byte[] b = new byte[26];
			byte data = 65;
			for(int i=0; i<b.length; i++) {
				b[i] = data;
				data++;
			}
			fos.write(b);
		} catch(IOException e) {
			System.out.println(e.getMessage()); //System.out 은 OutputStream 의 하위 클래스인 PrintStream 객체
		}
	}
}
