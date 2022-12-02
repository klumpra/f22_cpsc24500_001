package textandmenu;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAndMenuFrame extends JFrame {
	private Story story;  // the story the frame will be presenting
	private JTextArea tarStory;  // multiple lines of text; show our story
	public void setupMenu() {
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);
		JMenu mnuFile = new JMenu("File");
		JMenu mnuTools = new JMenu("Tools");
		mbar.add(mnuFile);
		mbar.add(mnuTools);
		// add the items to mnuFile
		JMenuItem miLoad = new JMenuItem("Load story");
		JMenuItem miSave = new JMenuItem("Save story");
		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);   // exits the program
					}
				}
		);
		mnuFile.add(miLoad);
		miLoad.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser chooser = new JFileChooser();
						File f;
						if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
							f = chooser.getSelectedFile();
							if (StoryReader.readFromText(f, story)) {
						//		tarStory.setText(story.toString());
								repaint();
							} else {
								JOptionPane.showMessageDialog(null,"Could not read from file.");
							}
						}
					}
				}
		);
		mnuFile.add(miSave);
		miSave.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser chooser = new JFileChooser();
						File f;
						if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
							f = chooser.getSelectedFile();
							if (StoryWriter.writeToFile(story, f)) {
								JOptionPane.showMessageDialog(null,"Story was written to file.");
							} else {
								JOptionPane.showMessageDialog(null,"The story could not be written.");
							}
						}
					}
				}
		);
		mnuFile.add(miExit);
		JMenuItem miClear = new JMenuItem("Clear");
		mnuTools.add(miClear);
		miClear.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						story.clearSentences();
						//tarStory.setText(story.toString());
						repaint();    // tells the frame to repaint all the components inside 
					}
				}
		);
	}
	public void setupGUI() {
		setTitle("Text and Menu Frame");
		setBounds(100,100,600,400);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		setupMenu();
		tarStory = new JTextArea();
		tarStory.setEditable(false);
		c.add(tarStory,BorderLayout.CENTER);
		JPanel panSouth = new JPanel();
		panSouth.setLayout(new FlowLayout());
		JLabel labSentence = new JLabel("Enter sentence:");
		JTextField txtSentence = new JTextField(30);    // 30 m's wide
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text = txtSentence.getText().trim();
						if (!text.isBlank()) {
							story.addSentence(text);
							txtSentence.setText("");
							//tarStory.setText(story.toString());
							repaint();
						}
					}
				}
		);
//		btnSubmit.setEnabled(false);
		panSouth.add(labSentence);
		panSouth.add(txtSentence);
		panSouth.add(btnSubmit);
		c.add(panSouth,BorderLayout.SOUTH);
	}
	public TextAndMenuFrame(Story story) {
		this.story = story;
		setupGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {
		tarStory.setText(story.toString());
		super.paint(g);
	}
}
