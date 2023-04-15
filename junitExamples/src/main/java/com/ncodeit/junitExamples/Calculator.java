package com.ncodeit.junitExamples;

public class Calculator {
	
	public int add(int x, int y) {
		return x+y;
	}

	public int subtract(int x, int y) {
		return x-y;
	}
	
	public int multiply (int x, int y) {
		return x*y;
	}
	
	public double divide(int x, int y) {
		double result=0.0f;
		try {
			 result=x/y;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw e;
		}
		return result;
	}
}
