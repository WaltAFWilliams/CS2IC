package com.Interface;

/*
 * Add another shape eclipse:
 * 		Perimeter = 2*pi*Sqrt((r1^2 + r2^2)/2 )
 * 		Area = pi * r1 * r2
 * r1 - minor axis
 * r2 - major axis
 */

public class TestShape {

	public static void main(String[] args) {
		Circle circ = new Circle(12.0);
		Rectangle rect = new Rectangle(4, 7);
		Triangle tri = new Triangle(5, 12, 13);
		Eclipse eclipse = new Eclipse(2, 4);
		printInfo(circ);
		printInfo(tri);
		printInfo(rect);
		printInfo(eclipse);
		
		System.out.println("... using enhanced for loop ");
		Shape[] s = {circ, rect, tri, eclipse};
		for (Shape t: s) {
			printInfo (t);
		}
	}
	
	public static void printInfo(Shape s) {
	    System.out.println("The shape: " + s);
	    System.out.println("area : " + s.area());
	    System.out.println("perim: " + s.perimeter());
	}


}
