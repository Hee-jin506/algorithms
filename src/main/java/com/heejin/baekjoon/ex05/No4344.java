package com.heejin.baekjoon.ex05;

import java.util.Scanner;

public class No4344 {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    float[] percentage = new float[num];
    
    for (int i = 0; i < num; i++) {
      int n = sc.nextInt();
      int[] scores = new int[n];
      int sum = 0;
      int student = 0;
      for (int j = 0; j < n; j++) {
        scores[j] = sc.nextInt();
        sum += scores[j];
      }
      for (int score : scores) {
        if (score > sum / (float)n) {
          student++;
        }
      }
      percentage[i] = student / (float)n * 100;
    }
    for (float per : percentage) {
      System.out.printf("%.3f%%\n", per);
    }
  }

}
