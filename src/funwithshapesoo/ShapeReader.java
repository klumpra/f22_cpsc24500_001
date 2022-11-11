package funwithshapesoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeReader {
	public static ArrayList<Shape> readFromTextFile(String fname) {
		try {
			Scanner fsc = new Scanner(new File(fname));
			ArrayList<Shape> shapes = new ArrayList<Shape>();
			String line;
			String[] parts;
			String shapeType;
			double x, y, radius, width, length;
			Circle c;
			Rectangle r;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				line = line.trim();
				parts = line.split("\t");
				shapeType = parts[0];
				x = Double.parseDouble(parts[1]);
				y = Double.parseDouble(parts[2]);
				if (shapeType.equalsIgnoreCase("circle")) {
					radius = Double.parseDouble(parts[3]);
					c = new Circle(x,y,radius);
					shapes.add(c);
				} else if (shapeType.equalsIgnoreCase("rect")){
					width = Double.parseDouble(parts[3]);
					length = Double.parseDouble(parts[4]);
					r = new Rectangle(x,y,width,length);
					shapes.add(r);
				}
			}
			return shapes;
		} catch (Exception ex) {
			return null;
		}
	}
	public static ArrayList<Shape> readFromBinaryFile(String fname) {
		try {
			FileInputStream fis = new FileInputStream(new File(fname));
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Shape> shapes = (ArrayList<Shape>)ois.readObject();
			ois.close();
			return shapes;
			
		} catch (Exception ex) {
			return null;
		}
	}
}
