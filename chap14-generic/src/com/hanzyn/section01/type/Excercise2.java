package com.hanzyn.section01.type;

import java.util.List;
import java.util.ArrayList;

//list 인터페이스와 ArrayList 클래스를 Member 타입으로 제네릭을 선언하고, 전체 회원 출력

public class Excercise2 {
	public static void main(String[] args) {
		MemberEx me1 = new MemberEx("hong", "홍길동", 30);
		MemberEx me2 = new MemberEx("kim", "김유신", 40);
		MemberEx me3 = new MemberEx("lee", "이순신", 50);
		
		List<MemberEx> memberList = new ArrayList<MemberEx>();
		memberList.add(me1);
		memberList.add(me2);
		memberList.add(me3);
		
		//전체회원 출력
		for(int i=0; i<memberList.size(); i++) {
			MemberEx me = memberList.get(i); //객체생성해서 형변환(MemberEx) 안해도 된다.
			System.out.println(me.getId() + ", " + me.getName() + ", " + me.getAge());
		}
	}
}

class MemberEx{
	String id;
	String name;
	int age;
	
	MemberEx(String id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
