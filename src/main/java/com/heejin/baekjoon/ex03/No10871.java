package com.heejin.baekjoon.ex03;

import java.util.Scanner;

public class No10871 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    
    for (int am : a) {
      if (am < x) {
        System.out.printf("%d ", am);
      }
    }
  }
}
