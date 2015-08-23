package calManager;

import ui.MainWindow;

public class NumAction {
	MainWindow window;
	String num;

	public NumAction(MainWindow mainWindow) {
		window = mainWindow;
		num = mainWindow.getDsp().getDisplay().getText();
	}

	public void process(String s) {
		if (window.isValidSign()) {

			if (window.isDot())
				window.getDsp().getDisplay().setText(num + s);
			else if (num.charAt(0) == '-') {
				if (num.charAt(1) != '0')
					window.getDsp().getDisplay().setText(num.substring(0, num.length() - 1) + s+ ".");
				else if (!s.equals("0"))
					window.getDsp().getDisplay().setText("-" + s + ".");
			}
			else{
				if (num.charAt(0) != '0')
					window.getDsp().getDisplay().setText(num.substring(0, num.length() - 1) + s+ ".");
				else if (!s.equals("0"))
					window.getDsp().getDisplay().setText(s + ".");
			}
		} else {
			window.setValidSign(true);
			if (window.isDot())
				window.getDsp().getDisplay().setText("0." + s);
			else
				window.getDsp().getDisplay().setText(s + ".");
		}
	}
}
