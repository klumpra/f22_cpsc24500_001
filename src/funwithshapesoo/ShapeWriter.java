package funwithshapesoo;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.beans.XMLEncoder;

// Shape, Circle, and Rectangler are model classes - they store the data
// this ShapeWriter is a view class - it helps us see the data inside those model classes
public class ShapeWriter {
	public static void writeToScreen(ArrayList<Shape> shapes) {
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}
	public static boolean writeToTextFile(ArrayList<Shape> shapes, String fname) {
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
	public static boolean writeToBinaryFile(ArrayList<Shape> shapes, String fname) {
		try {
			FileOutputStream fos = new FileOutputStream(new File(fname));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(shapes);
			oos.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public static boolean writeToXML(String fname, ArrayList<Shape> shapes) {
		try {
			XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(new File(fname))));
			enc.writeObject(shapes);
			enc.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}
