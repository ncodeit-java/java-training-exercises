package com.ncodeit.basicExamples.polymorphism;

public class Rectangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Rectangle is drawn");
	}

	public void draw(int length,int width) {
		System.out.println("Rectangle is drawn with length and with");
	}
}
