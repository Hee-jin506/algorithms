package com.heejin.baekjoon.star;

import java.util.Scanner;

public class No2447 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int size = sc.nextInt();
    
    char[][] spaces = new char[size][size];
    
    squareStars(spaces, 0, 0, size, false);
    
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++)
        sb.append(spaces[i][j]);
      sb.append("\n");
    }
    
    System.out.println(sb);
  } 
  
  static void squareStars(char[][] spaces, int x, int y, int size, boolean blank) {
    
    if (blank) {
      for (int i = x; i < x + size; i++)
        for (int j = y; j < y + size; j++)
          spaces[i][j] = ' ';
      return;
    }
    
    if (size == 1) {
      spaces[x][y] = '*';
      return;
    }
    
    int blockSize = size / 3;
    int count = 0;
    for (int i = x; i < x + size; i += blockSize) {
      for (int j = y; j < y + size; j += blockSize) {
        count++;
        if (count == 5)
          squareStars(spaces, i, j, blockSize, true);
        else 
          squareStars(spaces, i, j, blockSize, false);
      }
    }
  }
}
