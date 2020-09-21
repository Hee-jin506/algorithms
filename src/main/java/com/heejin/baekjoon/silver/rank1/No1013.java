package com.heejin.baekjoon.silver.rank1;

import java.util.Scanner;

public class No1013 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    sc.nextLine();
    
    boolean[] results = new boolean[num];
    
    for (int i = 0; i < num ; i++) {
      results[i] = pattern(sc.nextLine());
    }
    
    for (boolean ans : results) {
      if (ans)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
    
  }
  
  static boolean pattern(String line) {
    
    int cursor = 0;
    
    while (cursor < line.length()) {
      if (line.charAt(cursor) == '0') {
        if (line.charAt(++cursor) != '1')
          return false;
      } else {
        
        if (!(line.charAt(++cursor) == '0'
            && line.charAt(++cursor) == '0'))
          return false;
        
        cursor++;
        for (; line.charAt(cursor) != '1'; cursor++) {
          if (cursor == line.length())
            return false;
        }
        
        for (; cursor < line.length(); cursor++) {
          if (line.charAt(cursor) != '1')
            return false;
        }
      }
    }
    return true;
  }
}
