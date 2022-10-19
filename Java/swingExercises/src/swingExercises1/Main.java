package swingExercises1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("First Example");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel groupContainer = new JPanel();

		addGroupComponent("Dont press this button!", groupContainer);

		frame.add(groupContainer);
		frame.setVisible(true);

	}

	static void addGroupComponent(String text, JPanel container) {
		JButton button = new JButton(text + " button");
		JLabel label = new JLabel(text + " label");

		addButtonListener(button, label);

		container.add(button);
		container.add(label);
	}

	private static void addButtonListener(JButton button, JLabel label) {
		ActionListener buttonListener = new ActionListener() {
			int counter = 0;

			public void actionPerformed(ActionEvent e) {
				System.out.println(label.getText() + " " + counter++ + " times");
			}
		};

		button.addActionListener(buttonListener);

	}

}