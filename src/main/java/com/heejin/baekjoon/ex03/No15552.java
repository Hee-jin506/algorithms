package com.heejin.baekjoon.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No15552 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
        String text = br.readLine();
        String[] word = text.split(" ");

        int a = Integer.parseInt(word[0]);
        int b = Integer.parseInt(word[1]);

        bw.write(String.valueOf(a + b) + "\n");    
    }
    bw.flush();
    bw. close();
}
}
