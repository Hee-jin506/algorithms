package com.heejin.baekjoon.ex05;

import java.util.Scanner;

public class No1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] score = new int[num];
    for (int i = 0; i < num; i++) {
      score[i] = sc.nextInt();
    }
    int sum = 0;
    int max = score[0];
    for (int a : score) {
      sum += a;
      if (max < a) {
        max = a;
      }
    }
    System.out.println((sum / (float)max * 100) / num);
    
    
  }
}
