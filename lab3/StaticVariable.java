package lab3;

public class StaticVariable {
	private static int count;
	
	StaticVariable () {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new StaticVariable();
		}
		
		System.out.println(StaticVariable.count);
	}
}
