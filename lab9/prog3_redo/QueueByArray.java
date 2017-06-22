package lab9.prog3_redo;

public class QueueByArray {
  private int[] arr;
  private int front;
  private int rear;

  QueueByArray() {
    arr = new int[2];
    front = -1;
    rear = -1;
  }
  
  boolean isEmpty() {
    return front == -1 || front > rear;
  }
  
  int size() {
    return rear - front + 1;
  }
  
  void enqueue(int n) {
    if (front == -1) {
      front++;
    }
    
    if (rear >= arr.length - 1) {
      resize();
    }
    
    arr[++rear] = n;
  }
  
  int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return 0;
    }
    return arr[front++];
  }
  
  int peek() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return 0;
    }
    return arr[front];
  }
  
  void resize() {
    System.out.println("resizing..." + rear);
    
    int[] newArr = new int[arr.length * 2];
    System.arraycopy(arr, front, newArr, 0, size());
    arr = newArr;
  }
  
  void print() {
    for (int i = front; i <= rear; i++) {
      System.out.println(arr[i] + " ");
    }
  }
  
  public static void main(String[] args) {
    QueueByArray q = new QueueByArray();
    
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    
    q.print();
    
    
    System.out.println(q.dequeue());
    System.out.println(q.peek());
  }
}
