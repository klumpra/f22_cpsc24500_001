package funwithshapesoo;

import java.util.LinkedHashMap;

public class Rectangle extends Shape {
	private double width;
	private double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (length < 0) {
			this.length = 0;
		} else {
			this.length = length;
		}
	}
	public Rectangle() {
		// default constructor auto called here
		length = 0;
		width = 0;
	}
	public Rectangle(double x, double y, double width, double length) {
		super(x,y);
		setWidth(width);
		setLength(length);
	}
	@Override
	public double findArea() {
		return length * width;
	}
	@Override
	public double findPerim() {
		return 2 * (length + width);
	}
	@Override
	public String getShapeType() {
		return "rect";
	}
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f", super.toString(),width,length);
	}

    @Override
    public LinkedHashMap<String,String> mapValues() {
        LinkedHashMap<String,String> result = super.mapValues();
        result.put("length", String.valueOf(length));
        result.put("width", String.valueOf(width));
        return result;
    }

}
