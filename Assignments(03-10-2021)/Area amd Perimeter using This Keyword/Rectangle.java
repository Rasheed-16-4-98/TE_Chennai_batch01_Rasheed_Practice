package com.te.assignments4;

public class Rectangle {

	double area;
	double peremeter;
	public void rectangleArea(double l,double b) {
		this.area=l*b;
		System.out.println(area);
	}
	public void rectanglePeremeter(double l,double b) {
		this.peremeter=(2*(l+b));
		System.out.println(peremeter);
}
}