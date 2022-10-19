package javaSlutproject;

import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GUI {

	static void createAndDisplay() {

		JFrame frame = new JFrame("First Example");
		frame.setSize(700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel groupContainer = new JPanel();

		addGroupOfComponents("Day 1", groupContainer);
		addGroupOfComponents("Day 2", groupContainer);
		addGroupOfComponents("Day 3", groupContainer);
		addGroupOfComponents("Day 4", groupContainer);
		addGroupOfComponents("Day 5", groupContainer);
		addGroupOfComponents("Day 6", groupContainer);
		addGroupOfComponents("Day 7", groupContainer);
		
		groupContainer.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.add(groupContainer);
		frame.setVisible(true);

	}
	
	private static void addGroupOfComponents(String text, JPanel container) {
		JLabel labelWeekday = new JLabel("Weekday");
		JLabel labelEvent = new JLabel("Event");
		JTextField textField = new JTextField("Add an event");
		JButton button = new JButton("Add");
		
		addButtonListener(button);

		container.add(labelWeekday);
		container.add(labelEvent);
		container.add(textField);
		container.add(button);
		
		
		
	}
	
	private static void addButtonListener(JButton b) {
		ActionListener bListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button pressed");
			}
			
		};
		b.addActionListener(bListener);
	}
	
}
