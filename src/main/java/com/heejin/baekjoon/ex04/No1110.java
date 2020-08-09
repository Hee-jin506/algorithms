package com.heejin.baekjoon.ex04;

import java.util.Scanner;

public class No1110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = n;
    int count = 0;
    while (true) {
      count++;
      int a = k / 10;
      int b = k % 10;
      int c = (a + b) % 10;
      if (b * 10 + c == n) {
        break;
      }
       k = b * 10 + c;
    }
    System.out.println(count);
  }
}
