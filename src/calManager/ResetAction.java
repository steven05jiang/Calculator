package calManager;

import ui.MainWindow;

public class ResetAction {
	MainWindow window;
	public ResetAction(MainWindow mainWindow){
		window = mainWindow;
	}
	
	public void process(){
		window.getDsp().getDisplay().setText("0.");
		window.setDot(false);
		window.setValidSign(false);
		window.setSign(-1);
//		window.setNumSign(1.0);
		window.setResult(0.0);
	}
}
