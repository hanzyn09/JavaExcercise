package com.hanzyn.section03.array_copy;

public class Application2 {

	public static void main(String[] args) {
		/* 얕은 복사의 활용 
		 * 
		 * 얕은 복사를 활용하는 것은 주로 메서드 호출 시 인자로 사용되는 경우와
		 * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용
		 * */
		String[] names = {"홍길동", "유관순", "이순신"};

		//얕은 복사 확인을 위한 hashCode() 출력
		System.out.println(names.hashCode());
		
		print(names); //static 메서드를 호출할 때는 객체 생성 안해도 됨.
		String[] animals = getAnimals();
		System.out.println(animals.hashCode());
	}

	/**
	 * <pre>
	 * 배열을 매개변수로 전달받아 모든 인덱스에 저장된 값을 출력하는 기능 제공
	 * </pre>
	 * @param sarr
	 */
	public static void print(String[] sarr) {
		//전달받은 배열의 hashcode 값 출력
		System.out.println(sarr.hashCode());
		
		//전달받은 배열의 값 출력
		for(int i = 0 ; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}System.out.println();
	}
	
	/**
	 * <pre>
	 * 동물 종류로 생성된 문자열 배열을 반환하는 메서드
	 * </pre>
	 * @return 동물 종류가 담긴 문자열 배열을 반환
	 */
	public static String[] getAnimals() {
		String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
		
		System.out.println("새로 만든 animals의 hashCode() : " + animals.hashCode());
		
		return animals;
	}
}
