package com.hanzyn.section02.util.date_calendar;

import java.util.Date;

//Date 클래스로 두 날짜간의 일수 구하는 방법

public class CalendarEx3 {

	public static void main(String[] args) {
		//현재 일
		int sYear = 2021;
		int sMonth = 3;
		int sDay = 3;
		
		//이전 일
		int eYear = 2021;
		int eMonth = 3;
		int eDay = 1;
		
		Date sd = new Date();
		Date ed = new Date();
		
		sd.setYear(eYear);
		sd.setMonth(sMonth);
		sd.setDate(sDay);
		
		ed.setYear(eYear);
		ed.setMonth(eMonth);
		ed.setDate(eDay);

		long temp = (sd.getTime() - ed.getTime()) / (1000L * 60L * 60L *24L);
		int diff = (int)temp;
		
		System.out.println(diff + "일 경과");
	}

}
