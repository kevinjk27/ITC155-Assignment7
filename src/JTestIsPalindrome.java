import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

class JTestIsPalindrome {

	@Test
	void test() {
		Integer[] data1 = { 1, 2, 9, 3, 2, 1 };
		Integer[] data2 = { 1, 5, 9, 9, 5, 1 };
		Queue<Integer> Q = new LinkedList<Integer>();
		Queue<Integer> Q1 = new LinkedList<Integer>();
		for (int num : data1) {
			Q.add(num);
		}
		for (int num : data2) {
			Q1.add(num);
		}
		
		
		isPalindrome dr = new isPalindrome();
		assertFalse(isPalindrome.isPalindrome(Q));
		assertTrue(isPalindrome.isPalindrome(Q1));
	}

}
