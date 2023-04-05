package com.ncodeit.basicExamples.polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {

		//Dynamic Binding also overiding
		Shape shape=new Shape();
		shape.draw();
		
		shape=new Rectangle();
		shape.draw();
		
		//Static Binding also Overloading
		Rectangle rectShape=new Rectangle();
		rectShape.draw(1, 2);
	}

}
