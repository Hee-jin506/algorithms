package com.heejin.doit.ex03;

import java.util.Comparator;

public class X {
  public static final Comparator<X> COMPAROTOR = new Comp();

  private static class Comp implements Comparator<X> {
    @Override
    public int compare(X o1, X o2) {
      // TODO Auto-generated method stub
      return 0;
    }
  }
}
