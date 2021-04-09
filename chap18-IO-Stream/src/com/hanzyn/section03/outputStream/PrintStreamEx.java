package com.hanzyn.section03.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * PrintStream
 * : OutputStream 의 하위 클래스 중 출력 기능을 강화 시킨 스트림 클래스
 * 
 * print(), println(), printf() 가 있다.
 * 
 * 이 메서드들은 모든 자료형을 출력할 수 있으며, 예외 처리 없이도 출력할 수 있다.
 * 
 * OutputStream 클래스의 출력 메서드는 write() 인데
 * 이는 예외처리가 필요하고, 출력 가능한 자료형도 한정적이다. 
 * */
public class PrintStreamEx { //PrintStream은 예외 처리가 필요 없다.

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("print.txt", true); 
			PrintStream ps = new PrintStream(fos);
			ps.println("홍길동");
			ps.println(1111);
			ps.println(true);
			ps.println(3.14);
			ps.flush();
			ps.close();
			
		} catch(FileNotFoundException e) { //try~catch 문은 PrintStream 이 아닌, FileOutputStream 객체를 생성할 때 파일이 존재하지 않는 예외를 처리하기 위한것.
			System.out.println(e.getMessage());
		}
	}
}
