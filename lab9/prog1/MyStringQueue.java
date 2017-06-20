package lab9.prog1;

public class MyStringQueue {
  MyStringLinkedList list;
  
  MyStringQueue() {
    list = new MyStringLinkedList();
  }
  
  void enqueue(String data) {
    list.append(data);
  }
  
  String peek() {
    return list.getNodeByPos(0).value;
  }
  
  String dequeue() {
    String result = peek();
    list.remove(0);
    return result;
  }
  
  public static void main(String[] args) {
    MyStringQueue q = new MyStringQueue();
    q.enqueue("Bi");
    q.enqueue("Bi1");
    q.enqueue("Bi2");
    q.enqueue("Bi3");
    q.enqueue("Bi4");
    System.out.println(q.peek());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
  }
}
