package com.hanzyn.section04.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//그룹핑 기능을 이용해 출력

public class ReEx3 {

	public static void main(String[] args) {
		String source = "휴대폰 번호 : 010-1111-1111, "
				+ "집 전화번호 : 02-1234-5678, "
				+ "이메일 주소: email@gmail.com 계좌번호: 123-12-123456";
		
		String telpattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		//첫번째 그룹 : 0 으로 시작하는 2~3자리 숫자
		//두번째 그룹 : 3~4자리 숫자
		//세번째 그룹 : 4자리 숫자
		String emailpattern = "(\\w+)@(\\w+).(\\w+)";
		String accountpattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		
		Pattern p = Pattern.compile(telpattern);
		Matcher m = p.matcher(source);
		
		System.out.println("전화번호 : ");
		while(m.find()) { //지정된 패턴에 맞는 문자열을 검색 
			// find()는 문자열 내에서 지정된 패턴과 일치하는 부분을 찾아내면 true 리턴.
			// 일치하는 문자열을 찾고 다시 find() 메서드를 호출하면 자동으로 다음 일치하는 패턴으로 넘어간다.
			System.out.println(m.group() + " : " + //모든 그룹이 합쳐진 문자열이 담긴다.
							m.group(1) + " , " + //02
							m.group(2) + " , " + m.group(3)); //1234   5678
			//이 곳에서 전화번호 패턴을 가지고 휴대폰 번호와 집 전화번호 두개를 한번에 찾을 수 있었다.
		}
		
		p = Pattern.compile(emailpattern);
		m = p.matcher(source);
		System.out.println("이메일 : ");
		while(m.find()) { //지정된 패턴에 맞는 문자열을 검색
			System.out.println(m.group() + " : " +  //grouping 대상은 group(순번)형태로 값을 사용한다.
							m.group(1) + " , " +
							m.group(2) + " , " + m.group(3)); //3개의 그룹
			//정규 표현식의 패턴과 일치하는 문자열의 일부를 괄호로 나눠서 그룹핑 할 수 있다.
			//그룹핑된 부분은 하나의 단위로 묶여
			//한번 이상의 반복을 의미하는 '+',
			//'*'가 오면 그룹핑 된 부분이 적용대상이 된다.
		}
		
		p = Pattern.compile(accountpattern);
		m = p.matcher(source);
		System.out.println("계좌번호 : ");
		while(m.find()) { //지정된 패턴에 맞는 문자열을 검색
			System.out.println(m.group() + " : " + 
							m.group(1) + " , " +
							m.group(2) + " , " + m.group(3)); //순번값이 존재하지 않는 인덱스 지정시 index 에러발생
		}
		
	}

}
