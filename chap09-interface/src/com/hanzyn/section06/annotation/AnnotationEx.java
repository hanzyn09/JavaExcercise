package com.hanzyn.section06.annotation;

import java.lang.reflect.Method;

public class AnnotationEx {

	public static void main(String[] args) throws Exception {
		
		Method method[] = UserClass.class.getDeclaredMethods(); //UserClass 클래스에서 정의된 메서드를 메서드 타입으로 가져온다.
		
		for(int i=0; i<method.length ; i++) { //메서드 갯수 만큼 for 문 반복
			String methodName = method[i].getName(); //메서드 객체의 이름을 가져온다
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class); //해당 메서드의 어노테이션 정보를 가져온다
			
			System.out.print(methodName + "의 어노테이션 "); 
			System.out.print("value: " + annot.value() + " ");
			System.out.print("number: " + annot.number() + " ");
			
			System.out.println();
			
			method[i].invoke(new UserClass(), null); //invoke 메서드: 메서드 변수의 메서드 객체를 실행하는 메서드.
			
			
			
		}

	}

}
