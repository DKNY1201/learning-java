package lab2;

public class Prog2 {
	public static void main(String[] args) {
		int x = RandomNumbers.getRandomInt(1, 9);
		int y = RandomNumbers.getRandomInt(3, 14);
		double xx = Math.pow(Math.PI, x);
		double yy = Math.pow(y, Math.PI);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(xx);
		System.out.println(yy);
	}
}
