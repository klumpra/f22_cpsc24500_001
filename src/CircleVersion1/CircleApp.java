package CircleVersion1;
import java.util.Scanner;
public class CircleApp {
	public static double calcCircleArea(double radius) {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}
	public static double calcCircleCircumference(double radius) {
		double circ;
		circ = 2 * Math.PI * radius;
		return circ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		double area, circumference;
		area = calcCircleArea(radius);
		circumference = calcCircleCircumference(radius);
		System.out.printf("For a circle with radius %.2f, the area is %.4f and the circumference is %.4f.\n",
				radius,area,circumference);
		System.out.println("Have a nice life.");
	}
}
