package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No1157 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toUpperCase();
    int max = 0;
    char maxChar = 0;
    int maxCount = 0;
    for (int i = 0; i < 26; i++) {
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == 65 + i) {
          count++;
        }
      }
      if (max < count) {
        max = count;
        maxChar = (char) (65 + i);
        maxCount = 0;
      } else if (max == count) {
        maxCount++;
      }
    }
    if (maxCount == 0) {
      System.out.println(maxChar);
    } else {
      System.out.println("?");
    }
  }
}
