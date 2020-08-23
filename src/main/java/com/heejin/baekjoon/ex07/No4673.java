package com.heejin.baekjoon.ex07;

import java.util.ArrayList;

public class No4673 {
  public static void main(String[] args) {
    boolean[] total = new boolean[10000];
    for (int i = 1; i <= 10000; i++) {
      for (Object j : dd(i)) {
        total[(int)j - 1] = true;
      }
    }
    for (int i = 0; i < 10000; i++) {
      if (total[i] ==  false) {
        System.out.println(i + 1);
      }
    }
  }
  
  static int d(int n) {
    int sum = n;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
  
  static ArrayList dd(int n) {
    ArrayList list = new ArrayList();
    while (n <= 10000) {
      n = d(n);
      if (n <= 10000) {
        list.add(n);        
      }
    }
    return list;
  }
}
