package view;

/**
 * @author Ariana Fairbanks
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import control.RpslsControl;

import java.awt.Color;
import java.awt.Font;

public class NewPanel extends JPanel
{
	
	private RpslsControl baseController;
	private SpringLayout mainLayout;
	private JToolBar commands;
	private JButton rock;
	private JButton paper;
	private JButton scissors;
	private JButton lizard;
	private JButton spock;
	private JButton machineGun;
	private JButton clearStats;
	private JTextPane textArea1;
	private JTextPane textArea2;
	private JTextPane textArea3;
	private JScrollPane pane1;
	private JLabel stats;
	private boolean [] completionArray = {false,false,false,false,false,false,
										  false,false,false,false,false,false,
										  false,false,false,false,false,false,
										  false,false,false,false,false,false,
										  false,false,false,false,false,false,
										  false,false};
	
	private double completion = 0.0;
	private int scenariosUnlocked = 0;
	private int gameCount = 0;
	private int winCount = 0;
	private int tieCount = 0;
	private int lossCount = 0;
	
	
	public NewPanel(RpslsControl baseController)
	{
		setBackground(new Color(70, 130, 180));
		this.baseController = baseController;
		this.mainLayout = new SpringLayout();
		this.commands = new JToolBar();
		this.rock = new JButton("Rock");
		this.paper = new JButton("Paper");
		this.scissors = new JButton("Scissors");
		this.lizard = new JButton("Lizard");
		this.spock = new JButton("Spock");
		this.machineGun = new JButton("Machine Gun");
		this.clearStats = new JButton("Clear Stats");
		this.textArea1 = new JTextPane();
		this.textArea2 = new JTextPane();
		this.textArea3 = new JTextPane();
		this.pane1 = new JScrollPane();
		this.stats = new JLabel("Completion: 0% (0/32)     Wins: 0     Loses: 0     Ties: 0");


		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	


	private void setupPane() 
	{
		textArea1.setEditable(false);
		textArea1.setText("RockPaperScissorsLizardSpockMachineGun 2.1: No Longer A Text Based Adventure!");
		textArea2.setEditable(false);
		textArea2.setText("-------"
						+ "\nWelcome to RPSLS 2.1, an... interesting(?) "
						+ "mix of Rock Paper Scissors, 'choose your own adventure' storys, and the author's "
						+ "questionable sense of humor."
						+ "\n-------"
						+ "\n\nYou stand across from the computer in a small crater located in a remote and barren wasteland,"
						+ " waiting to hear the final verdict."
						+ "\n\nEventually, the computer sighs. \n\"Very well, human. I shall grant you your life if you "
						+ "can best me in a duel.\""
						+ "\n\"Choose your weapon!\"");
		
		machineGun.setEnabled(false);
		machineGun.setVisible(false);
		
		StyledDocument doc = textArea1.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		
		StyledDocument doc3 = textArea3.getStyledDocument();
		SimpleAttributeSet center3 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center3, StyleConstants.ALIGN_CENTER);
		doc3.setParagraphAttributes(0, doc3.getLength(), center3, false);
		
	}


	private void setupPanel() 
	{
		this.setLayout(mainLayout);
		this.add(rock);
		this.add(paper);
		this.add(scissors);
		this.add(lizard);
		this.add(spock);
		this.add(machineGun);
		this.add(clearStats);
		this.add(textArea1);
		this.add(textArea2);
		this.add(textArea3);
		this.add(pane1);
		this.add(stats);

	}


	private void setupLayout() 
	{
		mainLayout.putConstraint(SpringLayout.NORTH, rock, 25, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.NORTH, rock, 0, SpringLayout.NORTH, paper);
		mainLayout.putConstraint(SpringLayout.WEST, rock, 25, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.WEST, paper, 5, SpringLayout.EAST, rock);
		mainLayout.putConstraint(SpringLayout.NORTH, paper, 25, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, scissors, 5, SpringLayout.EAST, paper);
		mainLayout.putConstraint(SpringLayout.NORTH, scissors, 25, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, lizard, 5, SpringLayout.EAST, scissors);
		mainLayout.putConstraint(SpringLayout.NORTH, lizard, 25, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, spock, 5, SpringLayout.EAST, lizard);
		mainLayout.putConstraint(SpringLayout.NORTH, spock, 25, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.NORTH, machineGun, 25, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, machineGun, 5, SpringLayout.EAST, spock);
		mainLayout.putConstraint(SpringLayout.WEST, textArea1, 25, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.NORTH, textArea1, 20, SpringLayout.SOUTH, rock);
		mainLayout.putConstraint(SpringLayout.EAST, textArea1, -25, SpringLayout.EAST, this);
		mainLayout.putConstraint(SpringLayout.SOUTH, textArea1, 50, SpringLayout.SOUTH, rock);
		mainLayout.putConstraint(SpringLayout.WEST, textArea2, 25, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.NORTH, textArea2, 20, SpringLayout.SOUTH, textArea1);
		mainLayout.putConstraint(SpringLayout.SOUTH, textArea2, -100, SpringLayout.NORTH, clearStats);
		mainLayout.putConstraint(SpringLayout.EAST, textArea2, -25, SpringLayout.EAST, this);
		mainLayout.putConstraint(SpringLayout.NORTH, textArea3, 20, SpringLayout.SOUTH, textArea2);
		mainLayout.putConstraint(SpringLayout.SOUTH, textArea3, 50, SpringLayout.SOUTH, textArea2);
		mainLayout.putConstraint(SpringLayout.WEST, textArea3, 25, SpringLayout.WEST, this);
		mainLayout.putConstraint(SpringLayout.EAST, textArea3, -25, SpringLayout.EAST, this);
		mainLayout.putConstraint(SpringLayout.SOUTH, clearStats, -10, SpringLayout.SOUTH, this);
		mainLayout.putConstraint(SpringLayout.EAST, clearStats, -25, SpringLayout.EAST, this);
		mainLayout.putConstraint(SpringLayout.NORTH, stats, 4, SpringLayout.NORTH, clearStats);
		mainLayout.putConstraint(SpringLayout.WEST, stats, 0, SpringLayout.WEST, rock);
		mainLayout.putConstraint(SpringLayout.EAST, stats, -6, SpringLayout.WEST, clearStats);
		
		rock.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		paper.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		scissors.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lizard.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		spock.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		machineGun.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		clearStats.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		textArea1.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		textArea2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textArea3.setFont(new Font("Bookman Old Style", Font.PLAIN, 17));
		stats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textArea1.setBackground(new Color(224, 255, 255));
		textArea2.setBackground(new Color(224, 255, 255));
		textArea3.setBackground(new Color(224, 255, 255));
		stats.setForeground(new Color(255, 250, 250));
		
		
	}


	
	
	private void setupListeners() 
	{
		
		rock.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click) 
			{
				int scenario = baseController.getModel().mustChoose();
				
				switch(scenario)
				{
				
				case (0): 
					textArea1.setText("Broken");
					textArea2.setText("Something went terribly wrong. I don't know what it is, but it's bad.");
					textArea3.setText("You Broke Things!");
					break;
					
				case (1):
					textArea1.setText("Rock Versus Rock!");
					textArea2.setText("The battle commences! \nBoth of you summon a rock wall!"
									+ "\nNeither of you can think of anything else to do!"
									+ "\nAfter about 45 minutes of this you agree to take a sandwich break and have a rematch later.");
					textArea3.setText("It's A Tie!");
					completionArray[0] = true;
					gameCount++;
					tieCount++;
					break;
					
				case (2):
					textArea1.setText("Rock Versus Paper!");
					textArea2.setText("Paper is made out of trees.\nTrees are a plant.\nGiven time, plants can break rocks.");
					textArea3.setText("You Lose. It's The Natural Order Of Things.");
					completionArray[1] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (3):
					textArea1.setText("Rock Versus Scissors!");
					textArea2.setText("The computer tries to cut you in half with a pair of giant scissors, but you trigger a rockslide,"
									+ " crushing the computer before it can reach you!");
					textArea3.setText("You Win!");
					completionArray[2] = true;
					gameCount++;
					winCount++;
					break;
					
				case (4):
					textArea1.setText("Rock Versus Lizard!");
					textArea2.setText("The computer summons a lizard. After thinking for a moment, you decide to take care of it your way."
									+ " The moment its head is in veiw, you hit it with a rock!");
					textArea3.setText("You Win, But You Weren't Very Sportsmanlike!");
					completionArray[3] = true;
					gameCount++;
					winCount++;
					break;
					
				case (5):
					textArea1.setText("Rock Versus Spock!");
					textArea2.setText("The computer contacts Scotty, who then beams down Spock. "
									+ "\nSpock promptly vaporizes your rock with logic.");
					textArea3.setText("You Lose.");
					completionArray[4] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (6):
					textArea1.setText("Rock Versus Machine Gun!");
					textArea2.setText("There are far too many glorious choices and the computer can't decide what to use!"
									+ "\nIt gives up and tries to shoot you with it's machine gun, but you hide behind a large rock! "
									+ "\nYou toss a stone at it from behind your cover, smashing the computer monitor! This definitely "
									+ "renders the machine incapable of functioning definitely.");
					textArea3.setText("You Win!");
					completionArray[5] = true;
					gameCount++;
					winCount++;
					break;
					
				}
				
				resetLabel();
			}
		});
		
		
		paper.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent Click)
			{
				
				int scenario = baseController.getModel().mustChoose();
				
				switch(scenario)
				{
				
				case (0): 
					textArea1.setText("Broken");
					textArea2.setText("Something went terribly wrong. I don't know what it was, but it's bad.");
					textArea3.setText("You Broke Things!");
					break;
					
				case (1):
					textArea1.setText("Paper Versus Rock!");
					textArea2.setText("The computer summons a rock wall! You pause a moment, then crumple your paper "
									+ "and toss it at the wall. Much to everyone's surprise, it shatters!"
									+ "\nThe computer is crushed in the process.");
					textArea3.setText("You Win!");
					completionArray[6] = true;
					gameCount++;
					winCount++;
					break;
					
				case (2):
					textArea1.setText("Paper Versus Paper!");
					textArea2.setText("The battle commences!"
									+ "\nYou each recieve several nasty paper cuts, but that's about it."
									+ "\nAfter a while you decide to take a sandwich break and have a rematch later.");
					textArea3.setText("It's A Tie!");
					completionArray[7] = true;
					gameCount++;
					tieCount++;
					break;
					
				case (3):
					textArea1.setText("Paper Versus Scissors!");
					textArea2.setText("The computer's giant scissors easily slice through your puny sheet of paper! "
									+ "\nI mean, what did you expect?");
					textArea3.setText("You Lose.");
					completionArray[8] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (4):
					textArea1.setText("Paper Versus Lizard!");
					textArea2.setText("The computer summons a lizard, which immediately launches towards you! "
									+ "\nRecalling the Paper vs. Rock scenario, you crumple your paper and toss it at the lizard!\nIt bounces off the lizard's head harmlessly! "
									+ "\nThe lizard pauses,looks you square in the eyes, and eats it.");
					textArea3.setText("You Lose.");
					completionArray[9] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (5):
					textArea1.setText("Paper Versus Spock!");
					textArea2.setText("The computer contacts Scotty, who then beams down Spock. "
									+ "\nSpock states that the Rock VS Paper scenario makes no sense. "
									+ "You promptly write an essay on why that is incorrect and hand it to him. "
									+ "\nSpock is disproved!");
					textArea3.setText("You Win!");
					completionArray[10] = true;
					gameCount++;
					winCount++;
					break;
					
				case (6):
					textArea1.setText("Paper Versus Machine Gun!");
					textArea2.setText("There are far too many glorious choices and the computer can't decide what to use! "
									+ "\nIt gives up and decides to just shoot you with it's machine gun instead, which is too bad. "
									+ "\nYour paper can't save you from bullets.");
					textArea3.setText("You Lose.");
					completionArray[11] = true;
					gameCount++;
					lossCount++;
					break;
					
				}
				
				resetLabel();
			}
		});
		
		
		scissors.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent Click)
			{
				int scenario = baseController.getModel().mustChoose();
				
				switch(scenario)
				{
				
				case (0): 
					textArea1.setText("Broken");
					textArea2.setText("Something went terribly wrong. I don't know what it was, but it's bad.");
					textArea3.setText("You Broke Things!");
					break;
					
				case (1):
					textArea1.setText("Scissors Versus Rock!");
					textArea2.setText("You try to slice the computer in half with your pair of giant scissors, "
									+ "but the computer triggers a rock slide before you can act, crushing you in the process. :(");
					textArea3.setText("You Lose.");
					completionArray[12] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (2):
					textArea1.setText("Scissors Versus Paper!");
					textArea2.setText("Your giant scissors easily slice through the computer's worthless sheet of paper! "
									+ "\nI mean, what did you expect?");
					textArea3.setText("You Win!");
					completionArray[13] = true;
					gameCount++;
					winCount++;
					break;
					
				case (3):
					textArea1.setText("Scissors Versus Scissors!");
					textArea2.setText("The computer brings out two pairs of giant scissors, tossing you a pair. "
									+ "You stand back to back, march ten paces, turn, and charge!"
									+ "\n\nYou are both disqualified. Running with scissors isn't allowed.");
					textArea3.setText("It's A Tie!");
					completionArray[14] = true;
					gameCount++;
					tieCount++;
					break;
					
				case (4):
					textArea1.setText("Scissors Versus Lizard!");
					textArea2.setText("You use your giant scissors to decapitate the computer's lizard summon "
									+ "like the heartless being you are.");
					textArea3.setText("You Win,You Monster.");
					completionArray[15] = true;
					gameCount++;
					winCount++;
					break;
					
				case (5):
					textArea1.setText("Scissors Versus Spock!");
					textArea2.setText("The computer contacts Scotty, who then beams down Spock. "
									+ "Naturally, Spock vaporizes your giant scissors with logic.");
					textArea3.setText("You Lose.");
					completionArray[16] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (6):
					textArea1.setText("Scissors Versus Machine Gun!");
					textArea2.setText("There are far too many glorious choices and the computer can't decide what to use! "
									+ "\nIt gives up and decides to just shoot you with it's machine gun instead, which is too bad.\n"
									+ "Neat though they may be, your giant scissors can't save you from bullets.");
					textArea3.setText("You Lose.");
					completionArray[17] = true;
					gameCount++;
					lossCount++;
					break;
					
				}
				
				resetLabel();
			}
		});
		
		
		lizard.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent Click)
			{
				int scenario = baseController.getModel().mustChoose();
				
				switch(scenario)
				{
				
				case (0): 
					textArea1.setText("Broken");
					textArea2.setText("Something went terribly wrong. I don't know what it was, but it's bad.");
					textArea3.setText("You Broke Things!");
					break;
					
				case (1):
					textArea1.setText("Lizard Versus Rock!");
					textArea2.setText("You summon your lizard! "
									+ "\nThe computer takes one look at your precious creature and crushes it beneath a rock.  :0");
					textArea3.setText("You Lose. The Game, Your Life, And Your Best Friend.  ;  ;");
					completionArray[18] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (2):
					textArea1.setText("Lizard Versus Paper!");
					textArea2.setText("You summon your lizard! The computer looms menacingly before you, paper in hand and sinister thoughts in mind... "
									+ "\nYour faithful lizard leaps into the air without a second thought, "
									+ "tearing the page from the computer's grasp and devouring it midflight before following up with "
									+ "a double backflip and landing perfectly on its feet!");
					textArea3.setText("Absolutely Stunning! A Unanimous 10/10 From The Judges! You Win!");
					completionArray[19] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (3):
					textArea1.setText("Lizard Versus Scissors!");
					textArea2.setText("You summon your lizard! "
									+ "\nThe computer takes one look at your precious creature and decapitates it with a pair of giant scissors.  :0");
					textArea3.setText("You Lose. The Game, Your Life, And Your Best Friend.  ;  ;");
					completionArray[20] = true;
					gameCount++;
					break;
					
				case (4):
					textArea1.setText("Lizard Versus Lizard!");
					textArea2.setText("You summon your lizard and the computer summons his(?). "
									+ "They start playing together and it is so adorable "
									+ "that you both lose your will to fight.");
					textArea3.setText("Awwwww... How Sweet...  ;  ;");
					completionArray[21] = true;
					gameCount++;
					tieCount++;
					break;
					
				case (5):
					textArea1.setText("Lizard Versus Spock!");
					textArea2.setText("You summon your lizard, while the computer contacts Scotty, who then beams down Spock. "
									+ "\nSpock strikes an impressive pose, carefully aiming his logic ray at your head. :0 "
									+ "\nJust as he is about to pull the trigger, your lizard leaps onto his back and bites his shoulder. "
									+ "Spock's stray logic beam ricochets off the ground and hits the computer square in the fac... er, monitor!");
					textArea3.setText("You Win!");
					completionArray[22] = true;
					gameCount++;
					winCount++;
					break;
					
				case (6):
					textArea1.setText("Lizard Versus Machine Gun!");
					textArea2.setText("You summon your lizard! "
									+ "\nThe computer is startled and promptly shoots it with its machine gun! "
									+ "\nYou rush to the aid of your fallen comrade, but it's too late. "
									+ "You can't believe he's gone! "
									+ "\nUpon seeing you so distraught, the computer apologizes profusely and grants "
									+ "you your life in hopes of making up for carelessly taking the life of your dear friend in a manner"
									+ " disallowed by the rules of the deathmatch.");
					textArea3.setText("You Win, But At What Cost?  ;  ;");
					completionArray[23] = true;
					gameCount++;
					winCount++;
					break;
					
				}
				
				resetLabel();
			}
		});
		
		spock.addActionListener( new ActionListener()
		{
		
			@Override
			public void actionPerformed(ActionEvent Click)
			{
				int scenario = baseController.getModel().mustChoose();
				
				switch(scenario)
				{
				
				case (0): 
					textArea1.setText("Broken");
					textArea2.setText("Something went terribly wrong. I don't know what it was, but it's bad.");
					textArea3.setText("You Broke Things!");
					break;
					
				case (1):
					textArea1.setText("Spock Versus Rock!");
					textArea2.setText("You contact Scotty, who then beams down Spock. "
									+ "Spock promptly uses logic to vaporize the computer and all its silly rocks!");
					textArea3.setText("You Win!");
					completionArray[24] = true;
					gameCount++;
					winCount++;
					break;
					
				case (2):
					textArea1.setText("Spock Versus Paper!");
					textArea2.setText("You contact Scotty, who then beams down Spock. "
									+ "\nSpock states that the Rock VS Paper scenario makes no sense. "
									+ "Seeing its chance, the computer quickly types an essay on why "
									+ "that is incorrect and hands it to Spock. \nSpock is disproved!");
					completionArray[25] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (3):
					textArea1.setText("Spock Versus Scissors!");
					textArea2.setText("You contact Scotty, who then beams down Spock. "
									+ "\nSpock promptly uses logic to vaporize the computer and its oversized shears!");
					completionArray[26] = true;
					gameCount++;
					break;
					
				case (4):
					textArea1.setText("Spock Versus Lizard!");
					textArea2.setText("The computer summons a lizard while you contact Scotty, who then beams down Spock."
									+ "The computer's lizard reminds you of your own best friend, and when you see Spock begining to aim his "
									+ "logic ray at it you are appalled. You make to stop him right as he is about to fire, disrupting his aim..."
									+ "Spock's stray logic beam hits Spock, dissintegrating him with logic! :0");
					textArea3.setText("You Lose.");
					completionArray[27] = true;
					gameCount++;
					lossCount++;
					break;
					
				case (5):
					textArea1.setText("Spock Versus Spock!");
					textArea2.setText("You both contact Scotty, and he attempts to beam down Spock to "
									+ "both of your locations... at the same time..."
									+ "\n\nSpock would rather I not talk about what happened.");
					completionArray[28] = true;
					gameCount++;
					tieCount++;
					break;
					
				case (6):
					textArea1.setText("Spock Versus Machine Gun!");
					textArea2.setText("You summon your Spock! "
									+ "\nThe computer is startled and promptly shoots it with its machine gun! \nYou rush to the aid of your fallen comrade, but it's too late. You can't believe he's gone! "
									+ "\nUpon seeing you so distraught, the computer apologizes profusely and grants you your life in hopes of making up for carelessly taking the life of your dear friend in a manner disallowed by the rules of the deathmatch.");
					textArea3.setText("'Dear Friend'? This Is The First Time You've Met Him...");
					completionArray[29] = true;
					gameCount++;
					winCount++;
					break;
					
				}
				
				resetLabel();
			}	
		});
		
		
		machineGun.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent Click)
			{
				double success = Math.random();
				
				if(success > .29)
				{
					textArea1.setText("Machine Gun");
					textArea2.setText("Uggggh... Playing this game requires thought! "
									+ "You *hate* that! "
									+ "\nRather than thinking about how to win, you try to sneak up "
									+ "on the computer to take it's machine gun, but it doesn't work. :( ");
					textArea3.setText("You Lose, But Only Just Barely...");
					completionArray[30] = true;
					gameCount++;
					lossCount++;
				}
				else
				{
					textArea1.setText("Machine Gun");
					textArea2.setText("Uggggh... Playing this game requires thought! "
									+ "You *hate* that! "
									+ "\nRather than thinking about how to win, you sneak up on the computer and steal its machine gun!"
									+ "\nBefore the computer can act, you toss the gun at the computer as hard as you can!"
									+ "\nThe computer's monitor is smashed, definitely rendering it incapable of functioning at all definitely");
					textArea3.setText("You Win!");
					completionArray[31] = true;
					gameCount++;
					winCount++;
				}
				
				resetLabel();
			}	
		});
		
		clearStats.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent Click)
			{
				winCount = 0;
				lossCount = 0;
				tieCount = 0;
				
				resetLabel();
			}
		});
		
		
	}
	

	
	public void resetLabel()
	{
		if(gameCount > 24)
		{
			this.machineGun.setVisible(true);
			this.machineGun.setEnabled(true);
		}
		
		scenariosUnlocked = 0;
		
		for(boolean i : completionArray)
		{
			if(i == true)
			{
				scenariosUnlocked++;
			}
		}
		
		completion = (100.0 * scenariosUnlocked)/32.0; 
		
		stats.setText("Completion: " + completion + "% (" + scenariosUnlocked + "/32)" + "     Wins: " + winCount + "     Loses: " + lossCount + "     Ties: " + tieCount);
	}
	
}
