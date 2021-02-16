package com.hanzyn.section05.packages;

//static final (상수): 항상 같은 수. 변하지 않으며 변하면 안된다.
//모든 곳에서 공유되어야 한다. == 공유되어야해서, static을 마지막 final이란 단어에 붙여서 쓴다.
//인스턴스 블록에서도 초기값을 지정할 수 있지만, 보통 선언시에 초기값을 지정한다.
//대문자 사용이 일반적, 두 단어 연결시에 언더바 사용.

//클래스 내부의 메소드에서, 입력 값을 제한해야 하는 경우
//읽기 쉽게 만들기 위해서 주로 사용

public class ConstantEx {
	
	static final double CARD_COMMISSION = 1.5;
	//자주 변경되진 않겠지만, 절대 변하지 않는 값은 아니다.
	//그럼에도 static final 로 선언 한 이유는, 실수/악의로 변경되어선 안되기 때문. 바뀌어선 안된다.
	// == 바뀌면 안되는 값 or 변하지 않는 값은 static final을 사용. 

	public static void main(String[] args) {
		System.out.println("원주율: " + Math.PI);
		System.out.println("카드 수수료율: " + CARD_COMMISSION);
		// CARD_COMMISSION = 1.8; //error. 변경 불가.
		

	}

}
