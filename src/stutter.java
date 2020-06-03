/*
 * 06/02/2020 
 * Replaces every value in the stack with two occurrences of that value and preserve the original relative order
 */

import java.util.*;

public class stutter {

	public static void main(String[] args) {
		Integer[] data = { 72,-49,30,54,-302 };
		Stack<Integer> stack = new Stack<Integer>();
		for (int num : data) {
			stack.push(num);
		}
		
		stutter(stack);
	}

	public static Stack<Integer> stutter(Stack<Integer> S) {
		Queue<Integer> Q = new LinkedList<Integer>();

		//turns it into a Queue (in reversed)
		while (!S.isEmpty()) {
			int n = S.pop();
			Q.add(n);
			Q.add(n);
		}

		
		//turns it into a Stack (in reversed)
		while (!Q.isEmpty()) {
			S.push(Q.remove());
		}

		
		//turns it into a Queue (in ordered)
		while (!S.isEmpty()) {
			Q.add(S.pop());
		}

		System.out.println(Q);
		return null;
		
	}

}
