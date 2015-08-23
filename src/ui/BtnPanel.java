package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel{
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, dot, confirm, reset, delete, add, minus, mtp, div, sqr, sign;
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
		sign = new JButton("¡À");
		pane.add(sqr);
		pane.add(sign);
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
	public JButton getB0() {
		return b0;
	}
	public void setB0(JButton b0) {
		this.b0 = b0;
	}
	public JButton getB1() {
		return b1;
	}
	public void setB1(JButton b1) {
		this.b1 = b1;
	}
	public JButton getB2() {
		return b2;
	}
	public void setB2(JButton b2) {
		this.b2 = b2;
	}
	public JButton getB3() {
		return b3;
	}
	public void setB3(JButton b3) {
		this.b3 = b3;
	}
	public JButton getB4() {
		return b4;
	}
	public void setB4(JButton b4) {
		this.b4 = b4;
	}
	public JButton getB5() {
		return b5;
	}
	public void setB5(JButton b5) {
		this.b5 = b5;
	}
	public JButton getB6() {
		return b6;
	}
	public void setB6(JButton b6) {
		this.b6 = b6;
	}
	public JButton getB7() {
		return b7;
	}
	public void setB7(JButton b7) {
		this.b7 = b7;
	}
	public JButton getB8() {
		return b8;
	}
	public void setB8(JButton b8) {
		this.b8 = b8;
	}
	public JButton getB9() {
		return b9;
	}
	public void setB9(JButton b9) {
		this.b9 = b9;
	}
	public JButton getDot() {
		return dot;
	}
	public void setDot(JButton dot) {
		this.dot = dot;
	}
	public JButton getConfirm() {
		return confirm;
	}
	public void setConfirm(JButton confirm) {
		this.confirm = confirm;
	}
	public JButton getReset() {
		return reset;
	}
	public void setReset(JButton reset) {
		this.reset = reset;
	}
	public JButton getDelete() {
		return delete;
	}
	public void setDelete(JButton delete) {
		this.delete = delete;
	}
	public JButton getAdd() {
		return add;
	}
	public void setAdd(JButton add) {
		this.add = add;
	}
	public JButton getMinus() {
		return minus;
	}
	public void setMinus(JButton minus) {
		this.minus = minus;
	}
	public JButton getMtp() {
		return mtp;
	}
	public void setMtp(JButton mtp) {
		this.mtp = mtp;
	}
	public JButton getDiv() {
		return div;
	}
	public void setDiv(JButton div) {
		this.div = div;
	}
	public JButton getSqr() {
		return sqr;
	}
	public void setSqr(JButton sqr) {
		this.sqr = sqr;
	}
	public JButton getSign() {
		return sign;
	}
	public void setSign(JButton sign) {
		this.sign = sign;
	}
	
}
	
	
