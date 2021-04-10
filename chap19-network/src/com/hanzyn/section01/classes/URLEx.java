package com.hanzyn.section01.classes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/*
 * URL 클래스 (Uniform Resource Location)
 * 
 * 인터넷을 통하여 서버에 접근하기 위한 클래스.
 * 인터넷에 접근할 수 있는 형태를 분석한다.
 * 
 * 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링
 * 
 * 포트번호는 http: 80, 
 * 	https: 443이 기본 포트번호이다.(SSL 보안 소켓 계층 인증서를 서버에 설치하여 암호화 통신)
 * 
 * */

public class URLEx {
	/*
	 * URL url = new URL ("전체주소");
	 * URL url = new URL ("호스트명", "경로/파일명");
	 * URL url = new URL ("호스트명", 포트번호, "경로/파일명");
	 * */
		
		public static void main(String[] args) {
			try {
				URL url = null;
				
				url = new URL("https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1");
				
				System.out.println("authority : " + url.getAuthority());
				System.out.println("content : " + url.getContent());
				System.out.println("protocol : " + url.getProtocol());
				System.out.println("host : " + url.getHost());
				System.out.println("port : " + url.getPort());
				System.out.println("path : " + url.getPath());
				System.out.println("file : " + url.getFile());
				System.out.println("query : " + url.getQuery());
				
				
				//URL 을 통해서 정보받기
				int data = 0;
				
				try {
					Reader is = new InputStreamReader(url.openStream());
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
