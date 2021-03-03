package com.hanzyn.section03.text;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormatEx sdf = new SimpleDateFormat(" yyyy-MM-dd ");
 * sdf.format(new Date());
 * */
public class SimpleDateFormatEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy MM dd HH:mm:ss E a");
		System.out.println(sf.format(now));

	}

}
