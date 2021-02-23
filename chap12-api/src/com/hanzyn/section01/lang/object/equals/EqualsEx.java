package com.hanzyn.section01.lang.object.equals;

//this 와 obj는 모두 참조변수로 비교한다. == 참조변수가 참조하고 있는 주솟값으로 비교
public class EqualsEx {

	public static void main(String[] args) {
		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);
		
		if(obj1.equals(obj2)) { //객체도 같고, 멤버 변수 값도 같지만, 참조하는 주솟값이 다르다.
			System.out.println("obj1 객체와 obj2 객체는 같음");
		} else {
			System.out.println("obj1 객체와 obj2 객체는 다름");
		}

		Obj obj3 = obj1; //주솟값이 대입된다. == 같은 주소 참조
		if(obj1.equals(obj3)) {
			System.out.println("obj1 객체와 obj3 객체는 같음");
		} else {
			System.out.println("obj1 객체와 obj3 객체는 다름");
		}
		
		ObjOverride objo1 = new ObjOverride(100);
		ObjOverride objo2 = new ObjOverride(100);
		if(objo1.equals(objo2)) {
			System.out.println("objo1 객체와 objo2 객체는 같음");
		} else {
			System.out.println("objo1 객체와 objo2 객체는 다름");
		}
	}

}

class Obj{
	int obj_var; //멤버 변수
	
	Obj(int obj_var){ //생성자로 멤버 변수에 값 초기화
		this.obj_var = obj_var;
	}
}

class ObjOverride{
	int obj_var;
	
	ObjOverride(int obj_var){
		this.obj_var = obj_var;
	}
	
	@Override
	public boolean equals(Object obj) { //instanceof를 통해 매개변수가 ObjOverride 타입의 객체이면 true를 리턴한다.
		if(obj instanceof ObjOverride) { //자식 instance of 부모 : 자식은 부모가 될수 있는지 형변환 가능한지 확인
			return true;
		} else{
			return false;
		}
	}
}
