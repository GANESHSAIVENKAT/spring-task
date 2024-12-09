package com.xworkz.javatest.runner;

import com.xworkz.javatest.test.Circle;
import com.xworkz.javatest.test.Rectangle;
import com.xworkz.javatest.test.Shape;

public class AreaRunner {

	public static void main(String[] args) {
		Shape c = new Circle(3.0);
		Shape r = new Rectangle(3.0, 4.0);
		System.out.println("Area of circle"+c.calculateArea());
		System.out.println("Area of rectangle"+r.calculateArea());
		

	}

}
