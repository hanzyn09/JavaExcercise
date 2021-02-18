package com.hanzyn.section01.classes;

public class LocalInnerEx { //바깥 클래스
	int i = 10;
	
	void outerMethod() { //메서드
		class Inner { //로컬 클래스 : 메서드안에 있기때문에 메서드가 실행되면 객체 생성, 메서드 종료시 객체 사용 불가.
			int x = 10; //메서드 지역변수
			int i = 30; //메서드 지역변수
			
			void innerMethod() {
				System.out.println(x);
				System.out.println(i); //안쪽 클래스의 i 변수. 가까이에 있는 것.
				System.out.println(this.i); //안쪽 클래스의 i 변수. this는 객체 자기 자신을 참조하는 키워드여서 로컬 내부 클래스의 객체 자신을 참고.
				System.out.println(LocalInnerEx.this.i); //바깥 클래스의 i 변수. 
								//메서드 내의 로컬 내부 클래스에서 바깥 클래스의 멤버 변수에 접근하기 위해 LocalInnerEx.this 라는 키워드를 사용함. 
								//LocalInnerEx의 this 자신 객체를 의미.
			}
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx(); //바깥 클래스의 객체를 먼저 생성하고, 메서드를 호출한다.
		lic.outerMethod();
	}

}
