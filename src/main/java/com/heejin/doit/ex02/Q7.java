package com.heejin.doit.ex02;

import java.util.Scanner;

public class Q7 {
  
  static void cardConvPic() {
    Scanner sc = new Scanner(System.in);
    System.out.println("10진수를 기수 변환합니다.");
    System.out.print("변환하는 음이 아닌 정수 : ");
    int x = sc.nextInt();
    System.out.print("어떤 진수로 변환할까요?(2-36) : ");
    int r = sc.nextInt();
    
    String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] d = new char[30];
    int digit = 0;
    
    do {
      if (digit == 0) {
        System.out.printf("%d|      %d\n", r, x);
        System.out.println(" +--------");
      } else {
        System.out.printf("%d|      %d  . . .%d\n", r, x, x % r);
        System.out.println(" +--------");
      }
      d[digit++] = str.charAt(x % r);
      if (x / r == 0) {
        System.out.printf("        %d  . . .%d\n", 0, x % r);
      }
      x /= r;
    } while (x != 0);
    
    System.out.print("2진수로 ");
    for (int i = digit - 1; i >= 0; i--)
      System.out.print(d[i]);
    System.out.println("입니다.");
  }
  
  public static void main(String[] args) {
    cardConvPic();
  }

}
