package funwithcircleclass;

public class Circle {
	private double radius;
	// default constructor
	public Circle() {
		radius = 0;
	}
	// non-default constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	// get function retrieves the value of the radius
	public double getRadius() {
		return radius;
	}
	// set function sets the value of the radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI * radius * radius;
	}
	public double findCircumference() {
		return 2 * Math.PI * radius;
	}
}
