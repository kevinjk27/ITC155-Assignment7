/*
 * 06/02/2020 
 * Accepts a queue of integers as a parameters and returns true if the numbers in the queue are the same in reverse order.
 */

import java.util.*;

public class isPalindrome {

	public static void main(String[] args) {
		Integer[] data1 = { 1, 2, 3, 6, 2, 1 };
		Queue<Integer> Q = new LinkedList<Integer>();
		for (int num : data1) {
			Q.add(num);
		}
		System.out.println(isPalindrome(Q));
	}

	public static boolean isPalindrome(Queue<Integer> Q) {
		Stack<Integer> S = new Stack<Integer>();
		Queue<Integer> Qduplicate = Q;
		

		
		
		while (!Q.isEmpty()) {
			S.push(Q.remove());
		}		
//		Stack<Integer> Sduplicate = S;
		
	
		
		while (!S.isEmpty()) {
			Q.add(S.pop());
		}


		System.out.println("Qduplicate = " +Qduplicate);
//		System.out.println("s = " +Sduplicate);
		System.out.println("q = " +Q);

		if (Q == Qduplicate) {
			return true;
		}

		return false;

	}
}
