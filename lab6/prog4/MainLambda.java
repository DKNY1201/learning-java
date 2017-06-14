package lab6.prog4;

import java.util.Arrays;
import java.util.Comparator;

public class MainLambda {
  public static void main(String[] args) {
    String[] testString = {"Fairfield", "Maharashi", "University", "Unite State", "Texas", "California", "Vietnam"};
    StringSort stringSort = new StringSort((o1, o2) -> {
        return o2.length() - o1.length();
    });
    
    stringSort.stringSort(testString);
    System.out.println(Arrays.toString(testString));
  }
}
