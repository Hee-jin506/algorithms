package com.heejin.programmers;

import java.util.ArrayList;
import java.util.List;

public class No42586 {
    public int[] solution(int[] progresses, int[] speeds) {
    	int[] completingDays = completingDay(progresses, speeds);
        List<Integer> list = new ArrayList<>();
        int max = completingDays[0];
        int functions = 0;
        
        for (int i = 0; i < completingDays.length; i++) {
        	
        	if (completingDays[i] <= max) {
        		functions++;
        	} else {
        		list.add(functions);
        		max = completingDays[i];
        		functions = 1;
        	}
        	
        }
        list.add(functions);
        int[] answer = new int[list.size()]; 
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public int[] completingDay(int[] progresses, int[] speeds) {
    	int[] completingDays = new int[progresses.length];
    	for (int i = 0; i < progresses.length; i++) {
    		int days = (100 - progresses[i]) / speeds[i];
    		if ((100 - progresses[i]) % speeds[i] != 0) {
    			days++;
    		}
    		completingDays[i] = days;
    	}
    	return completingDays;
    }
    
}
