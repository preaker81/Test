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

class GUI {

	static void createAndDisplay() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setSize(800, 350);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout());

		// For loop för paneler
		
		for (int i = 1; i <= 7; i++) {
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
			panel.setBounds(0, 0, 100, 400);

			if (Date.getDate(i).equals(LocalDate.now().toString())) {
				panel.setBackground(Color.gray);
			} else {
				panel.setBackground(Color.white);
			}

			addComponents(i, panel, frame);
			frame.add(panel);

		}
		frame.setVisible(true);
	}

	private static void addComponents(int x, JPanel container, JFrame frame) {
		// Creates components
		JLabel labelWeekday = new JLabel(Date.getWeekDay(x));
		JLabel labelDate = new JLabel(Date.getDate(x));

		JPanel notes = new JPanel();
		notes.setBackground(Color.white);

		JTextField textfield = new JTextField("Add an event", 40);
		textfield.setPreferredSize(new Dimension(0, 40));
		textfield.setMaximumSize(textfield.getPreferredSize());

		JButton button = new JButton("Add");

		container.add(labelWeekday);
		container.add(labelDate);
		container.add(notes);
		container.add(textfield);
		container.add(button);

		ActionListener buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel note = new JLabel("Event");
				notes.add(note);
				note.setText(textfield.getText());

				frame.revalidate();
			}
		};
		button.addActionListener(buttonListener);
	}

}
