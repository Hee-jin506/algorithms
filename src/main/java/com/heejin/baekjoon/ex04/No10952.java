package com.heejin.baekjoon.ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class No10952 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList al = new ArrayList();
    while (true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a == 0 && b == 0) {
        break;
      }
      al.add(a + b);
    }
    for (Object i: al) {
      System.out.println(i);
    }
  }
}
