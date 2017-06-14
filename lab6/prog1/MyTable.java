package lab6.prog1;

public class MyTable {
  private Entry[] entries;

  MyTable() {
    entries = new Entry[26];
  }

  // returns the String that is matched with char c in the table
  public String get(char c) {
    int index = convertFromCharToIndex(c);
    return entries[index].str;
  }

  // adds to the table a pair (c, s) so that s can be looked up using c
  public void add(char c, String s) {
    Entry entry = new Entry(s, c);
    int index = convertFromCharToIndex(c);
    this.entries[index] = entry;
  }

  // returns a String consisting of nicely formatted display
  // of the contents of the table
  public String toString() {
    StringBuilder sb = new StringBuilder();
    String lineSeperator = System.lineSeparator();
    for (Entry entry : entries) {
      if (entry != null) {
        sb.append(entry.toString());
        sb.append(lineSeperator);
      }
    }
    return sb.toString();
  }

  public int convertFromCharToIndex(char c) {
//    return (int) c - 97;
    return c - 'a';
  }

  private class Entry {
    String str;
    char ch;

    Entry(String str, char ch) {
      this.str = str;
      this.ch = ch;
    }

    // returns a String of the form "ch->str"
    public String toString() {
      return this.ch + "->" + this.str;
    }
  }

  public static void main(String[] args) {
    MyTable t = new MyTable();
    t.add('a', "Andrew");
    t.add('b', "Billy");
    t.add('w', "Willie");
    System.out.println(t);
    System.out.println(t.get('w'));
  }

}