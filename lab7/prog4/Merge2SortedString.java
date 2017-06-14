package lab7.prog4;

public class Merge2SortedString {
  StringBuilder sb = new StringBuilder();
  public String merge2SortedString(String s1, String s2) {
    if (s1 == null || s1.isEmpty()) {
      sb.append(s2);
      return sb.toString();
    }
    
    if (s2 == null || s2.isEmpty()) {
      sb.append(s1);
      return sb.toString();
    }
    
    char c1 = s1.charAt(0);
    char c2 = s2.charAt(0);
    
    if (c1 <= c2) {
      sb.append(c1);
      merge2SortedString(s1.substring(1), s2);
    } else {
      sb.append(c2);
      merge2SortedString(s1, s2.substring(1));
    }
    
    return sb.toString();
  }
  
  
  public static void main(String[] args) {
    Merge2SortedString mergedStr = new Merge2SortedString();
    
    System.out.println(mergedStr.merge2SortedString("dgabcd", "bcfk"));
  }
}
