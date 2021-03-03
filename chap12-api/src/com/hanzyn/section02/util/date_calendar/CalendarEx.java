package com.hanzyn.section02.util.date_calendar;

import java.util.Calendar;

/*Calendar 객체를 Date로 변환
 * Calendar cal = Calendar.getInstance();
 * Date d = new Date(cal.getTimeInMillis());
 * */

/*Date 객체를 Calendar로 변환
 * Date d = new Date();
 * Calendar cal = Calendar.getInstance();
 * cal.setTime(d);
 * */

public class CalendarEx {

	/*Calendar 클래스는 추상 클래스이고, 생성자의 접근지정자가 protected 라서
	 * 외부에서 new 연산자로 객체를 생성할 수 없다.
	 * 
	 * == 반드시 getInstance() 메서드로 객체를 생성하거나
	 *  Calendar 클래스를 상속받은 GregorianCalendar 클래스를 이용해 생성한 객체를 사용해야 한다.*/
	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해 연도 : " + today.get(Calendar.YEAR));
		
		System.out.println("이번 달 : " + (today.get(Calendar.MONTH)+1)); //0부터 시작
		
		System.out.println("연도기준 몇 째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월기준 몇 째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("일자 : " + today.get(Calendar.DATE));
		System.out.println("일자 : " + today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("연도 기준 날짜 : " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일 (일:1 ~ 토:7) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월기준 몇째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));

	}

}
