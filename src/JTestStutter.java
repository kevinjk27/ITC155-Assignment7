import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Stack;

class JTestStutter {

	@Test
	void testStutter() {
		int[] data = { 72, -4, 13, 9 };
		Stack<Integer> stack = new Stack<Integer>();
		for (int num : data) {
			stack.push(num);
		}

		int[] list1 = { 72, 72, -4, -4, 13, 13, 9, 9 };
		Stack<Integer> stackOutcome = new Stack<Integer>();
		for (int num : list1) {
			stackOutcome.push(num);
		}

		assertEquals(stackOutcome, stutter.stutter(stack));

	}

}