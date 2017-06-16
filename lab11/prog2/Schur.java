package lab11.prog2;

import java.util.*;

public class Schur {
  boolean checkForSum(List<Integer> list, Integer z) {
    HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
    
    for (Integer i: list) {
      if (hash.containsKey(z - i)) {
        return true;
      }
      
      hash.put(i, true);
    }
    
    return false;
  }
  
  public static void main(String[] args) {
    Schur s = new Schur();
    List<Integer> l = new ArrayList<Integer>();
    l.add(3);
    l.add(4);
    l.add(6);
    l.add(5);
    l.add(11);
    l.add(20);
    System.out.println(s.checkForSum(l, 10));
  }
}
