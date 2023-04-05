package com.ncodeit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLambdaExpressionForFibonacci {

	public static void main(String args[]) {
		System.out.println(TestLambdaExpressionForFibonacci.generate(10));
	}

	public static List<Integer> generate(int series) {
		return Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] }) // lambda expression
				.limit(series).map(n -> n[0]).collect(Collectors.toList());
	}

}
