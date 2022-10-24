package javaSlutproject;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GUI {

	static void createAndDisplay() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(716, 450);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		JPanel topPanel1 = new JPanel();
		topPanel1.setBounds(0, 0, 100, 330);
		topPanel1.setLayout(new BoxLayout(topPanel1, BoxLayout.PAGE_AXIS));
		JPanel topPanel2 = new JPanel();
		topPanel2.setBounds(100, 0, 100, 330);
		topPanel2.setLayout(new BoxLayout(topPanel2, BoxLayout.PAGE_AXIS));
		JPanel topPanel3 = new JPanel();
		topPanel3.setBounds(200, 0, 100, 330);
		topPanel3.setLayout(new BoxLayout(topPanel3, BoxLayout.PAGE_AXIS));
		JPanel topPanel4 = new JPanel();
		topPanel4.setBounds(300, 0, 100, 330);
		topPanel4.setLayout(new BoxLayout(topPanel4, BoxLayout.PAGE_AXIS));
		JPanel topPanel5 = new JPanel();
		topPanel5.setBounds(400, 0, 100, 330);
		topPanel5.setLayout(new BoxLayout(topPanel5, BoxLayout.PAGE_AXIS));
		JPanel topPanel6 = new JPanel();
		topPanel6.setBounds(500, 0, 100, 330);
		topPanel6.setLayout(new BoxLayout(topPanel6, BoxLayout.PAGE_AXIS));
		JPanel topPanel7 = new JPanel();
		topPanel7.setBounds(600, 0, 100, 330);
		topPanel7.setLayout(new BoxLayout(topPanel7, BoxLayout.PAGE_AXIS));

		JPanel bottomPanel1 = new JPanel();
		bottomPanel1.setBounds(0, 330, 100, 80);
		bottomPanel1.setLayout(new BoxLayout(bottomPanel1, BoxLayout.PAGE_AXIS));
		JPanel bottomPanel2 = new JPanel();
		bottomPanel2.setBounds(100, 330, 100, 80);
		bottomPanel2.setLayout(new BoxLayout(bottomPanel2, BoxLayout.PAGE_AXIS));
		JPanel bottomPanel3 = new JPanel();
		bottomPanel3.setBounds(200, 330, 100, 80);
		bottomPanel3.setLayout(new BoxLayout(bottomPanel3, BoxLayout.PAGE_AXIS));
		JPanel bottomPanel4 = new JPanel();
		bottomPanel4.setBounds(300, 330, 100, 80);
		bottomPanel4.setLayout(new BoxLayout(bottomPanel4, BoxLayout.PAGE_AXIS));
		JPanel bottomPanel5 = new JPanel();
		bottomPanel5.setBounds(400, 330, 100, 80);
		bottomPanel5.setLayout(new BoxLayout(bottomPanel5, BoxLayout.PAGE_AXIS));
		JPanel bottomPanel6 = new JPanel();
		bottomPanel6.setBounds(500, 330, 100, 80);
		bottomPanel6.setLayout(new BoxLayout(bottomPanel6, BoxLayout.PAGE_AXIS));
		JPanel bottomPanel7 = new JPanel();
		bottomPanel7.setBounds(600, 330, 100, 80);
		bottomPanel7.setLayout(new BoxLayout(bottomPanel7, BoxLayout.PAGE_AXIS));

		addTopGroupOfComponents(1, topPanel1);
		addTopGroupOfComponents(2, topPanel2);
		addTopGroupOfComponents(3, topPanel3);
		addTopGroupOfComponents(4, topPanel4);
		addTopGroupOfComponents(5, topPanel5);
		addTopGroupOfComponents(6, topPanel6);
		addTopGroupOfComponents(7, topPanel7);

		addBottomGroupOfComponents(bottomPanel1);
		addBottomGroupOfComponents(bottomPanel2);
		addBottomGroupOfComponents(bottomPanel3);
		addBottomGroupOfComponents(bottomPanel4);
		addBottomGroupOfComponents(bottomPanel5);
		addBottomGroupOfComponents(bottomPanel6);
		addBottomGroupOfComponents(bottomPanel7);

		frame.add(topPanel1);
		frame.add(topPanel2);
		frame.add(topPanel3);
		frame.add(topPanel4);
		frame.add(topPanel5);
		frame.add(topPanel6);
		frame.add(topPanel7);

		frame.add(bottomPanel1);
		frame.add(bottomPanel2);
		frame.add(bottomPanel3);
		frame.add(bottomPanel4);
		frame.add(bottomPanel5);
		frame.add(bottomPanel6);
		frame.add(bottomPanel7);

		frame.setVisible(true);
	}

//	private static void addTopPanels () {
//		
//	}
//	
//	private static void addBottomPanels () {
//		
//	}

	private static void addTopGroupOfComponents(int x, JPanel container) {
		// Creates components
		JLabel labelWeekday = new JLabel(Date.getWeekDay(x));
//		labelWeekday.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JLabel labelDate = new JLabel(Date.getDate(x));

		// Adds the components to the JPanel container
		container.add(labelWeekday);
		container.add(labelDate);
	}

	private static void addBottomGroupOfComponents(JPanel container) {
		// Creates components
		JTextField textfield = new JTextField("Add an event", 40);
		textfield.setPreferredSize(new Dimension(0, 40));
		textfield.setMaximumSize(textfield.getPreferredSize());
		Button btn = new Button("Add");

		// Adds the components to the JPanel container
		container.add(textfield);
		container.add(btn.button);
	}

}
