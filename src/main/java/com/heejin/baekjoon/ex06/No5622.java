package com.heejin.baekjoon.ex06;

import java.util.Scanner;

public class No5622 {
  public static void main(String[] args) {
    int time = 0;
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    for (int i = 0; i < word.length(); i++) {
      time += 3;
      if (word.charAt(i) >= 68) {
        time++;
        if (word.charAt(i) >= 71) {
          time++;
          if (word.charAt(i) >= 74) {
            time++;
            if (word.charAt(i) >= 77) {
              time++;
              if(word.charAt(i) >= 80) {
                time++;
                if(word.charAt(i) >= 84) {
                  time++;
                  if (word.charAt(i) >= 87) {
                    time++;
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println(time);
    
  }
}
