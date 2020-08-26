package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No1152_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int word = 0;
    for (int i = 0; i < str.length(); i++) {
      if (i < str.length() - 1
          && str.charAt(i) == ' ' 
          && str.charAt(i + 1) >= 'A' 
          && str.charAt(i + 1) <= 'z') {
        word++;
      }
      if (i == 0 
          && str.charAt(i) >= 'A' 
          && str.charAt(i) <= 'z') {
        word++;
      }
    }
    System.out.println(word);
    
  }

}
