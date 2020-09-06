package com.heejin.baekjoon.ex09;

import java.util.Scanner;

public class No1929 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    boolean[] sosus = sosus(M, N);
    for (int i = 0; i < sosus.length; i++) {
      if (sosus[i] == false) {
        System.out.println(i + M);
      }
    }
  }
  
  static boolean[] sosus(int min, int max) {
    boolean[] whole = new boolean[max - min + 1];
    if (min == 1) {
      whole[0] = true;
    }
    for (int i = 2; i <= max; i++) {
      for (int j = 2; j <= max / 2 ; j++) {
        if (i * j > max) {
          break;
        }
        if (i * j >= min) {
          whole[i * j - min] = true; 
        }
      }
    }
    return whole;
  }
}
