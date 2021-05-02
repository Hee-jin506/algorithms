package com.heejin.programmers;

import java.util.Arrays;

public class No12981 {
	public int[] solution(int n, String[] words) {
		int person;
		int turn;
		int target = find(words);
		
		if (target == -1) {
			int[] answer = {0, 0};
			return answer;
		}
		
		if (target % n == 0) {
			person = n;
			turn = target / n;
		} else {
			person = target % n;
			turn = target / n + 1;
		}

		int[] answer = {person, turn};
		
		return answer;
	}

	public boolean verify(String target, char forward, String[] no) {

		if (target.length() <= 1) {
			return false;
		}
		
		if (no == null) {
			return true;
		}
		
		if (target.charAt(0) != forward) {
			return false;
		}
		
		for (String str : no) {
			if (target.equals(str)) {
				return false;
			}
		}
		
		return true;
	}

	public int find(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (i == 0) {
				if (!verify(words[i], '!', null)) {
					return i + 1;
				}
			} else {
				if (!verify(words[i], words[i-1].charAt(words[i-1].length() - 1), Arrays.copyOfRange(words, 0, i - 1))) {
					return i + 1;
				}
			}

		}
		
		return -1;
	}
}
