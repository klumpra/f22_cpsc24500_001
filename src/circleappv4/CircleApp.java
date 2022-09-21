package circleappv4;

import java.util.Scanner;

class Circle {
	private double radius;
	public Circle() {
		radius = 0;
	}
	public Circle(double rad) {
		radius = rad;
	}
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	public double calcCircumference() {
		return 2 * Math.PI * radius;
	}
}
public class CircleApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double rad = sc.nextDouble();
		Circle c = new Circle(rad);
		double area, circumference;
		area = c.calcArea();
		circumference = c.calcCircumference();
		System.out.printf("For a circle with radius %.2f, the area is %.4f and the circumference is %.4f.\n",
				rad,area,circumference);
		System.out.println("Have a nice life.");
	}
}
