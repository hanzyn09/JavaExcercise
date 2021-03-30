package com.hanzyn.section01.type;
/*
 * Object 클래스를 사용하면 모든 클래스를 사용할 수 있는 편리함이 있지만
 * 잘못 사용된 타입 때문에 발생하는 문제점을 제거하기 위해 제네릭으로 강한 타입 체크를 한다.
 * 실행 중에 에러가 나는 것 보다 미리 타입을 체크하게 만들어
 * 컴파일 시 에러를 내면 런타임 에러를 사전에 방지 할 수 있다.
 * */
public class GenericEx {
	public static void main(String[] args) {
		NoGeneric nogen = new NoGeneric();
		String[] ss = {"홍길동", "이순신", "김유신"};
		
		//object 타입의 매개변수에 String 배열 객체 전달
		nogen.set(ss);
		nogen.print();
		
		Object[] objs = nogen.get();
		for(Object o : objs) {
			String s = (String)o; //String으로 강제 형변환
			System.out.println(s);
		}
		
		Integer[] ii= {1,2,3};
		
		//object 타입의 매개변수에 int 배열 객체 전달
		nogen.set(ii);
		objs = nogen.get();
		for(Object o : objs) {
			String s = (String)o; //String으로 강제 형변환 : 에러발생
			System.out.println(s);
		}
		
		
	}
}

class NoGeneric{
	Object[] v;
	
	void set(Object[] n) {
		v = n;
	}
	Object[] get() {
		return v;
	}
	
	void print() {
		for(Object o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
