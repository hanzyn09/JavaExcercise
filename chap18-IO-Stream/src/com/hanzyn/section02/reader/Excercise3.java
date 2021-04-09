package com.hanzyn.section02.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//FileReader로 파일을 읽고 보조스트림 BufferedReader로 한줄씩 출력하기

public class Excercise3 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/com/hanzyn/section02/reader/InputStreamEx2.java");
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
