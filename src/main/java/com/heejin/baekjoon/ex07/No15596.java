package com.heejin.baekjoon.ex07;

public class No15596 {
  static class Test {
    static public long sum(int[] a) {
      int result = 0;
      for (int i : a) {
        result += i;
      }
      return result;
          
    }
    
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    System.out.println(Test.sum(arr));
  }
}
