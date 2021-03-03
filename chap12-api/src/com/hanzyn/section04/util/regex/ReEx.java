package com.hanzyn.section04.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * java.util.regex는 자바에서 정규 표현식을 사용하기 위한 클래스들을 모아놓은 패키지.
 * 데이터에서 원하는 패턴을 찾기 위해 미리 정의된 문자를 이용해 작성된 표현식.
 * 
 * 전화번호/이메일/주민번호 추출/비밀번호 규칙 체크
 * */

public class ReEx {
	/*정규 표현식 사용 방법 3단계
	 * 1. Pattern 클래스를 이용해 정규표현식 패턴(규칙) 생성
	 * 2. 생성한 패턴으로 비교할 대상이 되는 문자열과 매칭시킴
	 * 3. 적용했던 정규 표현식에 매칭이 되었는지 확인
	 * 
	 * */

	public static void main(String[] args) {
		
		//소문자 b로 시작하는 알파벳 소문자 0개 이상 규칙
		Pattern p = Pattern.compile("b[a-z]*"); //pattern 클래스의 static 메서드 compile에 정규표현식을 매개변수로 넣고 객체 생성
		Matcher m; //matcher 클래스로 생성한 패턴 객체의 matcher()메서드의 매개변수로 비교할 대상 문자열을 넣어 Matcher 객체 생성
		
		
		//문자열 bat 확인
		m = p.matcher("bat");
		System.out.println("bat = " + m.matches()); 
		
		//문자열 cat 확인
		m = p.matcher("cat");
		System.out.println("cat = " + m.matches());
		
		//문자열 bed 확인
		m = p.matcher("bed");
		System.out.println("bed = " + m.matches());
		
		
		//Matcher 객체에 matchers() 메서드를 호출해 매칭 되었는지 true / false 판단 가능
		//if(m.matches()){}

	}

}
