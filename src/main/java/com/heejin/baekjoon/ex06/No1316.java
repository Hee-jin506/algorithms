package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No1316 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    for (int i = 0; i < num; i++) {
      String str = sc.nextLine();
      boolean result = true;
      loop:
      for (int j = 0; j < str.length(); j++) {
        boolean same = true;
        for (int k = j; k < str.length(); k++) {
          if (same = true) {
            if(str.charAt(j) != str.charAt(k)) {
              same = false;
            }
          } else {
            if (str.charAt(j) == str.charAt(k)) {
              result = false;
            }
          }
        }
      }
      if (result == true) {
        count++;
      }
    }
    System.out.println(count);
  }
}
