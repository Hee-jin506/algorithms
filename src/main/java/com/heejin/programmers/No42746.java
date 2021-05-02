package com.heejin.programmers;


import java.util.Arrays;
import java.util.Comparator;

public class No42746 {
    public String solution(int[] numbers) {
    	String[] nums = align(convert(numbers));
    	
    	if (nums[0].equals("0")) {
    		return "0";
    	}
    	
    	String answer = "";
    	for (String num : nums) {
    		answer = answer + num;
    	}
        return answer;
    }
    
    public String[] convert(int[] numbers) {
    	String[] nums = new String[numbers.length];
    	for (int i = 0; i < nums.length; i++) {
    		nums[i] = String.valueOf(numbers[i]);
    	}
    	return nums;
    }
    
    public String[] align(String[] nums) {
    	Arrays.sort(nums, new Comparator<String>() {
    		public int compare(String str1, String str2) {
    			return Integer.valueOf(str2 + str1) - Integer.valueOf(str1 + str2);
    		}
    	});
    	
    	return nums;
    }
    
    
    public static void main(String args[]) {
    	int[] nums = {3, 30, 34, 5, 9};
    	System.out.println(new No42746().solution(nums));
    }
}
