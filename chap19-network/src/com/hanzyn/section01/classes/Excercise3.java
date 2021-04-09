package com.hanzyn.section01.classes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

//URL 클래스를 이용하여 해당 url 페이지를 읽어와 InputStreamReader 클래스로 객체를 생성하여 출력

public class Excercise3 {
	public static void main(String[] args) {
		try {
			URL url = null;
			url = new URL("https://www.google.co.kr");
			
			int data =0;
			try {
				Reader is = new InputStreamReader(___);
				while((data = is.read()) != -1) {
					System.out.println((char)data);
				}
				System.out.println();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
