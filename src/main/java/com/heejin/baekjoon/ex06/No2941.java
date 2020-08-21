package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No2941 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int index = 0;
    int count = 0;
    while (index < str.length()) {
      count++;
      if ((index <= str.length() - 2) &&
          (str.substring(index, index + 2).equals("c=") ||
          str.substring(index, index + 2).equals("c-") ||
          str.substring(index, index + 2).equals("d-") ||
          str.substring(index, index + 2).equals("lj") ||
          str.substring(index, index + 2).equals("nj") ||
          str.substring(index, index + 2).equals("s=") ||
          str.substring(index, index + 2).equals("z="))) {
        index++;
      } else if (index <= str.length() - 3 && str.substring(index, index + 3).equals("dz=")) {
        index += 2;
      }
      index++;
    }
    System.out.println(count);
  }

}
