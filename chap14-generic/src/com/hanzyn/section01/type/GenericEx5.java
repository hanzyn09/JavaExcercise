package com.hanzyn.section01.type;

/*
 * 제네릭 타입을 어떤 클래스의 하위클래스나 상위클래스로 제한 하기위해  타입을 부모타입 / 자손타입으로 지정할 수 있다. 
 * 
 * <? super Obj> : Obj의 부모클래스 자료형을 참조 가능
 * <? extends Obj> : Obj의 자손클래스 자료형을 참조 가능
 * <?> : 모든 자료형 가능
 * */

public class GenericEx5 {
	public static void main(String[] args) {
		Gen3 g3 = new Gen3();
		
		/*gen2의 상위 클래스 제네릭 선언 가능*/
		Generic5<? super Gen2> g2 = new Generic5<Gen1>(g3); 
		//Gen2의 부모클래스 타입을 저장하는 	Gen3타입의 객체를 지정하는 "참조변수 g2" 객체 선언
		//Gen2 t1 = g2.get(); //에러 : Gen2는 Gen2의 부모클래스가 아님
		//Gen3 t1 = g2.get(); //에러 : Gen3는 Gen2의 부모클래스가 아님
		
		Gen1 t2 = (Gen3)g2.get(); //Gen1은 부모클래스여서 가능
		Object t1 = g2.get(); //Object는 최상위 클래스여서 가능
		System.out.println(t2.name);
		System.out.println(t2.getName());
		
		/*Gen2의 하위클래스 제네릭 선언 가능*/
		Generic5<? extends Gen2> g4 = new Generic5<Gen3>(g3);
		//<? extends Gen2>로 선언된 g4 객체는 Gen2의 자식클래스를 자료형으로 갖는 객체를 지정할 수 있다.
		Gen2 t3 = g4.get(); //Gen2 자신도 포함 !!! ==> super와 다르게 자식만이 아닌 자신과 같은 타입도 가능~!!
		Gen3 t4 = (Gen3)g4.get(); //Gen3는 하위클래스여서 가능
		
		/*모든 클래스 타입 가능*/
		Generic5<?> g6 = new Generic5<Gen3>(g3); // <?>는 모든 타입이 가능 : 제네릭을 지정하지 않은 것과 같다 == Object 처리
		Object t5 = g6.get();
		Gen3 t6 = (Gen3)g6.get();
		
		/*정수도 가능*/
		Generic5<?> g7 = new Generic5<Integer>(1);
		System.out.println(g7.get());
		
	}
}

class Gen1{
	String name = "Gen1";
	
	String getName() {
		return name;
	}
}
class Gen2 extends Gen1{
	String name = "Gen2";
	
	String getName() {
		return name;
	}
}
class Gen3 extends Gen2{
	String name = "Gen3";
	
	String getName() {
		return name;
	}
}

class Generic5<T>{
	T obj;
	
	Generic5(T Obj){
		this .obj = obj;
	}
	void set(T obj) {
		this .obj = obj;
	}
	T get() {
		return obj;
	}
}