package lab6.prog4;

import java.util.*;

public class StringSort {
  Comparator<String> myComparator;
  
  StringSort(Comparator<String> myComparator) {
    this.myComparator = myComparator;
  }
  
  public String[] stringSort(String[] arr) {
    Arrays.sort(arr, myComparator);
    return arr;
  }
  
  static class LengthCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      // TODO Auto-generated method stub
      return o1.length() - o2.length();
    }
    
  }
}
