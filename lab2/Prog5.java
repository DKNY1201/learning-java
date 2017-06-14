package lab2;

public class Prog5 {
	public static void main(String[] args) {
		String s = "Hello";
		String reverseS = reverse(s);
		System.out.println(reverseS);
	}
	
	public static String reverse(String s) {
		char[] charArr = s.toCharArray();
		int len = charArr.length;
		char[] reverseChar = new char[len];
		
		for (int i = 0, j = len - 1; i < len; i++, j--) {
			reverseChar[j] = charArr[i];
		}
		
		return new String(reverseChar);
	}
}
