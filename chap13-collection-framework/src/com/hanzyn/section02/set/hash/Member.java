package com.hanzyn.section02.set.hash;

public class Member {
	
	String name;
	int age;
	

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "(" + name + ", " + age + ")";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else
			return false;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode()	+ age; //int 타입으로 리턴해야하므로 name의 해쉬코드로 연산
	}

	

}
