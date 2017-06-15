package lab9.prog1;

public class MyStringLinkedList {
  Node header;
  int size;

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
  
  public void append(String item) {
    if (header.next == null) {
      add(item);
      return;
    }
    
    Node temp = header.next;
    
    while (temp.next != null) {
      temp = temp.next;
    }
    
    Node n = new Node(temp.next, temp, item);
    temp.next = n;
  }

  // inserts a new Node contain data so that its
  // position in the list is now pos
  void insert(String data, int pos) {
    if (pos == 0) {
      add(data);
    }

    Node temp = header.next;
    int count = 0;
    while (temp != null) {
      if (pos == ++count) {
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

  void print() {
    Node temp = header.next;

    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
    System.out.println("");
  }

  // attempts to remove the first Node that contains
  // data; if successful, returns true; otherwise, false.
  boolean remove(String data) {
    if (header.next == null || data == null || data == "") {
      return false;
    }
    
    Node temp = header.next;
    while (temp != null) {
      if (temp.value.equals(data)) {
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
        temp.next = null;
        temp.previous = null;
        return true;
      }
      temp = temp.next;
    }
    return false;
  }
	
  public Node findMinNode() {
    if (header.next == null) {
      return null;
    }
    Node temp = header.next;
    Node min = temp;
    
    while (temp != null) {
      if (min.value.compareTo(temp.value) > 0) {
        min = temp;
      }
      temp = temp.next;
    }
    
    return min;
  }
  
  public void sort() {
    if (header.next == null) {
      return;
    }
    
    Node temp = header.next;
    Node min;
    
    while (temp != null) {
      min = findMinNodeFromSpecificNode(temp);
      swap(temp, min);
      temp = temp.next;
    }
  }
  
  public boolean search(String s) {
    return searchRecursion(s, 0 , getSize());
  }
  
  public boolean searchRecursion(String s, int l, int r) {
    int m = (l + r) / 2;
    
    Node mid = getNodeByPos(m);
    
    if (mid.value.equals(s)) {
      return true;
    }
    
    if (l > r) {
      return false;
    }
    
    if (mid.value.compareTo(s) > 0) {
      return searchRecursion(s, l, m - 1);
    }
    
    return searchRecursion(s, m + 1, r);
  }
  
  public Node getNodeByPos(int pos) {
    Node temp = header.next;
    int count = 0;
    while (temp != null) {
      if (pos == count++) {
        return temp;
      }
      temp = temp.next;
    }
    return null;
  }
  
  int getSize() {
    if (header.next == null) {
      return 0;
    }
    
    int size = 0;
    Node temp = header.next;
    
    while (temp != null) {
      size++;
      temp = temp.next;
    }
    
    return size;
  }
  
  public Node findMinNodeFromSpecificNode(Node n) {
    if (n == null) {
      return null;
    }
    
    Node min = n;
    
    while (n != null) {
      if (min.value.compareTo(n.value) > 0) {
        min = n;
      }
      n = n.next;
    }
    
    return min;
  }
  
  void swap(Node n1, Node n2) {
    String temp = n1.value;
    n1.value = n2.value;
    n2.value = temp;
  }
  
	
	class Node {
		String value;
		Node next;
		Node previous;
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
	}

  public static void main(String[] args) {
    MyStringLinkedList list = new MyStringLinkedList();
//    list.add("Quy");
//    list.add("Tran");
//    list.add("Van");
//    list.insert("Long", 0);
//    list.insert("My", 2);
//    list.remove("My");
//    list.remove("Van");
//    list.print();
    
//    Node min = list.findMinNode();
//    System.out.println(min.value);
    
//    "big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian", 
//    "numberless", "none", "vast", "miniscule"
    list.append("big");
    list.append("small");
    list.append("tall");
    list.append("short");
    list.append("round");
    list.append("square");
    list.append("enormous");
    list.append("tiny");
    list.append("gargantuan");
    list.append("lilliputian");
    list.append("numberless");
    list.append("none");
    list.append("vast");
    list.append("miniscule");
    System.out.println("Before sorting: ");
    list.print();
    list.sort();
    System.out.println("");
    System.out.println("After sorting: ");
    list.print();
    System.out.println("");
    System.out.println("Search: ");
    System.out.println("keyword = \"tiny\": " + list.search("tiny"));
    System.out.println("keyword = \"number\": " + list.search("number"));
  }
}
