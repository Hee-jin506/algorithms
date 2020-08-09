package com.heejin.baekjoon.ex05;

import java.util.Scanner;

public class No8958 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    int[] scores = new int[num];

    for (int i = 0; i < num; i++) {
      int count = 0;
      String str = sc.nextLine();
      for (int j = 0; j < str.length(); j++) {
        if(str.charAt(j) =='O') {
          scores[i] += ++count;
        } else {
          count = 0;
        }
      }
    }
    for (int score : scores) {
      System.out.println(score);
    }
  }
}
