package com.heejin.programmers;

public class No43165 {
	public int solution(int[] numbers, int target) {
		return findMethods(numbers, 0, target, 0);
	}
	
	public int findMethods(int[] numbers, int sum, int target, int index) {
		
		if (index == numbers.length) {
			if (sum == target) {
				return 1;
			} else {
				return 0;
			}
		}
		
		int result = 0;
		result += findMethods(numbers, sum + numbers[index], target, index + 1);
		result += findMethods(numbers, sum - numbers[index], target, index + 1);
		return result;
	}
	
	public static void main(String[] args) {
		int[] ints = {1, 1, 1, 1, 1};
		System.out.println(new No43165().solution(ints, 3));
	}

}
