package com.heejin.baekjoon.ex08;

import java.util.Scanner;

public class No10250 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String[] arr = new String[num];
    for (int i = 0; i < num; i++) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      int N = sc.nextInt();
      
      arr[i] = caseSolve(H, W, N);
    }
    
    for (String result : arr) {
      System.out.println(result);
    }
  }
  
  static String caseSolve(int H, int W, int N) {
    int X;
    int Y;
    if (N % H == 0) {
      Y = H;
      X = N / H; 
    } else {
      Y = N % H;
      X = N / H + 1;
    }
    
    if (X < 10) {
      return Y + "0" + X;
    } else {
      return Y + "" + X;
    }
  }
}
