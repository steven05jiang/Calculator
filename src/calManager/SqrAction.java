package calManager;

import ui.MainWindow;

public class SqrAction {
	MainWindow window;
	String num;

	public SqrAction(MainWindow mainWindow) {
		window = mainWindow;
		num = mainWindow.getDsp().getDisplay().getText();
	}

	public void process() {
		String response = Calculate.getResult(4, window.getResult(),Double.parseDouble(num));
		window.getDsp().getDisplay().setText(response);
		window.setSign(-1);
		window.setDot(false);
		window.setValidSign(false);
	}
}
