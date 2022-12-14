package funwithshapesoo;

import java.util.LinkedHashMap;

public class Circle extends Shape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		if (r < 0) {
			radius = 0;
		} else {
			radius = r;
		}
	}
	public Circle() {
		// calls the superclass's default constructor automatically
		radius = 0;
	}
	public Circle(double x, double y, double r) {
		super(x,y);   // calls the superclass's constructor
		setRadius(r);
	}
	@Override
	public String getShapeType() {
		return "circle";
	}
	@Override
	public double findArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double findPerim() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return String.format("%s\t%.2f", super.toString(),radius);
	}
    @Override
    public LinkedHashMap<String,String> mapValues() {
        LinkedHashMap<String,String> result = super.mapValues();
        result.put("radius", String.valueOf(radius));
        return result;
    }

}
