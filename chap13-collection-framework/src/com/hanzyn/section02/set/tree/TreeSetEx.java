package com.hanzyn.section02.set.tree;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet
 * : 중복불가, 검색의 순서는 정렬되어 조회됨.
 * 정렬방식에 따라 검색의 순서가 결정된다.
 * */
public class TreeSetEx {

	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		
		String from = "bat";
		String to = "d";
		
		//set 객체에 추가
		set.add("ant"); set.add("alias");
		set.add("batman"); set.add("aha");
		set.add("cola"); set.add("Cola"); //Cola는 아스키코드 값에의해 0번에 저장
		set.add("ddr"); set.add("dance");
		set.add("dEEE"); set.add("deee");
		set.add("ever"); set.add("giant");
		set.add("zoo");
		
		//출력
		System.out.println(set); 
		//[Cola, aha, alias, ant, batman, cola, dEEE, dance, ddr, deee, ever, giant, zoo]
		
		//from~to 검색
		System.out.println("from : " + from + " to: " + to);
		System.out.println(set.subSet(from, to)); //[batman, cola]
		
		//from~to + "zzzz" 검색
		System.out.println("from : " + from + " to: " + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz")); 
		//[batman, cola, dEEE, dance, ddr, deee]
		
		
		//내림차순 정렬
		set = new TreeSet(new Descend());
		set.add("ant"); set.add("alias");
		set.add("batman"); set.add("aha");
		set.add("cola"); set.add("Cola");
		set.add("ddr"); set.add("dance");
		set.add("dEEE"); set.add("deee");
		set.add("ever"); set.add("giant");
		set.add("zoo");
		
		System.out.println(set);
		//[zoo, giant, ever, deee, ddr, dance, dEEE, cola, batman, ant, alias, aha, Cola]
		
		//to~from (반대로 검색)
		System.out.println("from : " + from + " to: " + to);
		System.out.println(set.subSet(to, from)); //[cola, batman] 검색도 반대로 한다.
	
	}

}
