package com.heejin.doit.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    String[] x = {
        "abstract", "assert", "boolean", "break", "byte",
        "case", "catch", "char", "class", "const", "continue",
        "default", "do", "double", "else", "enum", "extends",
        "final", "finally", "float", "for", "goto", "if"
    };
    
    String ky = stdIn.next();
    
    int idx = Arrays.binarySearch(x, ky);
    
    if (idx < 0)
      System.out.println("해당 키워드가 없습니다.");
    else
      System.out.println("해당 키워드는 x[" + idx +  "]에 있습니댜.");
  }
}
