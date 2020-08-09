package com.heejin.baekjoon.ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class No3052 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] sur = new int[42];
    int count = 0;
    for (int i = 0; i < 10; i++) {
      sur[sc.nextInt() % 42]++;
    }
    for (int s : sur) {
      if (s != 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
