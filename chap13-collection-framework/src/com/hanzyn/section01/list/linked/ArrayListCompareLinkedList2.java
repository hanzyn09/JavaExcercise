package com.hanzyn.section01.list.linked;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedList2 {
	//중간에서 데이터 추가
	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		LinkedList llist = new LinkedList();
		
		for(int i = 0 ; i<100000; i++) {
			alist.add(i);
			llist.add(i);
		}
		
		System.out.println("ArrayList 추가");
		long start = System.currentTimeMillis();
		for(int i=0; i<1000; i++) {
			alist.add(500, i); //(인덱스, 값)
		}
		long end =System.currentTimeMillis();
		System.out.println(end - start);
		
		System.out.println("LinkedList 추가"); 
		start = System.currentTimeMillis();
		for(int i=0; i<1000; i++) {
			llist.add(500, i);
		}
		end =System.currentTimeMillis();
		System.out.println(end - start);

		/*
		 * DB의 데이터를 조회하여 처리하는 경우
		 * 데이터를 중간에 추가/삭제하는 케이스보다, 데이터에 접근해서 출력/연산하는 케이스가 많으므로
		 * ArrayList를 조금 더 자주 사용하게 된다.
		 * */
	}

}
