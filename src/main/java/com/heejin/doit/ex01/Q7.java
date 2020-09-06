package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q7 {
  static int plus(int max) {
    int sum = 0;
    for (int i = 1; i <= max; i++) {
      sum += i;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(plus(sc.nextInt()));
  }

}
