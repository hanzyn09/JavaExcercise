package com.hanzyn.section01.type;

public class GenericEx2 {
	public static void main(String[] args) {
		Generic<String> gen = new Generic<String>();
		String[] ss = {"홍길동", "이순신", "김유신"};
		
		//String 제네릭 타입의 매개변수에 String 배열객체 전달
		gen.set(ss);
		gen.print();
		
		for(String s : gen.get()){
			//String o = (String)s; //형변환 필요없음
			//System.out.println(o);
			System.out.println(s);
		}
		
		//String 제네릭 타입의 매개변수에 integer 배열 객체 전달
		Integer[] ii = {1,2,3};
		//gen.set(ii);  //에러발생
		
		Generic<Integer> gen2 = new Generic<Integer>();
		gen2.set(ii);
		gen2.print();
		
		for(Integer o : gen2.get()) {
			//String s = (String)o; //형변환 필요 없음
			System.out.println(o);
		}
	}
}

class Generic<T>{ //인터페이스도 generic 지정가능!!!
	T[] v;
	
	void set(T[] n) {
		v = n;
	}
	
	T[] get() {
		return v;
	}
	
	void print() {
		for(T o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
