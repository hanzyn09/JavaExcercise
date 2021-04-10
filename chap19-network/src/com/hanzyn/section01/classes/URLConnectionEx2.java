package com.hanzyn.section01.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * URL클래스로 웹페이지의 내용을 읽어오는 예제 _ 문자기반스트림*/
public class URLConnectionEx2 {
	public static void main(String[] args) {
		URL url = null;
		String address = "https://www.naver.com";
		
		BufferedReader br = null;
		String readline= "";
		
		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((readline = br.readLine()) != null) {
				System.out.println(readline);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {br.close();} catch(Exception e) {}
		}
	}
}
