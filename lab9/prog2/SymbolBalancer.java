package lab9.prog2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class SymbolBalancer {
  String text;

  SymbolBalancer(String filename) {
    readFile(filename);
  }

  void readFile(String filename) {
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String currentLine;
      StringBuilder builder = new StringBuilder();
      while ((currentLine = br.readLine()) != null) {
        builder.append(currentLine);
      }
      text = builder.toString();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  boolean symbolsBalanced(String delimiters) {
    if (delimiters == null || delimiters == "" || delimiters.length() % 2 != 0) {
      return false;
    }
    
    Stack<Character> stack = new Stack<>();
    
    int len = delimiters.length();
    char[] open = new char[len/2];
    char[] close = new char[len/2];
    
//    int countOpen = 0;
//    int countClose = 0;
    for (int i = 0; i < len; i++) {
      if (i % 2 == 0) {
        open[i/2] = delimiters.charAt(i);
      } else {
        close[i/2] = delimiters.charAt(i);
      }
    }
    
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (isIn(c, open) > -1) {
        stack.push(c);
      }
      
      if (isIn(c, close) > -1) {
        if (stack.isEmpty()) {
          return false;
        }
        int pos = isIn(c, close);
        char openChar = open[pos];
        
        char openCharStored = stack.peek();
        if (openChar == openCharStored) {
          stack.pop();
        }
      }
    }
    
    if (stack.isEmpty()) {
      return true;
    }
    
    return false;
  }
  
  int isIn(char c, char[] arr) {
    int pos = -1;
    
    for (int i = 0; i < arr.length; i++) {
      if (c == arr[i]) {
        pos = i;
      }
    }
  
    return pos;
  }
  
  public static void main(String[] args) {
    SymbolBalancer sb = new SymbolBalancer("Employee.java");
    System.out.println(sb.symbolsBalanced("[]{}<>()||"));
  }

}
