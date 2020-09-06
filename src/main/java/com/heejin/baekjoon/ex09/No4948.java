package com.heejin.baekjoon.ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class No4948 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean[] sosus = sosus(1, 246912);
    ArrayList<Integer> ans = new ArrayList<Integer>(); 
    while (true) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      int count = 0;
      for (int i = n + 1; i <= 2 * n; i++) {
        if (sosus[i - 1] == false) {
          count++;
        }
      }
      ans.add(count);
    }
    for (int a : ans) {
      System.out.println(a);
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
