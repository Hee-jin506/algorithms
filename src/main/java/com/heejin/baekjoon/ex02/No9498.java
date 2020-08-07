package com.heejin.baekjoon.ex02;

import java.util.Scanner;

public class No9498 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
   int score = sc.nextInt(); 
   
   if (score >= 60) {
     if (score >= 70) {
       if (score >= 80) {
         if (score >= 90) {
           System.out.println("A");
           return;
         }
         System.out.println("B");
         return;
       }
       System.out.println("C");
       return;
     }
     System.out.println("D");
     return;
   } else
   System.out.println("F");
  }
}
