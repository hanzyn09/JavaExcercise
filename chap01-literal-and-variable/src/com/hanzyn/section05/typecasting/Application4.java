package com.hanzyn.section05.typecasting;

public class Application4 {

	public static void main(String[] args) {
		/* 형변환 시 주의사항
		 * == 데이터 손실에 유의
		 * 1. 의도하지 않은 데이터 손실*/
		int inum = 290;
		byte bnum = (byte) inum;
		
		System.out.println(inum);
		System.out.println(bnum); //범위 맞지않은 손실
		
		//2. 의도한 데이터 손실
		double height = 175.5;
		int floorHeight = (int) height;
		System.out.println(floorHeight); //소수점 버리기

	}

}
