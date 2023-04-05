package com.ncodeit;

import java.util.function.BinaryOperator;

public class TestBinarOperator {

	public static void main(String[] args) {
		BinaryOperator<Integer> binary = (x1, x2) -> x1 + x2;
		Integer result = binary.apply(2, 3);
		System.out.println(result);
	}

}
