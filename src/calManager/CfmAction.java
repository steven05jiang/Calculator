package calManager;

import ui.MainWindow;

public class CfmAction {
	MainWindow window;
	String num;
	public CfmAction(MainWindow mainWindow) {
		window = mainWindow;
		num = mainWindow.getDsp().getDisplay().getText();
	}
	
	public void process(){
		if(window.isValidSign()){
			String response = Calculate.getResult(window.getSign(), window.getResult(), Double.parseDouble(num));
			window.getDsp().getDisplay().setText(response);
			window.setValidSign(false);
			window.setSign(-1);
		}
	}
}
