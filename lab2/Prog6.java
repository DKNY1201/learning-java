package lab2;

import java.util.Arrays;

public class Prog6 {
	public static void main(String[] args) {
		String[] arr = {"horse", "dog", "cat", "horse","dog"};
//		String[] arr1 = {"horse", "dog", "cat", "horse","dog"};
		printArr(removeDups(arr));
//		printArr(removeDups1(arr1));
	}
	
	public static String[] removeDups(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = null;
				}
			}
		}
		
		int len = 0;
		for (int i = 0; i < a.length; i++) {
			if ( a[i] != null) {
				len++;
			}
		}
		
		String[] distintArr = new String[len];
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if ( a[i] != null) {
				distintArr[temp] = a[i];
				temp++;
			}
		}
		
		return distintArr;
	}
	
	public static String[] removeDups1(String[] a) {
		Arrays.sort(a);
		int len = a.length;
		int newLen = 1;
		for (int i = 0; i < a.length; i++) {
			if (i <= len - 2 && a[i] != a[i + 1]) {
				newLen++;
			}
		}
				
		String[] distintArr = new String[newLen];
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (i <= len - 2 && a[i] != a[i + 1]) {
				distintArr[temp++] = a[i];
			}
			
			if (i == len - 2) {
				distintArr[temp] = a[i];
			}
		}
		
		return distintArr;
	}
	
	public static void printArr(String[] strArr) {
		for (String s: strArr) {
			System.out.println(s);
		}
	}
}
