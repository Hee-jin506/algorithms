package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q17 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    spira(n);
  }
  
  static void spira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i; j++)
        System.out.print(" ");
      for (int j = 0; j < (i - 1) * 2 + 1; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}
