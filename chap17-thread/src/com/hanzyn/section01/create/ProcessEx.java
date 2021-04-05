package com.hanzyn.section01.create;

public class ProcessEx {
	public static void main(String[] args) {
		try {
			//메모장 실행
			Process p1 = Runtime.getRuntime().exec("notepad.exe");
			//Process p1 = Runtime.getRuntime().exec("calc.exe"); 
			// 그림판이 먼저 실행되고 종료되어버림. 계산기를 직접 실행하는게 아니라 새로운 프로세스를 실행하고 자신은 종료되기때문에
			// 그림판도 같이 종료되고, 새로운 프로세스인 계산기만 남는다.
			
			//그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			p1.waitFor(); //p1 프로세스가 종료될 때까지 대기
			p2.destroy(); //p1 프로세스가 종료되면 실행
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
