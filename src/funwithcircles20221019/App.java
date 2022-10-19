package funwithcircles20221019;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rad, x, y;
		System.out.print("Enter x, y, and radius: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		rad = sc.nextDouble();
		Circle circ = new Circle(rad,x,y);
		circ.setRadius(2*circ.getRadius());
		double area = circ.findArea();
		double circum = circ.findCircumference();
		System.out.printf("Area = %.2f, Circ = %.2f.\n", area, circum);
		System.out.println("Here is a description of the circle: ");
		System.out.println(circ);
	}
}