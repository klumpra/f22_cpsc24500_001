package funwithshapesoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(7,9,3));
		shapes.add(new Rectangle(10,5,8,7));
		shapes.add(new Rectangle(8,6,6,5));
		shapes.add(new Circle(2,0,6));
		Collections.sort(shapes);
		ShapeWriter.writeToScreen(shapes);
		String fname;
		System.out.println("Enter filename: ");
		fname = sc.nextLine();
		if (ShapeWriter.writeToFile(shapes, fname)) {
			System.out.println("Successfully wrote to file.");
		} else {
			System.out.println("An error occurred.");
		}
	}
}
