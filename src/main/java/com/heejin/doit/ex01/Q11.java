package com.heejin.doit.ex01;

import java.util.Scanner;

public class Q11 {
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    getJari2();
  }
  static void getJari() {
    String str = sc.next();
    System.out.println("그 수는 " + str.length() + "자리입니다.");
    
  }
  
  static void getJari2() {
    int ten = 1;
    int count = 0;
    int n = sc.nextInt();
    while (n >= ten) {
      count++;
      ten *= 10;
    }
    System.out.println("그 수는 " + count + "자리입니다.");
  }
}
