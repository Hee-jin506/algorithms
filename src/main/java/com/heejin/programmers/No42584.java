package com.heejin.programmers;

public class No42584 {
    public int[] solution(int[] prices) {
    	int[] answer = new int[prices.length];
    	
    	for (int i = 0; i < prices.length; i++) {
    		int now = prices[i];
    		int time = 0;
    		for (int j = i + 1; j < prices.length; j++) {
    			if (now > prices[j]) {
    				time = j - i;
    				break;
    			}
    		}
    		
    		if (time == 0) {
    			time = prices.length - 1 - i;
    		}
    		
    		answer[i] = time;
    	}
        return answer;
    }
}
