package lab9.prog1;

public class MyStringStack {
  MyStringLinkedList list;
  MyStringStack() {
    list = new MyStringLinkedList();
  }
  
  public void push(String s) {
    list.add(s);
  }
  
  public String peek() {
    return list.getNodeByPos(0).value;
  }
  
  public String pop() {
    String data = list.getNodeByPos(0).value;
    list.remove(data);
    return data;
  }

  public static void main(String[] args) {
    MyStringStack stack = new MyStringStack();
    stack.push("Bob");
    stack.push("Harry");
    stack.push("Alice");
    System.out.println("Popping..." + stack.pop());
    System.out.println("Peeking...." + stack.peek());
    System.out.println("Popping..." + stack.pop());
  }
}
