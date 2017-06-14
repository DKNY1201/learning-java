package lab3;

import java.util.Arrays;

public class MyStringList {
	private static final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	//adds s to the end of the underlying array
	public void add(String s){
		strArray[size] = s;
		size++;
		if (size >= strArray.length) {
			resize(strArray.length * 2);
		}
	}
	
	// retrieves the String at the i th position in the underlying array
	public String get(int i){
	  if (i < 0 || i > size) {
	    return null;
	  }
	  return strArray[i];
	}
	
	// returns true if String s is found in the array, false otherwise
	public boolean find(String s){
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(String s, int pos){
		int i = size;
		for (; i > pos; i--) {
			strArray[i] = strArray[i - 1];
		}
		strArray[i] = s;
		size++;
		if (size >= strArray.length) {
			resize(strArray.length * 2);
		}
	}
	
	// removes first occurrence of String s if it is found in the underlying array if found, returns true; 
	// if not found returns false
	public boolean remove1(String s){
		int newStart = -1;
		for (int i = 0; i < size - 1; i++) {
			if (strArray[i].equals(s) && newStart == -1) {
				newStart = i;
			}
			
			if (newStart != -1) {
				strArray[i] = strArray[i + 1];
			}
		}
		
		if (newStart != -1) {
			size--;
			return true;
		}
		return false;
	}
	
	public boolean remove(String s){
		int newStart = -1;
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s)) {
				newStart = i;
			}
		}
		
		if (newStart != -1) {
			for (int i = newStart; i < size; i++) {
				strArray[i] = strArray[i + 1];
			}
			size--;
//			if (size <= strArray.length / 4) {
//				resize(strArray.length / 4);
//			}
			
			return true;
		}
		return false;
	}
	
	
	private void resize(int newLen){
		System.out.println("Resizing...");
//		strArray = Arrays.copyOf(strArray, newLen);
		String[] newArrString = new String[newLen];
		System.arraycopy(strArray, 0, newArrString, 0, size);
		strArray = newArrString;
	}
	
	public String toString(){		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(strArray[i]);
			if (i < size - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
			
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		
		l.add("Quy");
		l.add("Bi");
		System.out.println(l);
		l.insert("Kim", 2);
		System.out.println(l);
		
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);
	}

}