package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No11720 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    String str = sc.nextLine();
    char[] ca = str.toCharArray();
    int sum = 0;
    for (char value : ca) {
      sum += Integer.valueOf(value);
    }
    System.out.println(sum);
    
  }

}
