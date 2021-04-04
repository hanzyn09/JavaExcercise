package com.hanzyn.section06.parallel;

import java.util.ArrayList;
import java.util.List;

/*
 * 스트림 객체를 생성할 때 사용하는 stream() 메서드 대신
 * parallelStream() 메서드를 사용하면 병렬 스트림을 쉽게 생성할 수 있다.
 * 병렬 처리시 내부적으로는 전체 요소들을 서브 요소로 나누고,
 * 이 서브요소들을 개별 쓰레드로 처리한다.
 * 이 서브 요소들의 처리 결과를 결합하여 최종 처리 결과를 리턴하게 된다.
 * 
 * isParallel() 메서드를 이용하여 병렬 여부를 확인할 수 있다.
 * 
 * 순차처리방식과 병렬처리 방식의 처리 실행 속도를 비교하는 예제.
 * */
public class StreamParallel {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		
		/*순차 스트림
		 * : 요소의 수가 적거나 요소처리 시간이 짧은 경우에 유리
		 * 병렬처리의 경우, 스레드를 생성하는 시간이 추가적으로 발생하기 때문이다.
		 * 코어가 하나 인 경우에는 순차적 처리가 더 빠르다.
		 * */
		long start = System.nanoTime();
		//stream() 순차적 스트림 처리
		list.stream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 : " + (end - start) + "nano sec");
		
		
		
		/*병렬 처리
		 *: 코어의 수에 따라 성능 차이가 달라짐. */
		start = System.nanoTime();
		//parallelStream() 병렬 스트림 처리
		list.parallelStream().forEach(a -> {
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		end = System.nanoTime();
		System.out.println("병렬 스트림 처리 시간 : " + (end - start) + "nano sec");
	
	}
}
