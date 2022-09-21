package circleappv3;
import java.util.Scanner;
public class CircleApp {
	private double radius;  // individual value for each CircleApp
	// a constructor for the CircleApp
	public CircleApp() {
		radius = 0; // by default a circle will have radius 0
	}
	// another constructor for the CircleApp
	public CircleApp(double rad) {
		radius = rad;
	}
	public double calcCircleArea() {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}
	public double calcCircleCircumference() {
		double circ;
		circ = 2 * Math.PI * radius;
		return circ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double rad = sc.nextDouble();
		CircleApp ca = new CircleApp(rad);
		double area, circumference;
		area = ca.calcCircleArea();
		circumference = ca.calcCircleCircumference();
		System.out.printf("For a circle with radius %.2f, the area is %.4f and the circumference is %.4f.\n",
				rad,area,circumference);
		System.out.println("Have a nice life.");
	}
}
