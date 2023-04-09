package com.ncodeit.collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();

		System.out.println("Size at the beginning " + s.size());

		s.push(99);
		s.push(28);
		s.push(17);
		s.push(74);
		s.push(1);

		System.out.println("New Stack" + s);

		System.out.println("Size after addition " + s.size());

		System.out.println("Popped element " + s.pop());

		System.out.println("New Stack after popping" + s);

		System.out.println("Size after removal " + s.size());

		System.out.println("Top-most element " + s.peek());

	}

}
