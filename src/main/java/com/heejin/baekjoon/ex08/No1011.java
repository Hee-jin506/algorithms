package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No1011 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] results = new int[num];
    for (int i = 0; i < num; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      results[i] = caseSolve(y - x);
    }
    for (int result : results) {
      System.out.println(result);
    }
  }
  static int caseSolve(int distance) {
    int maxK = 1;
    int count = 0;
    while ((distance - (maxK - 1) - maxK) >= 0) {
      distance -= (maxK - 1) + maxK;
      maxK++;
    }
    maxK--;
    count += (maxK - 1) * 2 + 1;
    
    if (distance % maxK == 0) {
      count += distance / maxK;
    } else {
      count += distance / maxK + 1;
    }
    return count;
  }
}
