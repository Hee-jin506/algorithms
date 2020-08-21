package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No2908 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    
//    a = a / 100 + a % 100 / 10 * 10 + a % 10 * 100;
//    System.out.println(a);
    a = new String(new char[] {a.charAt(2), a.charAt(1), a.charAt(0)});
    b = new String(new char[] {b.charAt(2), b.charAt(1), b.charAt(0)});
    
    if (Integer.valueOf(a) > Integer.valueOf(b)) {
      System.out.println(a);
    } else  {
      System.out.println(b);
    }
    
  }

}
