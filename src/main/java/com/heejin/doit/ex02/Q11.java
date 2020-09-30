package com.heejin.doit.ex02;

public class Q11 {

  static class YMD {
    int y;
    int m;
    int d;

    YMD(int y, int m, int d) {
      this.y = y;
      this.m = m;
      this.d = d;
    }

    public YMD after(int n) {
      int newD = d + n;
      return new YMD(y + newD / 365, m + (newD % 365) / 31, (newD % 365) % 31);
    }
    
    public YMD before(int n) {
      int newD = d - n;
      int newM = m;
      int newY = y;
      
      while (newD <= 0) {
        newD += 31;
        newM--;
        if (newM < 0) {
          newM += 365;
          newY--;
        }
      }
      return new YMD(newY, newM, newD);
    }
  }

  public static void main(String[] args) {
    YMD ymd  = new YMD(2020, 3, 28);

    System.out.println(ymd.after(40).y);
    System.out.println(ymd.after(40).m);
    System.out.println(ymd.after(40).d);
    
    System.out.println(ymd.before(28).y);
    System.out.println(ymd.before(28).m);
    System.out.println(ymd.before(28).d);
  }


}
