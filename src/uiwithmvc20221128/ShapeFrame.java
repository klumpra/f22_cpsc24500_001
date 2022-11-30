package uiwithmvc20221128;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapeFrame extends JFrame /*implements ActionListener*/ {
	private ArrayList<Shape> shapes;
	private ShapePanel panDrawing;
	private ShapeMover mover;
	public void setupGUI(ArrayList<Shape> shapes) {
		this.shapes = shapes;
		mover = new ShapeMover(shapes);
		setTitle("Drawing Frame");
		setBounds(100,100,500,500);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JButton btnOK = new JButton("OK");
//		ButtonHandler bh = new ButtonHandler();
//		btnOK.addActionListener(bh);
		btnOK.addActionListener(
			new ActionListener() { // spontaneously creating a class with no name that implements ActionListener
				public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(null, "Anonymous inner class approach.");
/*					for (Shape s : shapes) {
						s.setX(s.getX()+5);
						s.setY(s.getY()+5);
					}
*/
					mover.moveRandomly();
					repaint();  //tells the frame to repaint itself - tells each component inside to repaint too
				}
			}
		);
		c.add(btnOK,BorderLayout.SOUTH);
		panDrawing = new ShapePanel(shapes);
		c.add(panDrawing,BorderLayout.CENTER);
	}
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"It is only Wednesday.");
	}
	*/
	public ShapeFrame(ArrayList<Shape> shapes) {
		setupGUI(shapes);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}