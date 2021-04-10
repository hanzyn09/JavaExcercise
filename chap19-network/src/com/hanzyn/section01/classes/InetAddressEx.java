package com.hanzyn.section01.classes;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress
 * 
 * 자바에서 IP 주소를 다루기 위한 클래스로,
 * default 접근제한자이므로 프로그램 상에서 직접 객체 생성을 할 수 없다.
 * InetAddress 객체 생성을 위한 메서드는 getAllByName(), getByAddress(), getByName(), getLocalHost() 이렇게 4가지 이다.
 * */
public class InetAddressEx {
	public static void main(String[] args) {
		try{
			//getByName 메서드로 InetAddress 객체 생성
			InetAddress ip = InetAddress.getByName("www.google.co.kr");
			System.out.println("Host Name:" + ip.getHostName());
			System.out.println("IP : " + ip.getHostAddress());
			
			//getAllByName 메서드로 InetAddress 객체배열 생성
			InetAddress[] ips = InetAddress.getAllByName("www.google.co.kr");
			for(InetAddress i : ips) {
				System.out.println("IP 주소 : " + i);
			}
			
			//IP 주솟값을 byte[] 배열로 리턴
			byte[] ipAddr = ip.getAddress()	;
			//byte 자료형의 표현 범위  : -128~127, 127 이상의 값은 음수로 표현된다.
			for(byte b : ipAddr) {
				System.out.print(((b<0)? b+256 : b ) + ".");
			}
			System.out.println();
			
			//getLocalHost 메서드로 InetAddress 객체 생성 호출
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP : " + local);
			
			//getByAddress로 InetAddress 객체 생성 호출
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress() + " 주소 : " + ip2);
			
		}catch(UnknownHostException e) {
			System.out.println(e.getMessage());
		}
	}
}
