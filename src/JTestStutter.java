import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
		for (int num : data) {
			stackOutcome.push(num);
		}

		stutter dr = new stutter();
		assertEquals(stackOutcome, stutter.stutter(stack));
	}

}
