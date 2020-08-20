package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No1157 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int[] counts = new int[26];
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < 26; j++) {
        if (str.charAt(i) == j + 65) {
          counts[j]++;
        }
      }
    }
    
  }
}
