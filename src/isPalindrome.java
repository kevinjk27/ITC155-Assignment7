/*
 * 06/02/2020 
 * Accepts a queue of integers as a parameters and returns true if the numbers in the queue are the same in reverse order.
 */

import java.util.*;

public class isPalindrome {

	public static void main(String[] args) {
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
		
		
		System.out.println(Q +" is palindrome: " +isPalindrome(Q));
		System.out.println(Q1 +" is palindrome: " +isPalindrome(Q1));
	}

	public static boolean isPalindrome(Queue<Integer> Q) {
		Stack<Integer> S = new Stack<Integer>();
		int length = Q.size();

		for (int i = 0; i < length; i++) {
			int n = Q.remove();
			Q.add(n); // both Queue and Stack has the same output as the input
			S.push(n); // both Queue and Stack has the same output as the input
		}

		// Q.remove() takes the first element
		// S.pop() takes the last element
		for (int i = 0; i < length; i++) {
			int element = Q.remove();
			if (S.pop() != element) { // when the elements are different it returns false
				return false;
			}
			Q.add(element); // by placing the n back to the end of the queue it ensures the iteration run for i < length
		}
		return true;
	}
}
