package lab2;

import static org.junit.Assert.*;

import junit.framework.TestCase;

public class TestProg6 extends TestCase {
	public void testRemoveDups() {
		String[] testData = { "horse", "dog", "cat", "horse", "dog" };
		String[] expectResult = { "horse", "dog", "cat" };
		String[] result = Prog6.removeDups(testData);
		
		assertArrayEquals(result, expectResult);
	}
}
