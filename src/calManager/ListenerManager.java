package calManager;

import java.awt.event.ActionEvent;

import ui.MainWindow;

public class ListenerManager {
	MainWindow window;
	public ListenerManager(MainWindow mainWindow){
		window = mainWindow;
	}
	
	public void getEvent(ActionEvent e){
		if(e.getSource() == window.getBtn().getReset()){
			ResetAction action = new ResetAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getDelete()){
			DeleteAction action = new DeleteAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getSign()){
			SignAction action = new SignAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getDot()){
			DotAction action = new DotAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getAdd()){
			AddAction action = new AddAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getMinus()){
			MinusAction action = new MinusAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getMtp()){
			MtpAction action = new MtpAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getDiv()){
			DivAction action = new DivAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getConfirm()){
			CfmAction action = new CfmAction(window);
			action.process();
		}
		else if(e.getSource() == window.getBtn().getSqr()){
			SqrAction action = new SqrAction(window);
			action.process();
		}
		else{
			NumAction action = new NumAction(window);
			action.process(e.getActionCommand());
		}
	}
}
