import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class JTestStutter {

	@Test
	void testStutter() {
		Integer[] data = { 72, -49, 30, 54, -302 };
		Stack<Integer> stack = new Stack<Integer>();
		for (int num : data) {
			stack.push(num);
		}





		int[] list1 = { 72, 72, -49, -49, 30, 30, 54, 54, -302, -302 };
		Stack<Integer> stackOutcome = new Stack<Integer>();
		for (int num : list1) {
			stackOutcome.push(num);
		}

		
		Assertions.assertEquals(stackOutcome, stutter.stutter(stack));
		

	}

}