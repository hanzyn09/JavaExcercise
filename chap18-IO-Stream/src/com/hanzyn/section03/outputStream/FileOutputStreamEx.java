package com.hanzyn.section03.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 바이트 기반 출력 스트림 (OutputStream)
 * FileOutputStream, ByteArrayOutputStream, FilterOutputStream 이 있다.
 * 
 * write(), flush(), close()
 * 
 * flush() : 출력버퍼를 강제로 비워서 출력
 * */
public class FileOutputStreamEx {
/*
 * 생성자의 매개변수로는 파일명 or 파일객체를 보낼 수 있고,
 * append 라는 boolean 변수가 기존파일에 이어서 쓸지 or 새로운 파일로 쓸지 여부를 결정하게 한다.
 * boolean append = true 이면 기존파일에 추가한다는 뜻이다.
 * 
 * */
	
	//write() 메서드로 파일에 데이터 출력
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			//기존파일에 추가를 원할 경우
			//FileOutputStream fos = new FileOutputStream("test.txt", true);
			
			fos.write(68); //아스키코드값이 저장 : A
			fos.write(66); // B
			fos.write(67); // C
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
