package lab10.prog1_redo;

public class BST {
  private Node root;
  
  BST() {
    root = null;
  }
  
  void insert(Integer data) {
    if (root == null) {
      root = new Node(data);
    } else {
      Node temp = root;
      boolean isInserted = false;
      while (!isInserted) {
        if (data < temp.data) {
          if (temp.left == null) {
            temp.left = new Node(data);
            isInserted = true;
          } else {
            temp = temp.left;
          }
        } else if (data > temp.data) {
          if (temp.right == null) {
            temp.right = new Node(data);
            isInserted = true;
          } else {
            temp = temp.right;
          }
        }
      }
    }
  }
  
  void print() {
    if (root == null) {
      return;
    }
    
    printTree(root);
  }
  
  void printTree(Node n) {
    if (n != null) {
      printTree(n.left);
      System.out.println(n.data + " ");
      printTree(n.right);
    }
  }
  
  boolean search(Integer data) {
    if (data == null) {
      return false;
    }
    
    return searchTree(root, data);
  }
  
  boolean searchTree(Node n, Integer data) {
    if (n == null) {
      return false;
    }
    if (n.data == data) {
      return true;
    }
    
    return data > n.data ? searchTree(n.right, data) : searchTree(n.left, data);
  }
  
  class Node {
    private Integer data;
    private Node left;
    private Node right;
    
    Node(Integer data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
    
    Node(Integer data) {
      this(data, null, null);
    }
  }
  
  public static void main(String[] args) {
    BST bst = new BST();
    
    bst.insert(7);
    bst.insert(4);
    bst.insert(8);
    bst.insert(6);
    bst.insert(5);
    bst.insert(1);
    bst.insert(2);
    bst.insert(3);
    bst.insert(9);
    
    bst.print();
    System.out.println();
    System.out.println(bst.search(9));
    System.out.println(bst.search(14));
  }
}
