package lab9.prog1_redo;

public class MyStringStack {
  MyStringLinkedList list;

  MyStringStack() {
    list = new MyStringLinkedList();
  }
  
  void push(String data) {
    list.add(data);
  }
  
  String peek() {
    String result = "";
    
    try {
      result = list.get(0).value;
    } catch (OutOfSizeException e) {
      e.printStackTrace();
    }
    
    return result;
  }
  
  String pop() {
    String result = peek();
    list.remove(0);
    return result;
  }

  public static void main(String[] args) {
    MyStringStack stack = new MyStringStack();
    stack.push("Bob");
    stack.push("Harry");
    stack.push("Alice");
    System.out.println("Popping..." + stack.pop());
    System.out.println("Peeking...." + stack.peek());
    System.out.println("Popping..." + stack.pop());
    System.out.println("Peeking...." + stack.peek());
  }
}
