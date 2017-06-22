package lab8.prog2_redo;

public class MyStringLinkedList {
  Node header;

  MyStringLinkedList() {
    header = new Node(null, null, null);
  }

  public void add(String item) {
    Node n = new Node(header.next, header, item);
    if (header.next != null) {
      header.next.previous = n;
    }
    header.next = n;
  }

  // inserts a new Node contain data so that its
  // position in the list is now pos
  void insert(String data, int pos) throws OutOfSizeException {
    if (pos > size()) {
      throw new OutOfSizeException("OutOfSizeException: Position need to insert can't greater than size");
    }
    Node next = header;
    Node prev = null;
    for (int i = 0; i <= pos; i++) {
      prev = next;
      next = next.next;
    }

    Node n = new Node(next, prev, data);
    prev.next = n;
    if (next != null) {
      next.previous = n;
    }
  }

  void insertWithWhileLoop(String data, int pos) throws OutOfSizeException {
    if (pos > size()) {
      throw new OutOfSizeException("OutOfSizeException: Position need to insert can't greater than size");
    }

    Node temp = header;

    int count = 0;
    while (temp != null) {
      if (pos == count++) {
        Node n = new Node(temp.next, temp, data);
        if (temp.next != null) {
          temp.next.previous = n;
        }
        temp.next = n;
        return;
      }
      temp = temp.next;
    }

  }

  // attempts to remove the first Node that contains
  // data; if successful, returns true; otherwise, false.
  boolean remove(String data) {
    Node temp = header.next;

    while (temp != null) {
      if (temp.value.equals(data)) {
        temp.previous.next = temp.next;
        if (temp.next != null) {
          temp.next.previous = temp.previous;
        }
        temp = null;
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  // remove with position
  boolean remove(int pos) {
    Node temp = header.next;

    int count = 0;
    while (temp != null) {
      if (pos == count++) {
        temp.previous.next = temp.next;
        if (temp.next != null) {
          temp.next.previous = temp.previous;
        }
        temp = null;
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  void minSort() {
    if (header == null) {
      return;
    }

    Node temp = header.next;

    while (temp != null) {
      swap(temp, minNode(temp));
      temp = temp.next;
    }
  }

  Node get(int pos) throws OutOfSizeException {
    if (pos > size()) {
      throw new OutOfSizeException("OutOfSizeException: Position need to insert can't greater than size");
    }

    int count = 0;
    Node temp = header.next;

    while (temp != null) {
      if (pos == count++) {
        return temp;
      }
      temp = temp.next;
    }

    return null;
  }

  void swap(Node n1, Node n2) {
    String temp = n1.value;
    n1.value = n2.value;
    n2.value = temp;
  }

  Node minNode(Node n) {
    if (n == null || n.value == null) {
      throw new IllegalArgumentException("Input for minNode method is wrong");
    }

    Node min = n;
    n = n.next;

    while (n != null) {
      if (n.value.compareTo(min.value) < 0) {
        min = n;
      }
      n = n.next;
    }

    return min;
  }

  boolean search(String val) {
    boolean b = false;
    try {
      b = recurse(0, size(), val);
    } catch (OutOfSizeException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return b;
  }

  boolean recurse(int a, int b, String val) throws OutOfSizeException {
    int mid = (a + b) / 2;
    Node m = get(mid);
    if (m.value.equals(val)) {
      return true;
    }

    if (a > b) {
      return false;
    }

    if (val.compareTo(m.value) > 0) {
      return recurse(mid + 1, b, val);
    }
    return recurse(a, mid - 1, val);
  }

  int size() {
    if (header.next == null) {
      return 0;
    }

    Node temp = header.next;
    int count = 0;

    while (temp != null) {
      count++;
      temp = temp.next;
    }

    return count;
  }

  void print() {
    Node temp = header.next;

    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  class Node {
    String value;
    Node next;
    Node previous;

    Node(Node next, Node previous, String value) {
      this.next = next;
      this.previous = previous;
      this.value = value;
    }
  }

  public static void main(String[] args) {
    MyStringLinkedList list = new MyStringLinkedList();
    list.add("A1");
    list.add("A2");
    list.add("A3");
    list.add("A4");
    try {
      list.insert("A5", 4);
      list.insertWithWhileLoop("A6", 4);
    } catch (OutOfSizeException e) {
      e.printStackTrace();
    }
    // list.remove("A2");
    // list.remove("A5");
    // list.remove("A4");
    // list.remove(2);
    // list.remove(0);
    list.minSort();
//    list.print();
    System.out.println(list.search("A22"));
    System.out.println(list.search("A6"));

  }
}
