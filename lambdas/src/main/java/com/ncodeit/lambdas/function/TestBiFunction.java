package com.ncodeit.lambdas.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestBiFunction {

	public static void main(String[] args) {

		// takes two Integers and return an Integer
		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
		Integer result = func.apply(2, 3);
		System.out.println(result);

		// take two Integers and return an Double
		BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
		Double result2 = func2.apply(2, 4);
		System.out.println(result2);

		// take two Integers and return a List<Integer>
		BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
		List<Integer> result3 = func3.apply(2, 3);
		System.out.println(result3);

	}

}
