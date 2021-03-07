package com.hanzyn.dimensional_array.level02;

public class Application2 {
	
	static int ROW = 3, COL = 2;
	
	public static void main(String[] args) {
		
		/* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
		 * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
		 * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
		 * 
		 * -- 출석부 --
		 * 1. 홍길동
		 * 2. 이순신
		 * 3. 유관순
		 * 4. 윤봉길
		 * 5. 장영실
		 * 6. 임꺽정
		 * 7. 장보고
		 * 8. 이태백
		 * 9. 김정희
		 * 10. 대조영
		 * 11. 김유신
		 * 12. 이사부
		 * 
		 * -- 출력 예시 --
		 * == 1분단 ==
		 * 홍길동 이순신
		 * 유관순 윤봉길
		 * 장영실 임꺽정
		 * 
		 * == 2분단 ==
		 * 장보고 이태백
		 * 김정희 대조영
		 * 김유신 이사부
		 */
		String[] arr = {"홍길동","이순신", "유관순", "윤봉길", "장영실", "임꺽정",
				"장보고", "이태백", "김정희", "대조영", "김유신", "이사부",};
		
		String[][] arr1 = new String[ROW][COL];
		String[][] arr2 = new String[ROW][COL];
		
		arr1 = store(copy(1, arr), arr1);
		arr2 = store(copy(2, arr), arr2);
		
		print1(1, arr1);
		print1(2, arr2);
		
	}
	
	public static String[] copy(int s, String[] a) {
		
		String[] temp = new String[a.length];
		
		if(s == 1)
			//원본배열, 복사시작할 인덱스, 복사본배열, 복사를시작할인덱스, 복사할 길이
			System.arraycopy(a, 0, temp, 0, 6);
			
		else if(s == 2)
			System.arraycopy(a, 6, temp, 0, 6);
		
		else {
			System.out.println("error.");
			System.exit(0);
		}
			
		return temp;
		
	}
	
	public static String[][] store(String[] t, String[][] arr) {
		int count = 0;
		
		for(int i = 0 ; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				arr[i][j] = t[count++];
			}
		}
		
		return arr;
	
	}
	
	public static void print1(int num, String[][] a) {
		System.out.println("== " + num +"분단 ==");
		
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				System.out.print(a[i][j] + " ");
			}System.out.println();
		}
		System.out.println();
	}
	
}
