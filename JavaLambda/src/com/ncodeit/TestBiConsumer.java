package com.ncodeit;

import java.util.function.BiConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
		addTwo.accept(1, 2);
	}

}
