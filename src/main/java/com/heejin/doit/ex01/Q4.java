package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q4 {
  static int med3(int a, int b, int c) {
    if (a >= b)
      if (b >= c)
        return b;
      else if (a >= c)
        return c;
      else
        return a;
    else if (a >= c)
      return a;
    else if (b <= c)
      return b;
    else
      return c;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    System.out.println(med3(a, b, c));
  }
}
