package com.ncodeit.collection;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		System.out.println("Size at the beginning " + pq.size());
		pq.add(99);
		pq.add(18);
		pq.add(27);
		pq.add(34);
		System.out.println("New PriorityQueue" + pq);

		System.out.println("Size after addition " + pq.size());

		System.out.println("Top-most element " + pq.peek());

		System.out.println("Removing " + pq.poll());

		System.out.println("New PriorityQueue after removal" + pq);

		System.out.println("Size after removal " + pq.size());
	}

}
