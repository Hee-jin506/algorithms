package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No2292 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n--;
    int count = 0;
    while (n > 0) {
      count++;
      n -= count * 6;
    }
    System.out.println(count + 1);
  }

}
