package gui;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class KenoFrame extends JFrame {
	public KenoFrame() {
		setTitle("Keno Numbers! Get Rich now! :D");
		setSize(400, 400);
		setLocation((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 3,
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new KenoPanel());
		setVisible(true);
	}
}
