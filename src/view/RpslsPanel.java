package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import control.RpslsControl;


public class RpslsPanel extends JPanel
{
	private RpslsControl baseController;
	private SpringLayout theLayout;
	private Button button;
	private JTextField field;
	private JTextArea area;
	private JScrollPane scroll;
	private Button seeScore;

	public RpslsPanel(RpslsControl baseController)
	{
		this.baseController = baseController;
		button = new Button("ENTER");
		seeScore = new Button("SCORE");
		theLayout = new SpringLayout();
		field = new JTextField(25);
		area = new JTextArea(5, 20);
		scroll = new JScrollPane(area);
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPane()
	{
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setEditable(false);
	}

	private void setupListeners()
	{
//		button.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent click)
//			{
//				String currentInput = field.getText();
//				String result = baseController.getGame(currentInput);
//				showMessage(currentInput);
//				showMessage(result);
//				field.setText("");
//			}
//		});
		

	}

	private void setupLayout()
	{
		theLayout.putConstraint(SpringLayout.NORTH, button, 25, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.EAST, button, -33, SpringLayout.EAST, this);
		theLayout.putConstraint(SpringLayout.NORTH, field, 25, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.WEST, button, 49, SpringLayout.EAST, field);
		theLayout.putConstraint(SpringLayout.WEST, field, 29, SpringLayout.WEST, this);
		theLayout.putConstraint(SpringLayout.EAST, field, -146, SpringLayout.EAST, this);
		theLayout.putConstraint(SpringLayout.SOUTH, field, -27, SpringLayout.NORTH, scroll);
		theLayout.putConstraint(SpringLayout.SOUTH, button, -25, SpringLayout.NORTH, scroll);
		theLayout.putConstraint(SpringLayout.WEST, scroll, 0, SpringLayout.WEST, field);
		theLayout.putConstraint(SpringLayout.NORTH, scroll, 87, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.EAST, scroll, -33, SpringLayout.EAST, this);
		theLayout.putConstraint(SpringLayout.SOUTH, scroll, -31, SpringLayout.SOUTH, this);
	}

	private void setupPanel()
	{
		this.setLayout(theLayout);
		this.setBackground(new Color(102, 153, 51));
		button.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		field.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		this.add(button);
		this.add(field);
		this.add(scroll);
		area.setForeground(new Color(0, 51, 153));
		field.setForeground(new Color(0, 102, 51));
		button.setForeground(new Color(204, 255, 204));
		field.setBackground(new Color(204, 255, 204));
		button.setBackground(new Color(0, 102, 51));
		area.setBackground(new Color(204, 255, 204));
	}

	public void showMessage(String userInput)
	{
		area.append("\n" + userInput);
	}
}