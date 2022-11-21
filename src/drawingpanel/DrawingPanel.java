package drawingpanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);  // background and edges are drawn + any internal components
		g.setColor(Color.RED);
		g.fillOval(50, 75, 100, 50);
		g.setColor(Color.GREEN);
		g.fillRect(200, 200, 50, 75);
		Font f = new Font("Times New Roman",Font.BOLD,24);
		g.drawString("It is a short week! Yay!", 20, 300);
	}
	
}