package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No2775 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] results = new int[num];
    for (int i = 0; i < num; i++) {
      int k = sc.nextInt();
      int n = sc.nextInt();
      results[i] = caseSolve(k, n);
    }
    
    for (int result : results) {
      System.out.println(result);
    }
    
  }
  
  static int caseSolve(int k, int n) {
    int[] floor = new int[n];
    for (int i = 0; i < n; i++) {
      floor[i] = i + 1;
    }
    
    for (int i = 0; i < k; i++) {
      for (int j = 1; j < n; j++) {
        floor[j] = floor[j - 1] + floor[j];
      }
    }
    return floor[n - 1];
  }
}
