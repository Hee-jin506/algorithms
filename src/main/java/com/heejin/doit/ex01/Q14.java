package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    square(n);
  }
  
  static void square(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.print("* ");
      System.out.println();
    }
  }
}
