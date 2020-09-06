package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q8 {
  static int plus(int a, int b) {
      return (int) ((a + b) * (b - a + 1) / 2.0f);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(plus(sc.nextInt(), sc.nextInt()));
  }
}
