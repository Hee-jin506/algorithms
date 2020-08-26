package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No2869 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int up = sc.nextInt();
    int down = sc.nextInt();
    int goal = sc.nextInt();

    // (n - 2)(up - down) + up < goal <= (n - 1)(up - down) + up
    // (n - 2)(up - down) < goal - up <= (n - 1)(up - down)
    // n - 2 < (goal - up) / (up - down) <= n - 1
    // n < (goal - up) / (up - down) + 2 && n >= (goal - up) / (up - down) + 1
    
    if ((goal - up) % (up - down) == 0) {
      System.out.println((goal - up) / (up - down) + 1);
    } else {
      System.out.println((goal - up) / (up - down) + 2);
    }
  }
}
