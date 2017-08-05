package view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import control.RpslsControl;



public class RpslsFrame extends JFrame
{
//	private RpslsPanel basePanel;
	private NewPanel basePanel;
	
	public RpslsFrame(RpslsControl baseController) 
	{
//		basePanel = new RpslsPanel(baseController);
		basePanel = new NewPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setContentPane(basePanel);
		this.setSize(800, 600);
		this.setVisible(true);
	}
}
