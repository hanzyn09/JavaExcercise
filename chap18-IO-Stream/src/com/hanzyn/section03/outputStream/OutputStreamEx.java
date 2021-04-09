package com.hanzyn.section03.outputStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		try {
			OutputStream out = System.out; //바이트 스트림
			
			out.write('a');
			out.write('b');
			out.write('c');
			
			out.write('1');
			out.write('2');
			out.write('3');
			
			out.write('가');
			out.write('나');
			out.write('다'); //2byte로 깨짐 : 문자기반출력스트림 클래스인 Writer 사용필요
			
			out.flush();
			out.close();
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
