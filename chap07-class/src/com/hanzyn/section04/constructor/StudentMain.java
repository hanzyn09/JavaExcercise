package com.hanzyn.section04.constructor;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동", 4, "소프트웨어");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.dept);

		//object 2
		Student stu2 = new Student("이순신", 3, "디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.dept);
		
		//error case (기본 생성자)
		//Student stu0 = new Student();
		//생성자 정의 해주면 사용 가능
		Student stu0 = new Student();
		
		//overloading
		Student stu4 = new Student("홍길동");
		Student stu5 = new Student("홍길동", 4);
	}

}
