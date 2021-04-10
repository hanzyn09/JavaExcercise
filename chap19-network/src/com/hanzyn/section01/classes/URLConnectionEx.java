package com.hanzyn.section01.classes;
/*
 * URLConnection 클래스
 * 
 * 설정된 URL 간의 연결기능을 담당하는 추상 클래스.
 * 추상클래스이므로 객체 생성은 안되고 URL 클래스를 이용하여 객체화 생성이 가능하다.
 * URLConnection을 상속받아 구현한 클래스는 HttpURLConnection 과 JarURLConnection이 있고,
 * URL의 프로토콜이 http 이면 openConnection()은 HttpURLConnection 객체를 리턴한다.
 * 
 * 연결하고자 하는 자원에 접근하고 읽기, 쓰기를 할 수 있으며 그외 관련 정보를 읽고 쓸 수 있는 메서드가 제공된다.
 * */

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {
	public static void main(String[] args) {
		URL url = null;
		String address = "http://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString():" + conn);
			System.out.println("getAllowUserInteraction():" + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout():" + conn.getConnectTimeout());
			System.out.println("getContent():" + conn.getContent());
			System.out.println("getContentEncoding():" + conn.getContentEncoding());
			System.out.println("getContentLength():" + conn.getContentLength());
			System.out.println("getContentType():" + conn.getContentType());
			System.out.println("getDate():" + conn.getDate());
			System.out.println("getDefaultAllowUserInteraction():" + conn.getDefaultAllowUserInteraction());
			System.out.println("getDefaultUseCaches():" + conn.getDefaultUseCaches());
			System.out.println("getDoInput():" + conn.getDoInput());
			System.out.println("getDoOutput():" + conn.getDoOutput());
			System.out.println("getExpiration():" + conn.getExpiration());
			System.out.println("gettHeaderFields():" + conn.getHeaderFields());
			System.out.println("getIfModifiedSince():" + conn.getIfModifiedSince());
			System.out.println("getLastModified():" + conn.getLastModified());
			System.out.println("getReadTimeout():" + conn.getReadTimeout());
			System.out.println("getURL():" + conn.getURL());
			System.out.println("getUseCaches():" + conn.getUseCaches());
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
