package com.hanzyn.section02.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * 
 * 입력스트림에 Buffer를 갖는 문자형 입력 스트림
 * 버퍼에 있는 내용을 한 줄씩 읽을 수 있는 readLine() 메서드를 갖는 보조 스트림이다.
 * 
 * 보조스트림 : 객체 생성 시 기존의 스트림을 갖고 새로운 특징을 나타내는 스트림으로, 스트림의 기능을 보완한다.
 * 	직접 데이터를 IO 하진 않지만 스트림의 기능을 향상시키거나 추가할 수 있어서
 *  스트림을 먼저 생성한 후 이를 이용해 보조스트림을 생성한다.
 *  */
public class BufferdReaderEx {
/*
 * 버퍼를 사용하는 이유
 * : IO 시 자바가 직접하지 않고 운영체제의 Native 메서드를 호출해서 수행하는데
 * 너무 빈번히 수행하면 Native를 자주 호출하므로 IO 효율이 떨어진다.
 * 버퍼에 모아서 처리하여 효율적으로 작동되게 하는 목적이다.
 * */
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/com/hanzyn/section01/inputStream/InputStreamEx.java");
			br = new BufferedReader(fr);
			
			String txt = null;
			while((txt = br.readLine()) != null) {
				System.out.println(txt);
			}
			
		} catch(IOException e) {
			
		} finally {
			try {
				fr.close();
				br.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
				
	}
}
