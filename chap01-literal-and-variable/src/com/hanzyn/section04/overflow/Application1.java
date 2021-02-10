package com.hanzyn.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		
		/***************************************** overflow *****************************************/
		//: 자료형마다 값의 최대 범위를 벗어나는 경우
		
		//byte num1  = 128; //127 초과라서 컴파일러가 오류 안내
		byte num1 = 127;
		
		num1++; //다음 줄에서 오버플로우가 나게 되는데 안내해주지 않음.
		System.out.println("num1 overflow: " + num1); //-128 출력. 최솟값
		
		num1+=2;
		System.out.println(num1); //순환해서 인식
		
		
		/***************************************** underflow ****************************************/
		//: 자료형마다 값의 최소 범위보다 작은 수를 발생시키는 경우
		byte num2 = -128;
		
		System.out.println("num2: " + num2);
		
		num2--;
		
		System.out.println("num2 underflow: " + num2); //127 출력
		
		
		/***************************************** overflow *****************************************/
		int firstNum = 1000000;
		int secondNum = 700000;
		
		int multi = firstNum * secondNum;
		System.out.println(multi); //int 범위를 넘어갔기 때문에 overflow 발생
		
		//해결방안
		long longMulti = firstNum * secondNum;
		System.out.println(longMulti); //자료형 바꿔줬는데 overflow 발생
		//int 간 곱에서 이미 허용 범위를 벗어난 것.
		//둘 중 하나를 long 형태로 바꿔준다.
		long result = (long)firstNum * secondNum;
		System.out.println(result);
		//처음부터 변수를 long값으로 주면 메모리를 많이 차지함. == 메모리 효율이 낮아짐 == 성능 저하
	}

}
