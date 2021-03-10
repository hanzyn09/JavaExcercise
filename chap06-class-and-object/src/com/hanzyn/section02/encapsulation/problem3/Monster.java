package com.hanzyn.section02.encapsulation.problem3;

public class Monster {
//	String name;
	String kinds;
	int hp;
	
	//필드를 kinds로 바꾸면 setInfo 메서드와 getInfo 메서드만 변경하면되지만
	//사용자(클라이언트)의 호출 코드는 변경하지 않아도 된다.
	
	
	public void setInfo(String info) {
//		this.name = name;
		this.kinds = info;
	}
	
	public void setHp(int hp) {	
		
		if(hp > 0) {
			this.hp = hp;
		}
		else {
			this.hp = 0;
		}
		
	}
	
	/**
	 * <pre>
	 *  몬스터와 정보를 입력받아 모든 필드의 내용을 문자열로 되돌려 주는 메서드
	 * </pre>
	 * @return 모든 필드의 정보를 문자열로 합쳐서 반환
	 */
	public String getInfo() {
//		return "몬스터의 이름은 " + name + ", 체력은 " + hp + "입니다.";
		return "몬스터의 이름은 " + this.kinds + ", 체력은 " + hp + "입니다.";
	}
}