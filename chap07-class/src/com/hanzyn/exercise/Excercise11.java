package com.hanzyn.exercise;

public class Excercise11 {

	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13, 3, 21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}

}

class Math {
	int maxNum, minNum;
	
	int max(int arr[]){
		maxNum = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if(maxNum < arr[i])
				maxNum = arr[i];
		}
		return maxNum;
	}
	
	int min(int arr[]){
		minNum = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if(minNum > arr[i])
				minNum = arr[i];
		}
		return minNum;
	}
}