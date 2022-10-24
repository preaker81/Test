package javaSlutproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Test {

	static void createAndDisplay() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout());
		
		addPanels(7);
		
		
		
		frame.setVisible(true);
	}

	private static void addPanels(int panels) {
		for (int i = 0; i < panels; i++) {

			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
			if (Date.getDate(i + 1).equals(LocalDate.now().toString())) {
				panel.setBackground(Color.cyan);
			}
		}
	}

	private static void addComponents(int x, JPanel container, JFrame frame) {
		// Creates components
		JLabel labelWeekday = new JLabel(Date.getWeekDay(x));
		JLabel labelDate = new JLabel(Date.getDate(x));

		JPanel notes = new JPanel();
		notes.setBounds(0, 100, 100, 200);
//		notes.setBackground(Color.yellow);

		JTextField textfield = new JTextField("Add an event", 40);
		textfield.setPreferredSize(new Dimension(0, 40));
		textfield.setMaximumSize(textfield.getPreferredSize());

		JButton button = new JButton("Add");

		// Adds the components to the JPanel container
		container.add(labelWeekday);
		container.add(labelDate);
		container.add(notes);
		container.add(textfield);
		container.add(button);

		ActionListener buttonListener = new ActionListener() {

			JLabel note = new JLabel("Event");

			@Override
			public void actionPerformed(ActionEvent e) {
				notes.add(note);
				note.setText(textfield.getText());

				frame.revalidate();
			}
		};
		button.addActionListener(buttonListener);
	}

}