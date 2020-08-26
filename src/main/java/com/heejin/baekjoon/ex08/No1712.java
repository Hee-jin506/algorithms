package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No1712 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fixed = sc.nextInt();
    int variable = sc.nextInt();
    int price = sc.nextInt();
    int count = 0;
    
    if (variable >= price) {
      System.out.println(-1);
    } else {
      while (fixed + variable * count >= price * count) {
        count++;
      }
      System.out.println(count);
      
    }
  }
}
