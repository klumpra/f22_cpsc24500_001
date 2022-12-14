package funwithshapesoo;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
	public static ArrayList<Shape> readFromXMLFile(String fname) {
		try {
			XMLDecoder dec = new XMLDecoder(new BufferedInputStream(new FileInputStream(new File(fname))));
			ArrayList<Shape> shapes  = (ArrayList<Shape>)dec.readObject();
			dec.close();
			return shapes;
		} catch (Exception ex) {
			return null;
		}
	}
    public static ArrayList<Shape> readFromJSON(String fname) {
        try {
            ArrayList<Shape> result = new ArrayList<Shape>();
            FileReader reader = new FileReader(new File(fname));
            JSONParser parser = new JSONParser();
            JSONArray arr = (JSONArray)parser.parse(reader);
            Iterator<JSONObject> itr = arr.iterator();
            JSONObject obj;
            Shape s;
            while (itr.hasNext()) {
                obj = itr.next();
                s = ShapeFactory.buildFromJSON(obj);
                if (s != null) {
                    result.add(s);
                }
            }
            reader.close();
            return result;
        } catch (Exception ex) {
            return null;
        }
    }
}
