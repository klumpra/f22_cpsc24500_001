package drawingpanel;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DrawingFrame extends JFrame{
	public void setupGUI() {
		setTitle("Drawing frame");
		setBounds(50,50,500,500);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		DrawingPanel dp = new DrawingPanel();
		c.add(dp,BorderLayout.CENTER);
		JButton btnOK = new JButton("OK");
		c.add(btnOK,BorderLayout.SOUTH);
	}
	public DrawingFrame() {
		setupGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
