package control;

import javax.swing.JOptionPane;
import model.Game;
import model.NewGame;
import view.NewPanel;
import view.RpslsFrame;
import view.RpslsPanel;


public class RpslsControl
{
//	private Game model;
	private NewGame model;
	private RpslsFrame myFrame;
//	private RpslsPanel panel;
	private NewPanel panel;
	
	public RpslsControl()
	{
//		model = new Game();
		model = new NewGame();
		myFrame = new RpslsFrame(this);
//		panel = new RpslsPanel(this);
		panel = new NewPanel(this);
		start();
	}
	
	public void start()
	{

//		((RpslsPanel)myFrame.getContentPane()).showMessage(
//				  "\tVery well, human."
//				+ " I will grant you your life if you can best me in a duel. Choose your weapon! "
//				+ "\n\t(Rock, paper, scissors, lizard, Spock, or code?)");
		
		
		
	}
	
//	public String getGame(String currentInput)
//	{
//		String result = "";
//		if(model.quitChecker(currentInput))
//		{
//			quit();
//		}
//		result = model.text(currentInput);
//		return result;
//	}
	
	private void quit()
	{
		System.exit(0);
	}

	public NewGame getModel() 
	{
		return model;
	}

	
}
