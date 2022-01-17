//© A+ Computer Science
//www.apluscompsci.com

//Name - Karen Bei
//Date - 1/17/22
//Class - APCSA P1
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   System.out.println("********************");
   }

   public void printTwentyDashes()
   {
	   System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n\n");
   }
   
   public void printASmallBox()
   {	
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   }   
}