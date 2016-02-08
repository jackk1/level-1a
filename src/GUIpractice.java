import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIpractice implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton guess;
	JTextField field;

	public static void main(String[] args) {
		GUIpractice p = new GUIpractice();

	}

	public GUIpractice() {
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		guess = new JButton("guess");
		guess.addActionListener(this);
		panel.add(guess);
		field = new JTextField(5);
		field.addActionListener(this);
		panel.add(field);
		window.add(panel);
		window.setSize(500, 500);
	}

	int x;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int guess1=0;
		int num = 0;
		final int limit = 100;

		if (e.getSource() == guess) {
			String input = field.getText();
			num = Integer.parseInt(input);
			
			for (x = 0; guess1 != num; x++) {
				Random r = new Random();
				guess1 = r.nextInt(limit);
			}
			System.out.println(x);

		}
	}

}
