package com.ncodeit.lambdas.functional;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		int a = 5;
		Square s = (int x) -> x * x; // lambda expression to define the calculate method
		int ans = s.calculate(a);
		System.out.println(ans);
	}

}
