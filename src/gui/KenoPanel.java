package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class KenoPanel extends JPanel {
	JPanel displayPanel = new JPanel(), secondGrid = new JPanel(), borderleft = new JPanel(), borderright = new JPanel();
	JTextArea display = new JTextArea();
	JButton testbutton1 = new JButton("Generate"), testbutton2 = new JButton("Statistic");
	public KenoPanel() {
		setLayout(new GridLayout(2,1));
		// the lower part of the frame
		secondGrid.setLayout(new GridLayout(1,2));
		borderleft.setLayout(new BorderLayout());
		borderright.setLayout(new BorderLayout());
		secondGrid.add(borderleft);
		secondGrid.add(borderright);
		
		borderleft.add(testbutton1, BorderLayout.NORTH);
		borderright.add(testbutton2, BorderLayout.NORTH);
		
		// add the components to the Panel
		add(display);
		add(secondGrid);
	}
}
