package com.heejin.doit.ex02;

import java.util.Scanner;

public class Q4 {
  static void copy(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      a[i] = b[i];
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] a = new int[n];
    
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("b[" + i + "] : ");
      b[i] = sc.nextInt();
    }
    
    copy(a, b);
    
    System.out.print("a 배열 : ");
    for (int num : a) {
      System.out.print(num + " ");
    }
  }
}
