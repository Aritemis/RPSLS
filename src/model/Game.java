package model;

public class Game
{
	
	
	public String text(String currentInput)
	{
		double computer = Math.random();
		String computerChoice = " ";
		String result = " ";
		
		
		if (computer < 0.20)
		{
			computerChoice = "ROCK";
		}
		else if (computer < 0.39)
		{
			computerChoice = "PAPER";
		}
		else if (computer < 0.58)
		{
			computerChoice = "SCISSORS";
		}
		else if (computer < 0.77)
		{
			computerChoice = "LIZARD";
		}
		else if (computer < 0.96)
		{
			computerChoice = "SPOCK";
		}
		else
		{
			computerChoice = "MACHINE GUN";
		}
		
		
		
		if(currentInput != null && currentInput.length() > 0)
		{

			if(currentInput.toUpperCase().contains(computerChoice))
			{
				result =  "The battle commences, but you are unable to determine a winner."
						+ "\nAfter about 45 minutes of this, you both decide to take a sandwich break and have a rematch later. "
						+ "\n\n\tIt's a tie!";
			}
			else if (currentInput.toUpperCase().contains("ROCK"))
			{
				if(computerChoice.equalsIgnoreCase("MACHINE GUN"))
				{
 					result =  "The computer tries to shoot you with its machine gun, but you hide behind a large rock!"
							+ "\nWhen it runs out of ammunition you throw another rock at it, smashing it's screen. "
							+ "You Win! \n";
				}
				else if(computerChoice.equalsIgnoreCase("SCISSORS"))
				{
					result =  "The computer tries to cut you in half with a pair of giant scissors, "
							+ "but you trigger a rockslide, burying the scissors and crushing the computer! "
							+ "\n\n\tYou Win!\n ";
				}
				else if (computerChoice.equalsIgnoreCase("PAPER"))
				{
					result =  "Paper is made out of trees and trees are a plant. "
							+ "\nOver time, plants can break rocks. "
							+ "\n\n\tYou Lose. \t : ( \n";
				}
				else if (computerChoice.equalsIgnoreCase("LIZARD"))
				{
					result =  "Computer summons a lizard. After thinking about it, you decide to take care of it your way."
							+ " \nThe moment his head is in view, you hit it with a rock!"
							+ " \n\n\tYou weren't very sportsmanlike.\n";
				}
				else if (computerChoice.equalsIgnoreCase("SPOCK"))
				{
					result =  "Computer contacts Scotty, who then beams down Spock."
							+ "\nSpock uses logic to vaporize your rock."
							+ "\n\n\tYou Lose. \n";
				}
			}
			else if (currentInput.toUpperCase().contains("PAPER"))
			{
				if (computerChoice == "ROCK")
				{
					result =  "The computer summons a rock wall! You crumple up your paper and toss it at the wall."
							+ "\nMuch to everyone's surprise, it shatters, crushing the computer in the process."
							+ "\n\n\tYou Win! \n";
				}
				else if(computerChoice.equalsIgnoreCase("SCISSORS"))
				{
					result =  "The computer's giant scissors easily slice through your puny sheet of paper!"
							+ "\n\n\tYou Lose. \n";
				}
				else if(computerChoice.equalsIgnoreCase("MACHINE GUN"))
				{
					result =  "Bullets from the computer's machine gun easily pierce through your puny sheet of paper!"
							+ "\n\n\tYou Lose. \n";
				}
				else if(computerChoice.equalsIgnoreCase("LIZARD"))
				{
					result =  "The computer summons a lizard, which immediately launches towards you."
							+ "\nOut of sheer desperation, you toss your paper at it."
							+ "\nAaannnnnnnnnnnnnddd the lizard eats it."
							+ "\n\n\tYou Lose. \n";
				}
				else if (computerChoice.equalsIgnoreCase("SPOCK"))
				{
					result =  "Computer contacts Scotty, who then beams down Spock."
							+ "\nSpock absentmindedly speculates that the rock versus paper scenario makes the most sense out of all of them."
							+ "\nYou quickly write an essay on why it isn't and hand it to him."
							+ "\nSpock is disproved!"
							+ "\n\n\tYou Win! \n";
				}
			}
			else if (currentInput.toUpperCase().contains("SCISSORS"))
			{
				if (computerChoice == "ROCK")
				{
					result =  "You try to cut the computer in half with a pair of giant scissors, "
							+ "but the computer triggers a rockslide, burying the scissors and crushing you."
							+ "\n\n\tYou Lose. \n";
				}
				else if (computerChoice.equalsIgnoreCase("PAPER"))
				{
					result =  "Your giant scissors easily slice through the computer's puny sheet of paper!"
							+ "\n\n\tYou Win!. \n";
				}
				else if(computerChoice.equalsIgnoreCase("MACHINE GUN"))
				{
					result =  "I'm sorry, but, giant though they are, your scissors can't save you from bullets./n/t:("
							+ "\n\n\tYou Lose. \n";
				}
				else if(computerChoice.equalsIgnoreCase("LIZARD"))
				{
					result =  "You use your giant scissors to decapitate the computer's lizard."
							+ "\n\n\tYou Win! \n";
				}
				else if (computerChoice.equalsIgnoreCase("SPOCK"))
				{
					result =  "Computer contacts Scotty, who then beams down Spock."
							+ "\nSpock vaporizes your scissors with his logic ray."
							+ "\n\n\tYou Lose. \n";
				}
			}
			else if (currentInput.toUpperCase().contains("LIZARD"))
			{
				if (computerChoice == "ROCK")
				{
					result =  "You summon your lizard, but the computer crushes it with a rock."
							+ "\n\n\tYou Lose. The game, your life, and your best friend. :'( \n";
				}
				else if (computerChoice.equalsIgnoreCase("PAPER"))
				{
					result =  "Before the computer has a chance to do anything, your lizard eats it's paper."
							+ "\n..."
							+ "\n..."
							+ "\n..."
							+ "\nThe computer reluctantly lets you live."
							+ "\n\n\tYou Win! \n";
				}
				else if(computerChoice.equalsIgnoreCase("SCISSORS"))
				{
					result =  "The computer decapitates your lizard with a pair of giant scissors."
							+ "\n\n\tYou Lose. The game, your life, and your best friend. :'( \n";
				}
				else if (computerChoice.equalsIgnoreCase("SPOCK"))
				{
					result =  "Computer contacts Scotty, who beams down Spock. Spock aims his logic ray at you."
							+ "\nJust before he pulls the trigger, your lizard bites his arm, disrupting his aim."
							+ "\nSpock is poisoned and the computer is disintegrated by his logic ray in your stead!"
							+ "\n\n\tYou Win! \n";
				}
				else if(computerChoice.equalsIgnoreCase("MACHINE GUN"))
				{
					result =  "You summon your lizard."
							+ "\nThe computer is startled and promptly shoots your lizard with its machine gun."
							+ "\n\n\tHe says he is dreadfully sorry, but you still lose. "
							+ "The game, your life, and your best friend. :'( \n";
				}
			}
			else if (currentInput.toUpperCase().contains("SPOCK"))
			{
				if (computerChoice == "ROCK")
				{
					result =  "You contact Scotty, who beams down Spock."
							+ "\nSpock uses his logic ray to vaporize the computer and all it's nasty rocks!"
							+ "\n\n\tYou Win! \n";
				}
				else if (computerChoice.equalsIgnoreCase("PAPER"))
				{
					result =  "You contact Scotty, who then beams down Spock."
							+ "\nSpock absentmindedly speculates that the rock versus paper scenario is the most logical in this whole game."
							+ "\nSeeing it's chance, the computer quickly writes an essay on why it isn't and hands it to him."
							+ "\nSpock is disproved!"
							+ "\n\n\tYou Lose. \n";
				}
				else if(computerChoice.equalsIgnoreCase("SCISSORS"))
				{
					result =  "You contact Scotty, who then beams down Spock."
							+ "\nSpock vaporizes the computer's giant scissors with his logic ray!"
							+ "\n\n\tYou Win! \n";
				}
				else if(computerChoice.equalsIgnoreCase("LIZARD"))
				{
					result =  "You contact Scotty, who then beams down Spock."
							+ "\nSpock aimes his logic ray at the computer, but the computer's lizard bites him before he can fire!"
							+ "\nSpock is poisoned!"
							+ "\n\n\tYou Lose. \n";
				}
				else if(computerChoice.equalsIgnoreCase("MACHINE GUN"))
				{
					result =  "You contact Scotty, who then beams down Spock."
							+ "\nThe computer is startled and promptly shoots your Spock with it's machine gun. "
							+ "\n\n\tHe says he is dreadfully sorry, but you still lose.\n";
				}
			}
			else if (currentInput.toUpperCase().contains("MACHINE GUN"))
			{
				double machineGun = Math.random();
				if(machineGun > .56)
				{
					result =  "You try to take the machine gun from the computer, but it shoots you first."
							+ "\n\n\tYou lose, but only just barely. Maybe if you were just a little faster... \n";
				}
				else
				{
					result =  "You steal the computer's machine gun!"
							+ "\nThe computer is stunned!"
							+ "\nBefore it can act, you throw the gun at the computer screen with all your might!"
							+ "\nThe screen shatters and some of the computer's vital componants are crushed!"
							+ "\n\n\tYou Win!\n";
				}
			}
			else if (currentInput.toUpperCase().contains("XYZZY"))
			{
				result =  "As soon as you say XYZZY, you feel disoriented."
						+ "\nEverything goes dark and remains that way. Suddenly, a loud voice clears it's throat."
						+ "\n "
						+ "\n"
						+ "\n\t'SOMEWHERE NEARBY IS COLOSSAL CAVE, WHERE OTHERS HAVE FOUND FORTUNES IN TREASURE AND GOLD, "
						+ "\nTHOUGH IT IS RUMORED THAT SOME WHO ENTER ARE NEVER SEEN AGAIN. MAGIC IS SAID TO WORK IN THE CAVE."
						+ "\nI WILL BE YOUR EYES AND HANDS. "
						+ "\nDIRECT ME WITH COMMANDS OF ONE OR TWO WORDS. SHOULD YOU GET STUCK, SAY HELP FOR SOME GENERAL HINTS.'"
						+ "\n"
						+ "\n"
						+ "And so you start your adventure. Yaaay. \n";
			}
			else if (currentInput.toUpperCase().contains("KONAMI"))
			{
				System.exit(0);
			}
			else if (currentInput.toUpperCase().contains("CODE"))
			{
				result =  "No, no, no. I ment a secret code of some sort. You know, like the Konami code. "
						+ "\n\nYou're on the right track, though. Try again. \n";
			}
			else
			{
				result =  "You just stand there, trying to think of a viable plan."
						+ "\nAfter watching you curiously for a while, the computer gets bored and shoots you with its machine gun."
						+ "\n"
						+ "\n\n\t(By the way, you may want to try one of the nine actual options next time.)"
						+ "\n";
			}
			
			
			result = "\n\t"
					+ currentInput.toUpperCase()
					+ " VS "
					+ computerChoice
					+ "!\n \n"
					+ result
					+ "\n"
					+ "(Rock, paper, scissors, lizard, Spock, or code?)";
			
			return result;
		}
		else
		{
			result = "\n"
					+ "\n"
					+ "\n\tHello? ...You there?"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n\n(Rock, paper, scissors, lizard, Spock, or code?)";
			return result;
		}
	}
	
	public boolean quitChecker(String currentInput)
	{
		boolean okToQuit = false;
		if (currentInput != null && currentInput.equalsIgnoreCase("quit"))
		{
			okToQuit = true;
		}
		return okToQuit;
	}
}

