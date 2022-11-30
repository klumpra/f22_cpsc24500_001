package uiwithmvc20221128;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ShapePanel extends JPanel {
	private ArrayList<Shape> shapes;
	public ShapePanel() {
		shapes = new ArrayList<Shape>();
	}
	public ShapePanel(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ShapeDrawer.drawShapes(shapes, g);
	}
}