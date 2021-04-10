package com.hanzyn.section02.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP/IP 프로토콜: 다른 시스템간 데이터 통신을 위한 표준 프로토콜
 * 
 * TCP, UDP 프로토콜도 포함되며 OSI 계층 중 전송 계층에 해당.
 * TCP : 연결기반, 일대일, 연결후통신, 신뢰성, 순서보장, 수신여부확인가능, 속도느림 // ServeSocket & Socket
 * UDP : 비연결기반, 일대일/일대다/다대다, 비연결통신, 신뢰성없음, 순서보장안됨, 수신여부확인불가, 속도빠름 // DatagramSocket & DatagramPacket
 * */
public class ServerEx {
	public static void main(String[] args) {
		//소켓 생성
		ServerSocket server = null;
		
		try {
			
			server = new ServerSocket(9999);
			
			//무한 반복 ... 클라이언트 접속 대기
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				server.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class HttpThread extends Thread{
	private Socket client;
	BufferedReader br;
	PrintWriter pw;
	
	HttpThread(Socket client) {	
		this.client = client;
		
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void run() {
		BufferedReader fbr = null;
		DataOutputStream outToClient = null;
		
		try {
			String line = br.readLine();
			//line : GET /HTTP/1.1
			System.out.println("Http Header :" + line);
			
			int start = line.indexOf("/") + 1;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName = line.substring(start, end);
			if(fileName.equals("")) {
				fileName="index.html";
			}
			System.out.println("사용자 요청 파일 : " + fileName);
			
			fbr = new BufferedReader(new FileReader(fileName));
			System.out.println("reading ok");
			String fileLine = null;
			pw.println("HTTP/1.0 200 Document Follows \r\n");
			while((fileLine = fbr.readLine()) != null) {
				pw.println(fileLine);
				pw.flush();
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null) br.close();
				if (pw != null) pw.close();
				if (client != null) client.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
