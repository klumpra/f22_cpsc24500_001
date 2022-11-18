package firstuserinterface;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame {
	public void setupGUI() {
		setTitle("My First Frame");
		// left, top, width, height in pixels
		setBounds(0,0,500,500);
//		setBounds(0,0,(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		Container c = getContentPane();
		Color customColor = new Color(100,200,50);  
		c.setBackground(customColor);  // Color.RED
		/*
		c.setLayout(new FlowLayout());
		JLabel lblName = new JLabel("Enter your name: ");
		c.add(lblName);
		JTextField txtName = new JTextField(20);
		c.add(txtName);
		JButton btnOK = new JButton("Press me!");
		c.add(btnOK);
		*/
		/*
		c.setLayout(new BorderLayout());
		JLabel lblName = new JLabel("Enter your name: ");
		c.add(lblName,BorderLayout.NORTH);
		JTextField txtName = new JTextField(20);
		c.add(txtName,BorderLayout.SOUTH);
		JButton btnOK = new JButton("Press me!");
		c.add(btnOK,BorderLayout.CENTER);
		*/
		c.setLayout(new GridLayout(3,3));
		JButton btn;
		for (int i = 0; i < 9; i++) {
			btn = new JButton(String.valueOf(i));
			c.add(btn);
		}
	}
	public MyFirstFrame() {
		setupGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);  // what happens when the person clicks the x in the corner
	}
	/* seldom draw directly on a frame, but this provides an example of how you would
	@Override
	public void paint(Graphics g) {
		super.paint(g);   // makes sure that the edges, background, and all lw components get rendered
		g.setColor(Color.RED);
		g.fillOval(50,100,150,75);
	}
	*/
}
