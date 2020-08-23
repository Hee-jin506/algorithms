package com.heejin.data_structures;

public class SelectionSort {
  public static void swapElements(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    
  }
  
  public static int indexLowest(int[] array, int start) {
    int LowIndex = start;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < array[LowIndex]) {
        LowIndex = i;        
      }
    }
    return LowIndex;
  }
  
  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int j = indexLowest(array, i);
      swapElements(array, i, j);
      
    }
  }

}
