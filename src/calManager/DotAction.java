package calManager;

import ui.MainWindow;

public class DotAction {
	MainWindow window;
	public DotAction(MainWindow mainWindow){
		window = mainWindow;
	}
	public void process(){
		if(!window.isDot())
			window.setDot(true);
	}
}
