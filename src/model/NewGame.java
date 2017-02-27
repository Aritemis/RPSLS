package model;

/**
 * @author Ariana Fairbanks
 */

public class NewGame 
{
	
	private String computerChoice = "";
	
	
	public String getComputerChoice() 
	{
		return computerChoice;
	}


	public void setComputerChoice(String computerChoice) 
	{
		this.computerChoice = computerChoice;
	}



	public int mustChoose()
	{
		double computer = Math.random();
		int result = 0;
		
		if (computer < 0.20)
		{
			this.setComputerChoice("ROCK");
			result = 1;
		}
		else if (computer < 0.39)
		{
			this.setComputerChoice("PAPER");
			result = 2;
		}
		else if (computer < 0.58)
		{
			this.setComputerChoice("SCISSORS");
			result = 3;
		}
		else if (computer < 0.77)
		{
			this.setComputerChoice("LIZARD");
			result = 4;
		}
		else if (computer < 0.96)
		{
			this.setComputerChoice("SPOCK");
			result = 5;
		}
		else
		{
			this.setComputerChoice("MACHINE GUN");
			result = 6;
		}
		
		return result;
	}
	
	
	
}
