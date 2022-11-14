package funwithshapesoo;
import java.io.Serializable;
import java.util.LinkedHashMap;
@SuppressWarnings("unchecked")
public abstract class Shape implements Comparable<Shape>, Serializable {
	// the position of the shape
	private Point origin;
	public double getX() {
		return origin.getX();   // delegation - the owner tells the thing that is owned
	}
	public void setX(double x) {
		origin.setX(x);
	}
	public double getY() {
		return origin.getY();
	}
	public void setY(double y) {
		origin.setY(y);
	}
	// by default, the shape is located at the coordinate origin
	public Shape() {
		origin = new Point();  // sets up the origin for the Shape at (0,0)
	}
	// non-default constructor
	public Shape(double x, double y) {
		origin = new Point(x,y); // composition - I'm creating the owned in the owner's constructor
	}
	// these two functions are guaranteed to be implemented in subclasses
	public abstract double findArea();
	public abstract double findPerim();
	
	// another abstract function, this one returning what kind of shape we are
	public abstract String getShapeType();
	
	// how a given shape will represent itself as a String
	@Override
	public String toString() {
		return String.format("%s\t%s", getShapeType(), origin);
	}
	@Override
	public int compareTo(Shape other) {
		double myArea = findArea();
		double otherArea = other.findArea();
		if (myArea < otherArea) {
			return -1;
		} else if (myArea > otherArea) {
			return 1;
		} else {
			return 0;
		}
	}
    public LinkedHashMap<String,String> mapValues() {
        LinkedHashMap<String,String> result = new LinkedHashMap<String,String>();
        result.put("shapetype", getShapeType());
        result.put("x", String.valueOf(getX()));
        result.put("y", String.valueOf(getY()));
        return result;
    }

}
