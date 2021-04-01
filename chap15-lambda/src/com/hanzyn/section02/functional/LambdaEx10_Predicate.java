package com.hanzyn.section02.functional;

import java.util.function.Predicate;

//Predicate 인터페이스는 매개변수가 있고, 리턴값은 boolean 값인 인터페이스로,
//test라는 이름의 메서드를 갖는다.

public class LambdaEx10_Predicate {
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "컴공")
	};
	
	public static void main(String[] args) {
		//컴공과 학생의 영어점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어점수 : " + avg); 
		
		//컴공과 학생의 수학점수 평균
		double avg2 = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 수학점수 : " + avg2); 
		
	}

	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		
		for(Student st : list) {
			//equals() 비교
			if(predicate.test(st)) {
				count++;
				sum += st.getMath();
			}
		}
		
		return (double) sum/count;
	}

	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		
		for(Student st : list) {
			//equals 비교
			if(predicate.test(st)) {
				count++;
				sum += st.getEng();
			}
		}
		
		return (double) sum/count;
	}
}
