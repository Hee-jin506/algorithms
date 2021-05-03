package com.heejin.programmers;

import java.util.Scanner;

public class No12951 {
	public String solution(String s) {

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					s = (char)(s.charAt(i) - 32) + s.substring(i + 1);
				}
			} else if (s.charAt(i - 1) == ' ') {
				if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					if (i < s.length() - 1) {
						s = s.substring(0, i) + (char)(s.charAt(i) - 32) + s.substring(i + 1);
					} else {
						s = s.substring(0, i) + (char)(s.charAt(i) - 32);
					}
				}
			}
		}

		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("\"" + new No12951().solution(str) + "\"" );
	}
}