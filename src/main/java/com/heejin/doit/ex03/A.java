package com.heejin.doit.ex03;

public class A implements Comparable<A> {
  @Override
  public int compareTo(A c) {
    return 0;
  }
  
  @Override
  public boolean equals(Object c) {
    return true;
  }
}
