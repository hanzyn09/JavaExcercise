package com.hanzyn.section02.util.date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); // 객체가 출력 됐다 : toString() 메서드를 재정의했다.
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a"); 
		//날짜, 시간의 포맷을 지정할 수 있는 클래스
		System.out.println(sf.format(now));

	}

}
