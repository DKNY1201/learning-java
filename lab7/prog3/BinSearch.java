package lab7.prog3;

public class BinSearch {
  public boolean search(String s, char c) {
    int len = s.length();
    char ch = s.charAt(len / 2);

    if (len == 1 && ch != c) {
      return false;
    }

    if (ch == c) {
      return true;
    }
    if (ch > c) {
      return search(s.substring(0, len / 2), c);
    }
    return search(s.substring(len / 2), c);
  }

  public static void main(String[] args) {
    BinSearch bs = new BinSearch();
    String str = "abcdefghijklmnop";
    char c = 'z';
    System.out.println(bs.search(str, c));
  }
}
