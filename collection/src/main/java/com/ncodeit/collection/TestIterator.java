package com.ncodeit.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TestIterator {

	public static void main(String[] args) {

		// Enhanced For loop , also called for-each loop

		int[][] squares = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				squares[i][j] = (i + 1) * (j + 1);
			}
		}
		System.out.println("Printing elements of a 2D array using for-each loop");

		for (int[] rows : squares) {
			for (int column : rows) {
				System.out.print(column + " ");
			}
			System.out.println();
		}

		// Iterable Foreach loop

		System.out.println("Iterable Foreach loop");
		
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		
		gamesList.forEach(games -> System.out.println(games));

		// Using Iterator Interface

		System.out.println("Iterator Example using Stack");

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < 6; i++) {
			stack.push(i * i);
		}
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			int nextElement = iterator.next();
			System.out.print(nextElement + " ");
		}

	}

}
