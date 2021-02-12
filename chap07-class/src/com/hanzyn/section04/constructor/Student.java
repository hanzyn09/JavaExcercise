package com.hanzyn.section04.constructor;

//생성자는 new 연산자와 함께 객체를 생성할 때 사용.
//클래스와 생성자 이름이 동일하고, 리턴값은 없다.
//변수 초기화 or 객체 사용 전 실행문을 넣어줌.
//생성자의 용도: 객체 초기화
public class Student {

		String name;
		int grade;
		String dept;
		
		//기본 생성자
		Student(){
					
		}
				
		//overloading 가능
		Student(String n){
			name = n;
		}
		Student(String n, int g){
			name = n;
			grade = g;
		}
		Student(String n, int g, String d){
			name = n;
			grade = g;
			dept = d;
		}
		
		//학과와 학년을 매개변수로 받으려하는 생성자인데, 에러 발생.
//		Student(String d, int g){
//			department = d;
//			grade = g;
//		}
		//매개변수명은 다르지만, 타입과 순서가 위와 동일하다.
		//매개변수는 생성자 안에서만 사용되는 로컬 변수 이름일 뿐, 자바 컴파일러가 자동으로 구별해내지 못함.
		
}
