package com.ncodeit.lambdas;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {

	public static void main(String[] args) {

		UnaryOperator<Integer> unary = x -> x * 2;
		Integer result = unary.apply(2);
		System.out.println(result);

	}

}
