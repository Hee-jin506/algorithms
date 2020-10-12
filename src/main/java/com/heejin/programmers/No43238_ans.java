package com.heejin.programmers;

import java.util.Arrays;

class No43238_ans {
  public long solution(int n, int[] times) {
    Arrays.sort(times);
    long min = 1;
    long max = (long)times[times.length - 1] * n;
    long mid = 0;
    long sum;
    long answer = max;

    while (min <= max) {
      sum = 0;
      mid = (min + max) / 2;
      for (int time : times) {
        sum += mid/time;
      }
      if (sum >= n) {
        if (mid < answer) {
          answer = mid;
        }
        max = mid - 1;
      }
      else {
        min = mid + 1;
      }
    }
    return answer;
  }
}