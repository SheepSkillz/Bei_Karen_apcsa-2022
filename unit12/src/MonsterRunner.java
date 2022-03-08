//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			//ask for name and size
			System.out.println("Enter 1st monster's name : ");
			String name = keyboard.next();
			
			System.out.println("Enter 1st monster's size : ");
			int size = keyboard.nextInt();
			
			//instantiate monster one
			Skeleton monster1 = new Skeleton(name, size);
			
			//ask for name and size
			System.out.println("Enter 2nd monster's name : ");
			name = keyboard.next();
			
			System.out.println("Enter 2nd monster's size : ");
			size = keyboard.nextInt();
			
			//instantiate monster two
			Skeleton monster2 = new Skeleton(name, size);
			
			System.out.println();
			
			System.out.println("Monster 1 - " + monster1.toString());
			System.out.println("Monster 2 - " + monster2.toString());
			
			System.out.println();
			
			if (monster1.isSmaller(monster2)) {
				System.out.println("Monster one is smaller than Monster two.");
			}
			else {
				System.out.println("Monster one is bigger than Monster two.");
			}
			
			if (monster1.namesTheSame(monster2)) {
				System.out.println("Monster one has the same name as Monster two.");
			}
			else {
				System.out.println("Monster one does not have the same name as Monster two.");
			}
			System.out.println();
		}// end for loop
	}
}