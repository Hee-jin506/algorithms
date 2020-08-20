package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No10809 {
  public static void main(String[] args) {
    int[] counts = new int[26];
    for (int i = 0; i < 26; i++) {
      counts[i] = -1;
    }
    Scanner sc = new Scanner(System.in);
    char[] chars = sc.nextLine().toCharArray();
    for (int i = 0; i < chars.length; i++) {
      for (int j = 0; j < 26; j++) {
        if (chars[i] == j + 97) {
          if (counts[j] == -1) {
            counts[j] = i;
          }
        }
      }
    }
    for (int count : counts) {
      System.out.println(count);
    }
  }
}
