package com.hanzyn.section03.text;

import java.text.DecimalFormat;

//출력형태의 포맷을 지정하는 클래스가 java.text 안에 있다.

//decimal은 숫자를 의미

public class DecimalFormatEx {

	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("###,###.##"); //#은 자릿수 만큼만
		DecimalFormat df2 = new DecimalFormat("000,000");	//0은 자릿수 외에 자리에도 0으로 채우기
		
		System.out.println(df1.format(5500));
		System.out.println(df2.format(5500));
		
		System.out.println("=====================");
		
		/*소수점 2자리로 맞춰서 출력:
		 * 1.  100을 곱하고
		 * 2.  Math.round()를 사용하고
		 * 3.  다시 100.0 으로 나눈다.
		 * 4.  이 작업을 갯수 만큼 반복
		 * ==> 소수점 처리를 더 편하게 할 수 있는 방법 */
		
		double[] scores = {90.555, 80.6666, 70.77777, 60.6666666666666, 50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(int i = 0 ; i<scores.length; i++) {
			System.out.println(df.format(scores[i]));
		}

	}

}
