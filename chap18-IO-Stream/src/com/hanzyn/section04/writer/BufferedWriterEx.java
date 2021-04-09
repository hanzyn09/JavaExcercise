package com.hanzyn.section04.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Buffered 보조 스트림
 * 
 * 보조 스트림 중에서 아주 유용하게 자주 사용된다.
 * BufferedReader 스트림 클래스는, 스트림 클래스 객체를 먼저 생성하고, 그 객체를 Buffered 스트림 클래스 생성자의 매개변수를 넘겨주는 방식이었다.
 * Buffered 스트림 클래스를 사용하는 이유는
 * 바이트 기반 스트림이나 문자 기반 스트림과 마찬가지로 속도가 빠르다. (용량이 클수록 속도차이가 크게 느껴진다)
 * 버퍼는 중간에서 임시로 저장하는 역할을 하는데 하나하나 읽어오고 저장하는게 아니라 특정 길이만큼 모아뒀다가 한번에 저장하므로 속도가 훨씬 빠르다.
 * 
 * BufferedInput/OutputStream, BufferedReader/Writer가 있다.
 * 
 * */
public class BufferedWriterEx {
//FileEriter 클래스를 이용한 파일 출력 예제를 BufferedWriter 보조 스트림을 추가해서 수정하기 
	
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test4.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//문자 하나 출력
			bw.write('A');
			
			//문자 배열 출력
			char[] buf = {'B', 'C', 'D'};
			bw.write(buf);
			
			//문자 배열 off 부터 len 갯수만큼 출력
			bw.write(buf, 1, 2);
			
			//문자열 출력
			bw.write("저는 홍길동 입니다.");
			
			bw.flush();
			bw.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
			}
	}
}
