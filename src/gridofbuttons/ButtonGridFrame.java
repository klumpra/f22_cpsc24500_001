package gridofbuttons;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonGridFrame extends JFrame {
	public void setupGUI() {
		setTitle("This is frame that shows a grid of buttons");
		setBounds(100,100,500,500);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		ButtonGridPanel bgp = new ButtonGridPanel();
		c.add(bgp,BorderLayout.CENTER);
		JButton btnOK = new JButton("OK");
		c.add(btnOK,BorderLayout.SOUTH);
	}
	public ButtonGridFrame() {
		setupGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
