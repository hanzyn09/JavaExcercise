package com.hanzyn.section03.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx3 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2021-03-03";
		
		Date d = null;
		
		try {
			d = sdf.parse(strDate); //strDate를 parse하여 sdf에 맞춰, Date클래스로의 객체로 변환
		} catch(ParseException e) { //예외를 throws하기때문에 예외처리 추가해줘야함.
			e.printStackTrace();
		}
		System.out.println(d);
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf2.format(d)); //format() 메서드를 이용해 요일까지 함께 출력.

	}

}
