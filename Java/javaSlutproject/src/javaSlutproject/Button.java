package javaSlutproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Button implements ActionListener {

	JButton button;

	Button(String buttonLabel) {
		this.button = new JButton(buttonLabel);
		this.button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button pressed");
		
		//panel.add(label);
	}
}