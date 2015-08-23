package calManager;

import ui.MainWindow;

public class DeleteAction {
	MainWindow window;
	String num;
	public DeleteAction(MainWindow mainWindow) {
		window = mainWindow;
		num = mainWindow.getDsp().getDisplay().getText();
	}
	
	public void process(){
		if(num.charAt(num.length()-1) == '.'){
			if(num.length() == 2)
				window.getDsp().getDisplay().setText("0.");
			else if(num.length() == 3 && num.charAt(0) == '-'){
				window.getDsp().getDisplay().setText("0.");
//				window.setNumSign(1.0);
			}
			else
				window.getDsp().getDisplay().setText(num.substring(0, num.length()-2)+".");
		}
		else{
			window.getDsp().getDisplay().setText(num.substring(0, num.length()-1));
			if(num.charAt(num.length()-2) == '.') window.setDot(false);
		}
	}
}
