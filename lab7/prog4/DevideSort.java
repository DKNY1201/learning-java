package lab7.prog4;

public class DevideSort {
  
  static StringBuilder sb = new StringBuilder();
  static public String merge2SortedString(String s1, String s2) {
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
  
  public String divideSort(String s) {
    Merge2SortedString m = new Merge2SortedString();
    int len = s.length();
    if (len == 0 || len == 1) {
      return s;
    }
    
    int mid = len / 2;
    
    String s1 = divideSort(s.substring(0, mid));
    String s2 = divideSort(s.substring(mid, len));
    
    return m.merge2SortedString(s1, s2);
  }
  
  public String dividedSort(String s) {
    Merge2SortedString m = new Merge2SortedString();
    int len = s.length();
    if (len <= 1)
      return s;
    int mid = len / 2;
    String sleft = s.substring(0, mid);
    System.out.println("this is left:" + sleft);
    String sright = s.substring(mid, len);
    System.out.println("this is rihgt:" + sright);
    String result = m.merge2SortedString(dividedSort(sleft), dividedSort(sright));
    System.out.println(result);
    return result;
  }
  
  public static void main(String[] args) {
    DevideSort ds = new DevideSort();
    System.out.println(ds.divideSort("quytranvan"));
  }
}
