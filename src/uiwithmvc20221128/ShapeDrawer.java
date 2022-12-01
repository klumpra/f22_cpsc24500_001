package uiwithmvc20221128;

import java.awt.Graphics;
import java.util.ArrayList;

public class ShapeDrawer {
	public static void drawShapes(ArrayList<Shape> shapes, Graphics g) {
		String type;
		int x, y, radius, width, length;
		for (Shape s : shapes) {
			type = s.getType();
			x = s.getX();
			y = s.getY();
			if (type.equals("circle")) {
				radius = ((Circle)s).getRadius();
				g.drawOval(x, y, 2*radius, 2*radius);
			} else if (type.equals("rectangle")) {
				width = ((Rectangle)s).getWidth();
				length = ((Rectangle)s).getLength();
				g.drawRect(x,y,width,length);
			}
		}		
	}
}
