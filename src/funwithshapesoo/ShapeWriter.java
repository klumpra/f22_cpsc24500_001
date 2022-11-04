package funwithshapesoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

// Shape, Circle, and Rectangler are model classes - they store the data
// this ShapeWriter is a view class - it helps us see the data inside those model classes
public class ShapeWriter {
	public static void writeToScreen(ArrayList<Shape> shapes) {
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}
	public static boolean writeToFile(ArrayList<Shape> shapes, String fname) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
			for (Shape s : shapes) {
				pw.println(s);
			}
			pw.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}
