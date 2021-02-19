package com.hanzyn.section01.method;

public class Calculator {
	
	/**  메서드 안 커서에서 alt + shift + j : 주석
	 * <pre>
	 * 매개변수로 전달받은 두 수를 비교하여 더 작은 값을 가진 정수를 반환
	 * 단, 같은 값을 가지는 조건에 대해서는 처리하지 않는다.
	 * </pre>
	 * @param first 최솟값 비교를 위한 첫번째 정수
	 * @param second 최솟값 비교를 위한 두번째 정수
	 * @return 두 수 중 작은 값을 정수 형으로 반환
	 */
	public int minNumOf(int first, int second) {
		
		return (first > second) ?  second : first ;
		
	}
	
	public static int maxNumOf(int first, int second) {
		
		return (first > second) ?  first : second ;
		
	}
}
