package com.heejin.baekjoon.ex02;

import java.util.Scanner;

public class No2884 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int m = sc.nextInt();
    
    if (m >= 45) {
      m -= 45;
    } else {
      if (h == 0) {
        h = 23;
        m += 15;
      } else {
        h -= 1;
        m += 15;
      }
    }
    System.out.println(h + " " + m);
    sc.close();
  }
}
