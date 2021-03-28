package com.hanzyn.section04.map.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
/*properties 클래스는 Hashtable 클래스의 하위클래스이다.
 * k,v와 모두 String인 map 객체이다.
 * 
 * properties 클래스는 자바프로그램에서 설정파일용으로 많이 사용한다.
 * 자바 파일에 직접 서버정보, DB정보를 저장해 두면,
 * 설정이 바뀌는 경우 자바 파일을 다시 열어 수정하고 컴파일해서 배포해야되는 번거로움이 있어
 * property 파일을 따로 만들어 관리하기도 한다.*/
	
	public static void main(String[] args) {
		try {
			Properties pr = new Properties();
			
			//properties 파일 읽어오기
			FileInputStream reader = new FileInputStream(
					"C:\\Users\\ysurk\\eclipse-workspace\\chap13-collection-framework\\src\\com\\hanzyn\\section04\\map\\properties"
					+ "\\config.properties"
					);
			
			//properties 객체에 로드
			pr.load(reader);
			System.out.println(pr);
			System.out.println(" 이름 : " + pr.getProperty("name"));
			
			//properties에 키, 값 으로 추가
			pr.put("subject", " 자바");
			System.out.println(pr);
			
			//properties 파일로 출력
			pr.store(new FileOutputStream(
					"C:\\Users\\ysurk\\eclipse-workspace\\chap13-collection-framework\\src\\com\\hanzyn\\section04\\map\\properties"
							+ "\\test.properties"
					), "#save");
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
