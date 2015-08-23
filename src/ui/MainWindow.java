package ui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import calManager.ListenerManager;

public class MainWindow extends JFrame implements ActionListener{
	DisplayPanel dsp;
	BtnPanel btn;
	boolean validSign = false;
	boolean dot = false;
//	double numSign = 1.0;
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
		btn.sign.addActionListener(this);
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
		ListenerManager manager = new ListenerManager(this);
		manager.getEvent(e);
	}
	public DisplayPanel getDsp() {
		return dsp;
	}
	public void setDsp(DisplayPanel dsp) {
		this.dsp = dsp;
	}
	public BtnPanel getBtn() {
		return btn;
	}
	public void setBtn(BtnPanel btn) {
		this.btn = btn;
	}
	public boolean isDot() {
		return dot;
	}
	public void setDot(boolean dot) {
		this.dot = dot;
	}
//	public double getNumSign() {
//		return numSign;
//	}
//	public void setNumSign(double numSign) {
//		this.numSign = numSign;
//	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public int getSign() {
		return sign;
	}
	public void setSign(int sign) {
		this.sign = sign;
	}
	public boolean isValidSign() {
		return validSign;
	}
	public void setValidSign(boolean validSign) {
		this.validSign = validSign;
	}
	
}



