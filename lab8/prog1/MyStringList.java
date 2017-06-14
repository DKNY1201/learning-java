package lab8.prog1;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	public void sort(){
	  if (size <= 1 || strArray.length == 0) {
	    return;
	  }
	  	  
	  for (int i = 0; i < size; i++) {
	    int minPos = findMinPosition(i, size - 1);
	    swap(i, minPos);
	  }
	}
	
	public int findMinPosition(int left, int right) {
	  String min = strArray[left];
	  int index = left;
	  
	  for (int i = left + 1; i <= right; i++) {
	    if (strArray[i].compareTo(min) < 0) {
	      min = strArray[i];
	      index = i;
	    }
	  }
	  
	  return index;
	  
	}
	
	public void swap(int i, int j) {
	  String temp = strArray[i];
	  strArray[i] = strArray[j];
	  strArray[j] = temp;
	}
	
	public boolean search(String val) {
	  return searchRecusion(0, size - 1, val);
	}
	
	public boolean searchRecusion(int l, int r, String val) {
	  int mid = (l + r) / 2;
	  if (strArray[mid].equals(val)) {
	    return true;
	  }
	  
	  if (l > r) {
	    return false;
	  }
	  
	  if (strArray[mid].compareTo(val) < 0) {
	    return searchRecusion(mid + 1, r, val);
	  }
	  return searchRecusion(l, mid - 1, val);
	  
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	
	
	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("big");
		l.add("small");
		l.add("tall");
		l.add("short");
		l.add("round");
		l.add("square");
    l.add("enormous");
    l.add("tiny");
    l.add("gargantuan");
    l.add("lilliputian");
    l.add("numberless");
    l.add("none");
    l.add("vast");
    l.add("miniscule");
    System.out.println("Before sorting: " + l);
    l.sort();
    System.out.println("After sorting: " + l);
    System.out.println(l.search("number"));
    System.out.println(l.search("tiny"));
	}

}
