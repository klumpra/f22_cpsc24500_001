package funwithcircles20221019;

public class Circle {
	private double radius;
	private double x;  // x coordinate of the center
	private double y;  // y coordinate of the center
	// default constructor - initializes a circle with radius 1 and at origin
	public Circle() {
		radius = 1;
		x = 0;
		y = 0;
	}
	// non-default constructor
	public Circle(double radius, double x, double y) {
		setRadius(radius);
		setX(x);
		setY(y);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double findArea() {
		return Math.PI * radius * radius;
	}
	public double findCircumference() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return String.format("circle %.2f %.2f %.2f",x,y,radius);
	}
}
