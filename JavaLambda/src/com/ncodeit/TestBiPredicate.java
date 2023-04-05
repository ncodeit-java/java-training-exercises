package com.ncodeit;

import java.util.function.BiPredicate;

public class TestBiPredicate {

	public static void main(String[] args) {
		BiPredicate<String, Integer> filter = (x, y) -> {
			return x.length() == y;
		};

		boolean result = filter.test("ncodeit", 7);
		System.out.println(result);

		boolean result2 = filter.test("java", 11);
		System.out.println(result2);
	}

}
