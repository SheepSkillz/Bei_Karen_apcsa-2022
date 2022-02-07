//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		
		// first get the computer choice through the random function
		int computer = (int) Math.round(2 * Math.random());
		if (computer == 0) {
			compChoice = "R";
		}
		if (computer == 1) {
			compChoice = "P";
		}
		if (computer == 2) {
			compChoice = "S";
		}
		
		// compare the playChoice and compChoice to find winner
		if (playChoice.equals(compChoice)) {
			winner = "!Draw Game";
		}
		else if (playChoice.equals("R") && compChoice.equals("P")) {
			winner = "!Computer wins <<Paper Covers Rock>>!";
		}
		else if (playChoice.equals("P") && compChoice.equals("S")) {
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		}
		else if (playChoice.equals("S") && compChoice.equals("R")) {
			winner = "!Computer wins <<Rocks Breaks Scissors>>!";
		}
		else if (playChoice.equals("P") && compChoice.equals("R")) {
			winner = "!Player wins <<Paper Covers Rock>>!";
		}
		else if (playChoice.equals("S") && compChoice.equals("P")) {
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		}
		else if (playChoice.equals("R") && compChoice.equals("S")) {
			winner = "!Player wins <<Rocks Breaks Scissors>>!";
		}
			
		return winner;
	}

	public String toString()
	{
		String output="";
		String winner = determineWinner();
		output += "player had " + playChoice + "\n" + 
				"computer had " + compChoice + "\n" + winner;
		return output;
	}
}