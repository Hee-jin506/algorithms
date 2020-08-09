package com.heejin.baekjoon.ex05;

import java.util.Scanner;

public class No2562 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[9];
    for (int i = 0; i < 9; i++) {
      a[i] = sc.nextInt();
    }
    int max = a[0];
    int count = 1;
    for (int i = 0; i < 9; i++) {
      if (max < a[i]) {
        max = a[i];
        count = i + 1;
      }
    }
    System.out.println(max);
    System.out.println(count);
  }

}
