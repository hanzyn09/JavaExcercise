package com.hanzyn.section01.list;

import java.util.Vector;

//Vector 클래스는 컬렉션 프레임워크 이전에 사용되었던 클래스로, 
//이전에 사용하던 메서드와 리스트 인터페이스의 구현 메서드가 혼합되어있다.
public class ListEx2 {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(1.2); //List 메서드
		list.add(Math.PI); //List 메서드
		list.addElement(3.4); //이전 메서드
		
		//향상된 for 문 이용 가능
		for(Object o : list) {
			System.out.println(o);
		}
		
		double num = 3.4;
		
		int index = list.indexOf(num); //해당 요소의 인덱스 반환. 없으면 -1
		if(index >= 0) 
			System.out.println(num + "의 위치 : " + index);
		else 
			System.out.println(num + "는 list에 없습니다.");
		
		num = 1.2;
		if(list.contains(num)) { //값이 리스트안에 존재하는가?
			list.removeElement(num); //제거한다.
			System.out.println(num + " 삭제됨.");
		}
		
		System.out.println(list.indexOf(num) ); //해당 요소의 인덱스 반환. 없으면 -1
		System.out.println(list);  //toString()
	}
}
