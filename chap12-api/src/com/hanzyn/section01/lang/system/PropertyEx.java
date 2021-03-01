package com.hanzyn.section01.lang.system;

/*System 클래스는 OS와 관련된 기능들이 존재하는 클래스로,
 *  모든 멤버가 static 이라서 객체를 생성할 필요가 없기 때문에 생성자를 private으로 숨겨서
 *  외부에서 객체 생성할 수 없도록 한 클래스.
 *  
 *  화면에 출력 / 메모리 / 현재시간/ 입출력
 *  
 *  System.in: 표준 입력 객체
 *  System.out: 표준 출력 객체
 *  
 *  exit(): 프로그램 강제 종료. ()안에는 어떤 이유로 종료되었는지 알려주는 코드값.
 *  0은 정상적인 종료.
 *  
 *  getProperty(): 현재 시스템에 설정된 속성값을 읽어오는 메서드. JVM 시작시 자동으로 읽어와 설정된다.
 *  */
public class PropertyEx {

	public static void main(String[] args) {
		//자바 버전
		System.out.println(System.getProperty("java version"));
		//JDK 경로
		System.out.println(System.getProperty("java.home"));
		//OS
		System.out.println(System.getProperty("os.name"));
		//파일 구분자(리눅스, 유닉스는 /)
		System.out.println(System.getProperty("file.separator"));
		//사용자명
		System.out.println(System.getProperty("user.name"));
		//사용자 홈디렉토리
		System.out.println(System.getProperty("user.home"));
		//현재 워크스페이스 디렉토리 위치
		System.out.println(System.getProperty("user.dir"));

	}

}
