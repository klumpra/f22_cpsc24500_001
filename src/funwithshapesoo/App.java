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
		/*
		System.out.print("Enter filename: ");
		fname = sc.nextLine();
		if (ShapeWriter.writeToTextFile(shapes, fname)) {
			System.out.println("Successfully wrote to file.");
		} else {
			System.out.println("An error occurred.");
		}
		System.out.println("Now going to clear the list of shapes...");
		shapes.clear();
		System.out.println("This is what's in the list now: ");
		ShapeWriter.writeToScreen(shapes);
		System.out.println("Now going to read the shapes back in: ");
		System.out.print("Enter filename: ");
		fname = sc.nextLine();
		ArrayList<Shape> readShapes = ShapeReader.readFromTextFile(fname);
		if (readShapes != null) {
			System.out.println("Here are the shapes that were read: ");
			ShapeWriter.writeToScreen(readShapes);
		} else {
			System.out.println("There was an error reading from the file.");
		}
		*/
		/*
		System.out.println("Now write to a binary file...");
		System.out.print("Ener name of binary file: ");
		fname = sc.nextLine();
		ArrayList<Shape> readFromBinary;
		if (ShapeWriter.writeToBinaryFile(shapes, fname)) {
			System.out.println("They were written to the binary file.");
			System.out.println("Read them back in ...");
			readFromBinary = ShapeReader.readFromBinaryFile(fname);
			ShapeWriter.writeToScreen(readFromBinary);
		} else {
			System.out.println("Could not to write to binary file.");
		}
		*/
		/*
		System.out.println("Now write to an xml file...");
		System.out.print("Ener name of xml file: ");
		fname = sc.nextLine();
		ArrayList<Shape> readFromXML;
		if (ShapeWriter.writeToXML(fname, shapes)) {
			System.out.println("Written successfully to XML");
			System.out.println("Now reading them back in ...");
			readFromXML = ShapeReader.readFromXMLFile(fname);
			ShapeWriter.writeToScreen(readFromXML);
		} else {
			System.out.println("Boo. Failure.");
		}
		*/
        System.out.println("Now write to json...");
		System.out.print("Enter name of json file: ");
		fname = sc.nextLine();
		ArrayList<Shape> readShapesJSON;
        if (ShapeWriter.writeToJSON(fname, shapes)) {
        	System.out.println("Written successfully.");
        	/*
            System.out.println("Wrote to json successfully.");
            System.out.println("Now will read back from json...");
            readShapesJSON = ShapeReader.readFromJSON(fname);
            ShapeWriter.writeToScreen(readShapesJSON);
            */
        } else {
        	System.out.println("Could not write to JSON.");
        }
	}
}
