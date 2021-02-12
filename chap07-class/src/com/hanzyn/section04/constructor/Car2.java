package com.hanzyn.section04.constructor;

//생성자간 실행
//다른 생성자 실행 시 반드시 첫줄에서 실행
//this는 참조변수로서 "객체 자기 자신"을 가리킴.
//객체 외부에서 내부 접근할 때 객체변수를 사용하듯, 객체 내부에서도 객체 맴버에 접근하기 위함.
public class Car2 {
	String color;
	String company;
	String type;
	
	Car2(){
		this("white", "기아", "경차");
	}	
	
	Car2(String color, String company, String type){
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	Car2(String com, String t){
		this("white", com, t);
	}
	
	Car2(String t){
		this("white", "기아", t);
	}
	
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}
