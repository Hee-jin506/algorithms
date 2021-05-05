package com.heejin.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;


public class No67257 {
	
	public long solution(String expression) {
		List<String> operators = operators(expression);
		if (operators.size() == 2) {
			String[] elements = extract(expression);
			for (int i = 0; i < 2; i++) {
				for (int j = 1; j < elements.length - 1; i += 2) {
					
				}
			}
		}
        long answer = 0;
        return answer;
    }

	public List<String> operators(String s) {
		List<String> operators = new ArrayList<>();
		if (s.contains("+") && s.contains("-")) {
			operators.add("+");
		}
		if (s.contains("-")) {
			operators.add("-");
		}
		if (s.contains("*")) {
			operators.add("*");
		}
		return operators;
	}
	
	public String[] extract(String s) {
		String[] operands = s.split("[^0-9]");
		System.out.println(operands.length);
		String[] operators = s.split("[0-9]+");
		System.out.println(operators.length);
		String[] result = new String[operands.length + operators.length - 1];
		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = operands[i/2];
			} else {
				result[i] = operators[i/2 + 1];
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		No67257 p = new No67257();
		
		System.out.println(p.operators(s));
		for (String i : p.extract(s)) {
		System.out.print(i + " ");
		}
	}

}
