package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q2 {
  
  static int min3(int a, int b, int c) {
    int max = a;
    
    if (max > b) {
      max = b;
    }
    
    if (max > c) {
      max = c;
    }
       
    return max;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    System.out.println(min3(a, b, c));
  }
}
