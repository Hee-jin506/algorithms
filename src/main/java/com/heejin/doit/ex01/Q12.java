package com.heejin.doit.ex01;

public class Q12 {
  public static void main(String[] args) {
    multipleLineTable();
  }
  
  static void multipleLineTable() {
    System.out.print("  |");
    for (int i = 1; i <= 9; i++)
      System.out.printf("%3d", i);
    System.out.println("\n--+---------------------------");
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d |", i);
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%3d", i * j);
      }
      System.out.println();
    }
  }
}
