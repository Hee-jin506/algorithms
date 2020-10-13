package com.heejin.programmers;

public class No43238 {
  static long solution(int n, int[] times) {
    Customer[] customers = new Customer[n];
    for (int i = 0; i < times.length; i++) {
      customers[i] = new Customer(times[i], times[i]);
    }

    for  (int i = times.length; i < n; i++) {
      long min = customers[i - 1].time + customers[i - 1].num;
      long num = 0;
      for (int j = i - 1; j >= i - times.length; j--) {
        if (min > customers[j].time + customers[j].num) {
          min = customers[j].time + customers[j].num;
          num = customers[j].num;
        }
        customers[i] = new Customer(min, num);
      }
    }
    return customers[n - 1].time;
  }

  static class Customer {
    long time = 0;
    long num = 0;

    public Customer(long time, long num) {
      this.time = time;
      this.num = num;
    } 
  }

  public static void main(String[] args) {
    System.out.println(solution(6, new int[] {7, 10}));
  }
}
