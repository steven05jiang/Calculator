package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MainUI {
	public static void main(String[] args){
		MainWindow window = new MainWindow();
	}
}

class MainWindow extends JFrame implements ActionListener{
	DisplayPanel dsp;
	BtnPanel btn;
	boolean dot = true;
	double numSign = 1.0;
	double result = 0.0;
	int sign = -1;
	public MainWindow(){
		setSize(500, 780);
		Container con = getContentPane();
		con.setLayout(new GridLayout(2,1));
		dsp = new DisplayPanel();
		btn = new BtnPanel();
		con.add(dsp);
		con.add(btn);
		btn.add.addActionListener(this);
		btn.minus.addActionListener(this);
		btn.mtp.addActionListener(this);
		btn.div.addActionListener(this);
		btn.sqr.addActionListener(this);
		btn.sqrt.addActionListener(this);
		btn.delete.addActionListener(this);
		btn.reset.addActionListener(this);
		btn.confirm.addActionListener(this);
		btn.dot.addActionListener(this);
		btn.b0.addActionListener(this);
		btn.b1.addActionListener(this);
		btn.b2.addActionListener(this);
		btn.b3.addActionListener(this);
		btn.b4.addActionListener(this);
		btn.b5.addActionListener(this);
		btn.b6.addActionListener(this);
		btn.b7.addActionListener(this);
		btn.b8.addActionListener(this);
		btn.b9.addActionListener(this);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

class DisplayPanel extends JPanel{
	JLabel display;
	public DisplayPanel(){
		super();
		setBackground(Color.BLACK);
		setLayout(new BorderLayout());
		setSize(500,160);
		display = new JLabel("0.001",JLabel.RIGHT);
		display.setForeground(Color.WHITE);
		add(display, "Center");
	}
}

class BtnPanel extends JPanel{
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, dot, confirm, reset, delete, add, minus, mtp, div, sqr, sqrt;
	public BtnPanel() {
		super();
		JPanel pane = new JPanel();
		pane.setLayout(new GridLayout(5, 4));
		pane.setSize(460,580);
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		dot = new JButton(".");
		confirm = new JButton("=");
		reset = new JButton("C");
		delete = new JButton("<--");
		add = new JButton("+");
		minus = new JButton("-");
		mtp = new JButton("¡Á");
		div = new JButton("¡Â");
		sqr = new JButton("x^2");
		sqrt = new JButton("sqrt");
		pane.add(sqr);
		pane.add(sqrt);
		pane.add(reset);
		pane.add(delete);
		pane.add(add);
		pane.add(b7);
		pane.add(b8);
		pane.add(b9);
		pane.add(minus);
		pane.add(b4);
		pane.add(b5);
		pane.add(b6);
		pane.add(mtp);
		pane.add(b1);
		pane.add(b2);
		pane.add(b3);
		pane.add(div);
		pane.add(confirm);
		pane.add(b0);
		pane.add(dot);
		setSize(500, 620);
		setLayout(new BorderLayout());
		add(pane, "Center");
	}
	
}
