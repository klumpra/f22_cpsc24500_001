package funwithshapesoo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeReader {
	public static ArrayList<Shape> readFromFile(String fname) {
		try {
			Scanner fsc = new Scanner(new File(fname));
			ArrayList<Shape> shapes = new ArrayList<Shape>();
			String line;
			String[] parts;
			String shapeType;
			double x, y, radius;
			Circle c;
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
					
				}
			}
			return shapes;
		} catch (Exception ex) {
			return null;
		}
	}
}
