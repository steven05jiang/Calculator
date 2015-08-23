package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayPanel extends JPanel{
	JLabel display;
	public DisplayPanel(){
		super();
		setBackground(Color.BLACK);
		setLayout(new BorderLayout());
		setSize(500,160);
		display = new JLabel("0.",JLabel.RIGHT);
		display.setForeground(Color.WHITE);
		add(display, "Center");
	}
	public JLabel getDisplay() {
		return display;
	}
	public void setDisplay(JLabel display) {
		this.display = display;
	}
	
}
