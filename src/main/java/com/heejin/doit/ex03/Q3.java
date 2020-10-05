package com.heejin.doit.ex03;

import java.util.Scanner;

public class Q3 {
  static int searchIdx(int[] a, int n, int key, int[] idx) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == key)
        idx[count++] = i;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요솟수: ");
    int num =  stdIn.nextInt();
    int[] x = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print("x[" + i + "]: ");
      x[i] = stdIn.nextInt();
    }

    System.out.print("검색할 값: ");
    int ky = stdIn.nextInt();
    int[] idx = new int[num];
    int count = searchIdx(x, num, ky, idx);

    if (count == 0)
      System.out.println("그 값의 요소가 없습니다.");
    else
      for (int i : idx) 
        System.out.print(i + " ");
  }

}
