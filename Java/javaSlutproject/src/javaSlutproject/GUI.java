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
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout());

		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		if (Date.getDate(1).equals(LocalDate.now().toString())) {
			panel1.setBackground(Color.cyan);
		}

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
		if (Date.getDate(2).equals(LocalDate.now().toString())) {
			panel2.setForeground(Color.cyan);
		}

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
		if (Date.getDate(3) == LocalDate.now().toString()) {
			panel3.setForeground(Color.cyan);
		}

		JPanel panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));
		if (Date.getDate(4) == LocalDate.now().toString()) {
			panel4.setForeground(Color.cyan);
		}

		JPanel panel5 = new JPanel();
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.PAGE_AXIS));
		if (Date.getDate(5) == LocalDate.now().toString()) {
			panel5.setForeground(Color.cyan);
		}

		JPanel panel6 = new JPanel();
		panel6.setLayout(new BoxLayout(panel6, BoxLayout.PAGE_AXIS));
		if (Date.getDate(6) == LocalDate.now().toString()) {
			panel6.setForeground(Color.cyan);
		}

		JPanel panel7 = new JPanel();
		panel7.setLayout(new BoxLayout(panel7, BoxLayout.PAGE_AXIS));
		if (Date.getDate(7) == LocalDate.now().toString()) {
			panel7.setForeground(Color.cyan);
		}

		addComponents(1, panel1, frame);
		addComponents(2, panel2, frame);
		addComponents(3, panel3, frame);
		addComponents(4, panel4, frame);
		addComponents(5, panel5, frame);
		addComponents(6, panel6, frame);
		addComponents(7, panel7, frame);

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
		frame.add(panel7);

		frame.setVisible(true);
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
