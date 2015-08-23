package calManager;

import ui.MainWindow;

public class SignAction {
	MainWindow window;
	String num;
	public SignAction(MainWindow mainWindow) {
		window = mainWindow;
		num = mainWindow.getDsp().getDisplay().getText();
	}
	public void process(){
		if (window.isValidSign()){
			if(num.charAt(0) == '-')
				window.getDsp().getDisplay().setText(num.substring(1, num.length()));
			else
				window.getDsp().getDisplay().setText("-"+num.substring(0, num.length()));
		}
		else{
			window.setValidSign(true);
			window.getDsp().getDisplay().setText("-0.");
		}
	}
}
