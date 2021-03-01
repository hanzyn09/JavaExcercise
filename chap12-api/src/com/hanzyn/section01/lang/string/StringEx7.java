package com.hanzyn.section01.lang.string;

/*String 클래스에서 자주 사용하는 메서드*/
public class StringEx7 {

	public static void main(String[] args) {
		
		String str = "Hello, My name is Hanjin";
		
		System.out.println(str.charAt(7));
		System.out.println(str.equals("Hello, My name is Hanjin"));
		System.out.println(str.indexOf("Hanjin"));
		System.out.println(str.indexOf('H'));
		System.out.println(str.substring(10));
		System.out.println(str.substring(3,10));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("jin"));
		System.out.println(str.replace("Hanjin", "Hanzyn"));
		System.out.println(str.replaceAll("name", "nickname"));
		System.out.println(str.toString());
		
		str = "안녕하세요, 반갑습니다.";
		
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		str = String.valueOf(10); //문자열로 형변환
		System.out.println(str);
		str = String.valueOf(10.5);
		System.out.println(str);
		
		str = "홍길동,이순신,유관순,안중근";
		String[] arr = str.split(",");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println(i + "번 인덱스 값 = " + arr[i]);
		}
	}

}
