package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No1316 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int num = sc.nextInt();
    int count = 0;
    for (int i = 0; i < num; i++) {
      if (same() == true) {      
        count++;
      }
    }
    System.out.println(count);
  }
  
  static boolean same() {
    String str = sc.next();
    loop :
    for (int i = 0; i < str.length(); i++) {
      boolean same = true;
      for (int j = i + 1; j < str.length(); j++) {
        if (same == true && str.charAt(i) != str.charAt(j)) {
          same = false;
        } else if (same == false && str.charAt(i) == str.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }
}
