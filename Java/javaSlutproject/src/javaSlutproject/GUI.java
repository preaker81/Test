package javaSlutproject;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class GUI {

	public static void addComponentsToPanel(Container panel) {
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		addALabelWeekday("Label WeekDay", panel);
		addALabelDate("Label Date", panel);
		addATextField("TextField", panel);
		addAButton("Button", panel);
	
	}
	
	private static void addALabelWeekday(String text, Container container) {
		JLabel labelWeekday = new JLabel(text);
		labelWeekday.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
		container.add(labelWeekday);
	}
	
	private static void addALabelDate(String text, Container container) {
		JLabel labelDate = new JLabel(text);
		labelDate.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
		container.add(labelDate);
	}
	
	private static void addATextField(String text, Container container) {
		JTextField textfield = new JTextField(text);
		textfield.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
		container.add(textfield);
	}

	private static void addAButton(String text, Container container) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		container.add(button);
	}

	static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Calender");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// Set up the content pane.
		addComponentsToPanel(frame.getContentPane());
		addComponentsToPanel(frame.getContentPane());
		addComponentsToPanel(frame.getContentPane());
		addComponentsToPanel(frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

}
