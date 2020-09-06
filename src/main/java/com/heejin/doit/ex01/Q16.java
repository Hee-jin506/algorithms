package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q16 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    npira(n);
  }
  
  static void npira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i; j++)
        System.out.print(" ");
      for (int j = 0; j < (i - 1) * 2 + 1; j++)
        System.out.print(i);
      System.out.println();
    }
  }
}
