package lab9.prog3;

public class QueueByArray {
  private int[] arr = new int[10];
  private int front = -1;
  private int rear = -1;
  
  public void enqueue(int n) {
    arr[++rear] = n;
    
    if (front == -1) {
      front = 0;
    }
    
    if (isFull()) {
      resize();
    }
  }
  
  public int dequeue() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }
    
    int result = arr[front];
    front++;
    return result;
  }
  
  void resize() {
    System.out.println("resizing...");
    int[] newArr = new int[arr.length * 2];
    System.arraycopy(arr, front, newArr, 0, arr.length - front);
    arr = newArr;
  }
  
  int peek() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }
    return arr[front]; 
  }
  
  boolean isEmpty() {
    return front > rear || (front == -1 && rear == -1);
  }
  
  boolean isFull() {
    return rear >= arr.length - 1;
  }
  
  int size() {
    if (isEmpty()) {
      return 0;
    }
    
    return (rear - front) + 1;
  }
  
  void print() {
    for (int i = front; i < rear; i++) {
      System.out.println(arr[i]);
    }
  }
  
  public static void main(String[] args) {
    QueueByArray q = new QueueByArray();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);
    q.enqueue(7);
    q.enqueue(8);
    q.enqueue(9);
    q.enqueue(10);
    q.enqueue(11);
    q.enqueue(12);
    q.enqueue(13);
    q.enqueue(14);
    System.out.println(q.size());
    try {
      System.out.println(q.peek());
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(q.size());
  }
}
