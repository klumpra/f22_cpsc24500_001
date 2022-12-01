package uiwithmvc20221128;

import java.util.ArrayList;
import java.util.Random;

public class ShapeMover {
	private ArrayList<Shape> shapes;
	private Random rnd;
	public ShapeMover(ArrayList<Shape> shapes) {
		this.shapes = shapes;
		rnd = new Random();
	}
	public void moveRandomly() {
		int x,y;
		for (Shape s: shapes) {
			x = -10 + rnd.nextInt(20);
			y = -10 + rnd.nextInt(20);
			s.setX(s.getX() + x);
			s.setY(s.getY() + y);
		}
	}
}
