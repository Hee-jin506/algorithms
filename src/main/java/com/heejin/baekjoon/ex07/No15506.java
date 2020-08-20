package com.heejin.baekjoon.ex07;

import java.util.Scanner;

public class No15506 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if (n < 100) {
      System.out.println(n);
    } else {
      int count = 0;
      if (n >= 100) {
        for (int i = 100; i <= n; i++) {
          if ((i / 100) - (i % 100 / 10) == (i % 100 / 10) - (i % 10)) {
            count++;
          }
        }
      }
      System.out.println(count + 99); 
    }
  }
}
