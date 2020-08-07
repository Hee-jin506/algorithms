package com.heejin.baekjoon.ex03;

import java.util.Scanner;

public class No10950 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] result = new int[num];
    for (int i = 0; i < num; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      result[i] = a + b;
    }
    for (int ab : result) {
      System.out.println(ab);
    }
    sc.close();
  }

}
