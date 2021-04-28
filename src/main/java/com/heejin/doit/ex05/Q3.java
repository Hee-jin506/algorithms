package com.heejin.doit.ex05;

import java.util.Scanner;

public class Q3 {
  
  static int gcdArray(int[] a) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (min > a[i] && a[i] != 0)
        min = a[i];
    }
    
    int i = 0;
    for (; i < a.length; i++) {
      if (a[i] != 0 && a[i] != min) {
        break;
      }
    }
    
    if (i != a.length) {
      for (int j = 0; j < a.length; j++) {
        if (a[j] != min && a[j] != 0)
          a[j] %= min;
      }
      return gcdArray(a);
    } else {
      return min;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("배열길이 : ");
    int n = sc.nextInt();
    
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    System.out.println(gcdArray(a));
  }
  
}
