package lab10.prog1_redo;

import java.util.Comparator;

public class EmployeeBST {
  private Node root;
  Comparator<Employee> comp;
  EmployeeBST(Comparator<Employee> comp) {
    root = null;
    this.comp = comp;
  }

  void insert(Employee emp) {
    if (root == null) {
      root = new Node(emp);
    } else {
      Node temp = root;
      boolean isInserted = false;
      while (!isInserted) {
        if (comp.compare(emp, temp.emp) < 0) {
          if (temp.left == null) {
            temp.left = new Node(emp);
            isInserted = true;
          } else {
            temp = temp.left;
          }
        } else if (comp.compare(emp, temp.emp) > 0) {
          if (temp.right == null) {
            temp.right = new Node(emp);
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
      System.out.println(n.emp + " ");
      printTree(n.right);
    }
  }

  boolean search(Employee emp) {
    if (emp == null) {
      return false;
    }

    return searchTree(root, emp);
  }

  boolean searchTree(Node n, Employee emp) {
    if (n == null) {
      return false;
    }
    if (n.emp.equals(emp)) {
      return true;
    }

    return comp.compare(emp, n.emp) > 0 ? searchTree(n.right, emp) : searchTree(n.left, emp);
  }

  class Node {
    private Employee emp;
    private Node left;
    private Node right;

    Node(Employee emp, Node left, Node right) {
      this.emp = emp;
      this.left = left;
      this.right = right;
    }

    Node(Employee emp) {
      this(emp, null, null);
    }
  }

//  public static void main(String[] args) {
//    EmployeeBST bst = new EmployeeBST();
//
//    bst.insert(7);
//    bst.insert(4);
//    bst.insert(8);
//    bst.insert(6);
//    bst.insert(5);
//    bst.insert(1);
//    bst.insert(2);
//    bst.insert(3);
//    bst.insert(9);
//
//    bst.print();
//    System.out.println();
//    System.out.println(bst.search(9));
//    System.out.println(bst.search(14));
//  }
}
