package com.heejin.data_structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
  private List list;
  
  public ListClientExample() {
    list = new ArrayList();
  }
  
  private LinkedList getList() {
    return (LinkedList) list;
  }
  
  public static void main(String[] args) {
    ListClientExample Ice = new ListClientExample();
    List list = Ice.getList();
    System.out.println(list);
  }
}
