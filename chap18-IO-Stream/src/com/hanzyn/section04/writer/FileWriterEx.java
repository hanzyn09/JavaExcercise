package com.hanzyn.section04.writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Write
 * : 문자기반 출력 스트림의 최상위 클래스
 * 
 * FileWriter, OutputStreamWriter, BufferedWriter 클래스가 있다.
 * 
 * write(), flush(), close()
 *
 * */
public class FileWriterEx {
/*
 * FileWriter 스트림 클래스
 * 
 * Writer의 하위클래스 중 가장 많이 사용하는 클래스.
 * 생성자의 매개변수에 파일명/파일객체, append 를 넣을 수 있다.
 * */
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter ("test3.txt");
			
			//문자 하나 출력
			fw.write('A');
			
			//문자 배열 출력
			char[] buf = {'B', 'C', 'D'};
			fw.write(buf);
			
			//문자 배열 off 부터 len 갯수만큼 출력
			fw.write(buf, 1, 2);
			
			//문자열 출력
			fw.write("저는 홍길동 입니다.");
			
			fw.flush();
			fw.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
