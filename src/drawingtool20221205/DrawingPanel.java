package drawingtool20221205;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener {
	private ArrayList<Dot> dots;
	private int dotSize;
	private String message;
	public ArrayList<Dot> getDots() {
		return dots;
	}
	public void setDots(ArrayList<Dot> dots) {
		this.dots = dots;
	}
	public void setDotSize(int size) {
		if (size < 1) {
			this.dotSize = 1;
		} else {
			this.dotSize = size;
		}
	}
	public int getDotSize() {
		return dotSize;
	}
	public DrawingPanel(ArrayList<Dot> dots, int size) {
		setDots(dots);
		setDotSize(size);
		message = "Welcome to the drawing tool!";
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Dot d : dots) {
			g.fillOval(d.getX(),d.getY(),d.getSize(),d.getSize());
		}
		g.drawString(message, 10,10);
	}
	public void mouseEntered(MouseEvent e) {
		message = "You entered the drawing panel!";
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		message = "You exited the drawing panel. We'll miss you.";
		repaint();
	}
	public void mouseClicked(MouseEvent e) {
		message = String.format("You clicked at x=%d, y=%d",e.getX(),e.getY());
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		message = String.format("You released at x=%d, y=%d",e.getX(),e.getY());
		repaint();
	}
	public void mousePressed(MouseEvent e) {
		message = String.format("You pressed at x=%d, y=%d",e.getX(),e.getY());
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		message = String.format("x=%d, y=%d",e.getX(),e.getY());
		repaint();
	}
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Dot dotty = new Dot(x,y,dotSize);
		dots.add(dotty);
		repaint();
	}


}
