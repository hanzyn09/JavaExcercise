package com.hanzyn.section02.util.date_calendar;

import java.util.Calendar;

//Calendar 클래스로 두 날짜간의 일수 구하는 방법

public class CalendarEx4 {

	public static void main(String[] args) {
		//현재 일
		int sYear = 2021;
		int sMonth = 3;
		int sDay = 3;
				
		//이전 일
		int eYear = 2021;
		int eMonth = 3;
		int eDay = 1;
				
		Calendar sCal = Calendar.getInstance();
		Calendar eCal = Calendar.getInstance();
				
		sCal.set(sYear, sMonth+1, sDay);
		eCal.set(eYear, eMonth+1, eDay);
		

		long diffSec = (sCal.getTimeInMillis() - eCal.getTimeInMillis()) / 1000;
		long diffDay = diffSec / (24 * 60 * 60);
				
		System.out.println(diffDay + "일 경과"); //1일 정도의 오차 발생.

	}

}
