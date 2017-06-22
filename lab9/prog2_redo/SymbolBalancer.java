package lab9.prog2_redo;

import java.io.*;
import java.util.*;

public class SymbolBalancer {
  String text;
  String filename;
  SymbolBalancer(String filename) {
    this.filename = filename;
    readFile();
  }

  boolean symbolsBalanced(String delimiters) {
    Stack<Character> stack = new Stack<Character>();
    
    int len = delimiters.length();
    char[] opens = new char[len / 2];
    char[] closes = new char[len / 2];
    
    for (int i = 0; i< len; i++) {
      if (i % 2 == 0) {
        opens[i / 2] = delimiters.charAt(i);
      } else {
        closes[i / 2] = delimiters.charAt(i);
      }
    }

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (isInArray(ch, opens)) {
        stack.push(ch);
      }
      
      if (isInArray(ch, closes)) {
        if (stack.isEmpty()) {
          System.out.println("stack is empty");
          return false;
        }
        int index = getIndexOfElinArr(ch, closes);
        if (stack.pop() != opens[index]) {
          System.out.println("current character and stored character don't match each other");
          return false;
        }
      }
    }
    
    if (stack.isEmpty()) {
      return true;
    }
    
    return false;
  }
  
  boolean isInArray(char c, char[] cArr) {
    for (char ch: cArr) {
      if (c == ch) {
        return true;
      }
    }
    return false;
  }
  
  int getIndexOfElinArr(char c, char[] cArr) {
    int index = -1;
    for (int i = 0; i < cArr.length; i++) {
      if (c == cArr[i]) {
        index = i;
      }
    }
    return index;
  }

  void readFile() {
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
  
  public static void main(String[] args) {
    SymbolBalancer sym = new SymbolBalancer("Employee.java");
    System.out.println(sym.symbolsBalanced("[]{}<>()||"));
  }
}
