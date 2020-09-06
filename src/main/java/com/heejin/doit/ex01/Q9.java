package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q9 {
  static int plus(int max) {
    return (int) ((1 + max) * max / 2.0f);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(plus(sc.nextInt()));
  }
}
