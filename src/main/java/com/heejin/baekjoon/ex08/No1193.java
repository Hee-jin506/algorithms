package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No1193 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int group = 1;
    while (x - group > 0) {
      x -= group;
      group++;
    }
    
    if (group % 2 == 0) {
      System.out.println(x + "/" + (group + 1 - x));
    } else {
      System.out.println((group + 1 -x) + "/" + x);
    }
  }

}
