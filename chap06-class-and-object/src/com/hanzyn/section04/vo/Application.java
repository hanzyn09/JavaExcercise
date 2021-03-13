package com.hanzyn.section04.vo;

public class Application {
	public static void main(String[] args) {

		/* 생성자를 이용한 초기화와 설정자(setter)를 이용한 초기화 비교 */
		/*
		 * 1. 생성자를 이용한 초기화
		 * 장점 : setter메소드를 여러번 호출해서 사용하지 않고 단 한번의 호출로
		 *      인스턴스를 생성 및 초기화 할 수 있다.
		 * 단점 : 필드를 초기화할 매개변수의 갯수를 경우의 수 별로 모두 만들어둬야 한다.
		 *      호출 시 인자가 많아지는 경우 어떤 필드를 의미하는지 한 눈으로 보기 힘들다.
		 *      new User("greedy","greedy","greedy"); 몇번쨰 인자가 아이디인지 이름인지 알 수 없다.
		 * 
		 * 2. 설정자(setter)를 이용한 초기화
		 * 장점 : 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확하게 볼 수 있다.
		 *     User user = new User();
		 *     user.setId("greedy");
		 *     user.setPwd("greedy");
		 *     user.setName("greedy");
		 * 단점 : 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다.
		 * */
		
		/* 생성자를 이용한 초기화 */
		UserVO user1 = new UserVO("greedy","greedy","greedy",new java.util.Date());
		System.out.println(user1.getInformation());
		
		/* 기본 생성자와 설정자를 이용한 초기화 */
		UserVO user2 = new UserVO();
		user2.setId("greedy");
		user2.setPwd("greedy");
		user2.setName("greedy");
		user2.setEnrollDate(new java.util.Date());
		
		System.out.println(user2.getInformation());
	}
}