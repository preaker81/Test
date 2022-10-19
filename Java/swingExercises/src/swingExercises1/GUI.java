package swingExercises1;

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
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel groupContainer = new JPanel();

		addGroupOfComponents("Group1", groupContainer);
		addGroupOfComponents("Group2", groupContainer);
		addGroupOfComponents("Group3", groupContainer);

		frame.add(groupContainer);
		frame.setVisible(true);

	}

	private static void addGroupOfComponents(String text, JPanel container) {
		JLabel label = new JLabel(text + " label");
		JButton button = new JButton(text +" Button");
		JTextField textField = new JTextField(text +" TextField");
		
		addButtonListener(button, label, textField);

		container.add(textField);
		container.add(button);
		container.add(label);
	}

	private static void addButtonListener(JButton b, JLabel l, JTextField tf) {
		ActionListener bListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText(tf.getText());
				tf.setText("");
			}
			
		};
		b.addActionListener(bListener);
	}
}