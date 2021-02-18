package com.hanzyn.section06.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME) //@Retention은 (RetentionPolicy.RUNTIME으로) 실행 하는 동안 어노테이션 정보를 유지하도록 했다.
public @interface UserAnnot {
	
	//value랑 number 요소를 정의
	String value();
	int number() default 5;
	//자료형 요소명() 디폴트 값;
}

/* annotation
 *  : 프로그램에게 추가적인 정보를 제공해주는 metadata.
 *  컴파일러에게 코드를 작성할 때 (문법 에러 체크 + 정보 제공 + 빌드, 배치 시 코드를 자동으로 생성해주는 정보 제공)
 *  표준어노테이션 + 메타어노테이션
 * 
 * 정의: @interface로 annotation 정의. 
 * 
 * 구성요소: 자료형과 변수명으로 정의.
 * 
 * 사용: @어노테이션명 형태로 사용.
 * 		기본요소인 value를 사용하려면 String value(); 기본요소를 정의 해줘야 한다.
 * 
 * 사용하는 이유: 안써도 제약은 없지만, 편하게 코딩하게 한다.
 * 			컴파일러나 다른 프로그램에게 지시하기 위해 표시하는 용도.
 * 
 * */
 