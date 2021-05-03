package com.heejin.programmers;

import java.util.Scanner;

public class No62048 {
    public long solution(int w, int h) {
    	float[] ys = slide(w, h);
    	int[] boxes = boxes(ys, h);
    	long answer = 0;
    	for (int i : boxes) {
    		answer += i;
    	}
        return answer;
    }
    
    public float[] slide(int w, int h) {
    	float[] ys = new float[w + 1];
    	for (int x = 0; x <= w; x++) {
    		ys[x] = (w * h - h * x) / (float)w;
    	}
    	return ys;
    }
    
    public int[] boxes(float[] ys, int h) {
    	int[] boxes = new int[ys.length - 1];
    	for (int i = 0; i < boxes.length; i++) {
    		int start = (int) Math.ceil(ys[i]);
    		int end = (int) Math.floor(ys[i + 1]);
    		boxes[i] = h - (start -  end);
    	}
    	return boxes;
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] answer = new No62048().slide(3,12);
		for (float f : answer) {
			System.out.println(f);
		}
		
		System.out.println(new No62048().solution(3, 12));
	}
}
