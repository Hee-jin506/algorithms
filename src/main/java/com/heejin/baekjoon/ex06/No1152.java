package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No1152 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] words = str.split(" ");
    int count = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() != 0) {
        count++;
      }
    }
    System.out.println(count);
  }

}
