package com.heejin.baekjoon.star;

import java.util.Scanner;

public class No2443 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    for (int i = num; i >= 1; i--) {
      for (int j = 0; j < num - i; j++)
        System.out.print(" ");
      for (int j = 0; j < i * 2 - 1; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}
