package lab10.prog1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeBST {
  /** The tree root. */
  private Node root;
  NameComparator nameComparator;

  //start with an empty tree
  public EmployeeBST(NameComparator nameComparator) {
    root = null;
    this.nameComparator = nameComparator;
  }

  /**
   * Prints the values in the nodes of the tree in sorted order.
   */
  public void printTree() {
    if (root == null)
      System.out.println("Empty tree");
    else
      printTree(root);
  }

  private void printTree(Node t) {
    if (t != null) {
      printTree(t.left);
      System.out.println(t.element);
      printTree(t.right);
    }
  }
  
  public void printAsDiagram() {
    BTreePrinter.printNode(root);
  }
  
  public boolean find(Employee e) {
    if(e == null) return false;
    return find(e,root);
  }
  private boolean find(Employee e, Node n){
    if(n == null) return false;
    if(n != null && nameComparator.compare(e, n.element) == 0) return true;
    return (nameComparator.compare(e, n.element) < 0) ?
        find(e,n.left) :
        find(e,n.right);
  }

  public void insert(Employee e) {
    if (root == null) {
      root = new Node(e, null, null);
    }
    else {
      Node temp = root;
      boolean inserted = false;
      while(!inserted){
        if(nameComparator.compare(e, temp.element) < 0) {
          //space found on the left
          if(temp.left == null){
            temp.left = new Node(e,null,null);
            inserted = true;
          }
          else {
            temp = temp.left;
          }
        }
        
        else if(nameComparator.compare(e, temp.element) >= 0){ 
          //space found on the right          
          if(temp.right==null){
            temp.right = new Node(e,null,null);
            inserted = true;
          }
          else {
            temp = temp.right;
          }
        }
        
      }

    }
  }
  public static void main(String[] args){
    EmployeeBST empBST = new EmployeeBST(new NameComparator());
    Employee emp1 = new Employee("Quy",120000,2017,12,21);
    Employee emp2 = new Employee("Andy",120000,2017,12,21);
    Employee emp3 = new Employee("Long",120000,2017,12,21);
    Employee emp4 = new Employee("Jacky",120000,2017,12,21);
    Employee emp5 = new Employee("Zooke",120000,2017,12,21);
    Employee emp11 = new Employee("Zookea",120000,2017,12,21);
    empBST.insert(emp1);
    empBST.insert(emp2);
    empBST.insert(emp3);
    empBST.insert(emp4);
    empBST.insert(emp5);
    empBST.printTree();
    System.out.println("Is " + emp1.getName() + "in the tree? " + empBST.find(emp1));
    System.out.println("Is " + emp11.getName() + "in the tree? " + empBST.find(emp11));
    
  }

  private class Node {

    // Constructors
    Node(Employee theElement) {
      this(theElement, null, null);
    }

    Node(Employee element, Node left, Node right) {
      this.element = element;
      this.left = left;
      this.right = right;
    }
    private Employee element; // The data in the node
    private Node left; // Left child
    private Node right; // Right child
  }
  
  static class BTreePrinter {

      public static void printNode(Node root) {
          int maxLevel = BTreePrinter.maxLevel(root);
  
          printNodeInternal(Collections.singletonList(root), 1, maxLevel);
      }
  
      private static void printNodeInternal(List nodes, int level, int maxLevel) {
          if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
              return;
  
          int floor = maxLevel - level;
          int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
          int firstSpaces = (int) Math.pow(2, (floor)) - 1;
          int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;
  
          BTreePrinter.printWhitespaces(firstSpaces);
  
          List newNodes = new ArrayList();
          for (Object node : nodes) {
              if (node != null) {
                  System.out.print(((Node)node).element);
                  newNodes.add(((Node)node).left);
                  newNodes.add(((Node)node).right);
              } else {
                  newNodes.add(null);
                  newNodes.add(null);
                  System.out.print(" ");
              }
  
              BTreePrinter.printWhitespaces(betweenSpaces);
          }
          System.out.println("");
  
          for (int i = 1; i <= endgeLines; i++) {
              for (int j = 0; j < nodes.size(); j++) {
                  BTreePrinter.printWhitespaces(firstSpaces - i);
                  if (nodes.get(j) == null) {
                      BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                      continue;
                  }
  
                  if (((Node)nodes.get(j)).left != null)
                      System.out.print("/");
                  else
                      BTreePrinter.printWhitespaces(1);
  
                  BTreePrinter.printWhitespaces(i + i - 1);
  
                  if (((Node)nodes.get(j)).right != null)
                      System.out.print("\\");
                  else
                      BTreePrinter.printWhitespaces(1);
  
                  BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
              }
  
              System.out.println("");
          }
  
          printNodeInternal(newNodes, level + 1, maxLevel);
      }
  
      static void printWhitespaces(int count) {
          for (int i = 0; i < count; i++)
              System.out.print(" ");
      }
  
      static int maxLevel(Node node) {
          if (node == null)
              return 0;
  
          return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
      }
  
      static boolean isAllElementsNull(List list) {
          for (Object object : list) {
              if (object != null)
                  return false;
          }
  
          return true;
      }
  }
}
