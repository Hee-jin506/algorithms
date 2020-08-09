  package com.heejin.baekjoon.ex03;

  import java.util.Scanner;

  public class No11022 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] a = new int[num];
    int[] b = new int[num];
    
    for (int i = 0; i < num; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    
    for (int i = 0; i < num; i++) {
      System.out.printf("Case #%d: %d + %d = %d\n", i+1, a[i], b[i], a[i] + b[i]);
    }
  }
}
