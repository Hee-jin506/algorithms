package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No2675 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String[] str = new String[num];
    for (int j = 0; j < num; j++) {
      int count = sc.nextInt();
      char[] chars = sc.nextLine().trim().toCharArray();
      String result = "";
      for (char ch : chars) {
        for (int i = 0; i < count; i++) {
          result = result + ch;
        }
      }
      str[j] = result;
    }
    for (String s : str) {
      System.out.println(s);
    }
  }
}