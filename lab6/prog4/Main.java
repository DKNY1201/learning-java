package lab6.prog4;

import java.util.Arrays;

import lab6.prog4.StringSort.LengthCompare;

public class Main {
  public static void main(String[] args) {
    String[] strArr = { "Quy", "Tran", "Van", "Long", "My", "Peter" };
//    StringSort stringSort = new StringSort(new StringSort.LengthCompare());
//    StringSort.LengthCompare lenCompare = new StringSort.LengthCompare();
    LengthCompare lenCompare = new LengthCompare();
    StringSort stringSort = new StringSort(lenCompare);
    
    
    strArr = stringSort.stringSort(strArr);
    System.out.println(Arrays.toString(strArr));
  }
}
