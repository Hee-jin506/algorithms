package com.heejin.baekjoon.ex05;

import java.util.Scanner;

public class No2577 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] list = {0,1,2,3,4,5,6,7,8,9};
    int [] score = new int[10];
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int n = a * b * c;
    
    while (n != 0) {
      int k = n % 10;
      for (int i = 0; i < 10; i++) {
        if (list[i] == k) {
          score[i] += 1;
        }
      }
      n = n / 10;
    }
    for (int s : score) {
      System.out.println(s);
    }
  }
}
