//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		password = "test";
	}

	public void check()
	{
		String answer;
		do {
			System.out.println("Enter the password :: ");
			Scanner keyboard = new Scanner(System.in);
			answer = keyboard.next();
			if (answer.equals(password) == false) {
				System.out.println("INVALID");
			}
			else {
				System.out.println("VALID");
			}
		}
		while (answer.equals(password) == false);
		
	}
}