package swingExercises2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("First Example");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel groupContainer = new JPanel();

		addGroupComponent("Dont press this button!", groupContainer);
		addGroupComponent("Hey, press this button!", groupContainer);
		addGroupComponent("Dont dare pressing this one!", groupContainer);

		frame.add(groupContainer);
		frame.setVisible(true);

	}
	
	static void addGroupComponent(String text, JPanel container) {
		JButton button = new JButton(text);
		
		container.add(button);
		
	}

}
