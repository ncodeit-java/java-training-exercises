package com.ncodeit.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.addFirst(1);
		deque.addLast(2);
		System.out.println(deque);
		
		int first = deque.removeFirst();
		int last = deque.removeLast();
		System.out.println("First : " + first + " Last : "+last);
		System.out.println(deque);
		
	}

}
