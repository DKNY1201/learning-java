package lab2;

import junit.framework.TestCase;

public class Prog2_8Test extends TestCase {
	public void testMin() {
		int[] intArr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		assertEquals(-22, Prog2_8.min(intArr));
	}
}
