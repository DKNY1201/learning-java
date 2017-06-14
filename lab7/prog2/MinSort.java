package lab7.prog2;

import java.util.Arrays;

public class MinSort {

  public String sort(String s) {

    if (s.length() == 1) {
      return s;
    }

//    char[] arrChar = s.toCharArray();

    char smallestChar = findSmallestChar(s);
    int pos = s.indexOf(smallestChar);
    String newStr = s.substring(0, pos) + s.substring(pos + 1);
    System.out.println(newStr);
    // System.out.println(smallestChar);

    // System.out.println(pos);
//    arrChar[pos] = arrChar[0];
//    arrChar[0] = smallestChar;

    // System.out.println(new String(arrChar));

    return smallestChar + sort(newStr);
    // return smallestChar + "";
  }

  public Character findSmallestChar(String s) {
    if (s == null || s.length() == 0) {
      return null;
    }

    char firstLetter = s.charAt(0);

    if (s.length() == 1) {
      return firstLetter;
    }

    char ch = findSmallestChar(s.substring(1));

    return firstLetter > ch ? ch : firstLetter;
  }

  public static void main(String[] args) {
    MinSort ms = new MinSort();
    char c = ms.findSmallestChar("zwxuabfkafutbbbb");

    String result = ms.sort("zwxuabfkafutbbbb");
    System.out.println(result);
  }
}
