package calManager;

import ui.MainWindow;

public class MinusAction {
	MainWindow window;
	String num;
	public MinusAction(MainWindow mainWindow) {
		window = mainWindow;
		num = mainWindow.getDsp().getDisplay().getText();
	}
	
	public void process(){
		if(window.getSign() == -1){
			window.setResult(Double.parseDouble(num));
			window.setDot(false);
			window.setSign(1);
			window.setValidSign(false);
//			window.setNumSign(1.0);
		}
		else if(window.isValidSign()){
			String response = Calculate.getResult(window.getSign(), window.getResult(), Double.parseDouble(num));
			window.getDsp().getDisplay().setText(response);
			window.setSign(1);
			window.setResult(Double.parseDouble(response));
//			window.setNumSign(1.0);
			window.setDot(false);
			window.setValidSign(false);
		}
		else{
			window.setSign(1);
		}
	}
}
