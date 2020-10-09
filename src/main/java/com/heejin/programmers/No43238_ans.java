package com.heejin.programmers;

class No43238_ans {
  static long solution(int n, int[] times) {
      long answer = 0;
      long max = 0;
      long min = 0;
      for (int time : times) {
          if (max < time)
              max = time;
      }
      max *= n;
      
      while (min <= max) {
          long cnt = 0;
          long mid = (max + min) / 2;
          for (int time : times) {
              cnt += mid / time;
          }
          if (cnt < n) {
              min = mid + 1;
          } else if (cnt == n) {
              answer = mid;
              break;
          } else {
              max = mid - 1;
          }
      }
      return answer;
  }
  public static void main(String[] args) {
    System.out.println(solution(6, new int[] {7, 10}));
  }
}