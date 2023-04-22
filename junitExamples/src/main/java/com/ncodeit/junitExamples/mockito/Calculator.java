package com.ncodeit.junitExamples.mockito;

public class Calculator {
	
	private AddService addService;
	private SubtractService subtractService;
	
	public int add(int x, int y) {
		System.out.println("Add method called in calculator with x:"+x+" y:"+y);
		return addService.add(x, y);
	}

	public int subtract(int x, int y) {
		return subtractService.subtract(x, y);
	}
	
	public void printMessage() {
		System.out.println("done");
	}
}
