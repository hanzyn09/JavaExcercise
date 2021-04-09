package com.hanzyn.section04.writer;

import java.io.File;

/*
 * File 클래스
 * 
 * 바이트, 문자 기반 스트림 외에
 * 파일의 경로나 파일 정보 확인, 웹사이트의 첨부파일을 업로드할 때 사용되는 클래스이다.
 * 
 * 파일 경로는 생성자를 통해 전달.
 * 파일에 대한 정보 중에서도 파일의 존재 여부, 파일의 크기, 마지막 수정 날짜 ==> app 만들 때 빈번히 사용되므로 반드시 숙지
 * 
 * */
public class FileEx {
	//file 클래스로 파일정보를 확인
	
	public static void main(String[] args) {
		File file = new File("test4.txt");
		
		//파일인지 여부
		System.out.println(file.isFile());
		
		//디렉토리인지 여부
		System.out.println(file.isDirectory());
		
		//파일명
		System.out.println(file.getName());
		
		//파일 절대경로명
		System.out.println(file.getAbsolutePath());
		
		//생성자에 넣어준 경로
		System.out.println(file.getPath());
		
		//읽기 권한 있는지 여부
		System.out.println(file.canRead());
		
		//쓰기 권한 있는지 여부
		System.out.println(file.canWrite());
	}
}
