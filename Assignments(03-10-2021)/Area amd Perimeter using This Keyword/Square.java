package com.te.assignments4;

public class Square {

	double area;
	double peremeter;

	public void squareArea(double side) {
		this.area = side * side;
		System.out.println(area);
	}

	public void squarePeremeter(double side) {
		this.peremeter = 4*side;
		System.out.println(peremeter);

	}
}