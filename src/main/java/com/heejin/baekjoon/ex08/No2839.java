package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No2839 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int divide = n / 5;
    int result = 0;
    while (divide >= 0) {
      if ((n - divide * 5) % 3 == 0) {
        result += divide + (n - divide * 5) / 3;
        break;
      } else {
        divide--;
      }
    }
    if (result != 0) {
      System.out.println(result);
    } else {
      System.out.println(-1);
    }
  }
}
