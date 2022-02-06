//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive();
	   
	   test.setLetter('C');
	   test.setAmount(4);
	   System.out.println(test.toString());
	   
	   test.setLetter('A');
	   test.setAmount(5);
	   System.out.println(test.toString());
	   
	   test.setLetter('B');
	   test.setAmount(7);
	   System.out.println(test.toString());
	   
	   test.setLetter('X');
	   test.setAmount(6);
	   System.out.println(test.toString());
	   
	   test.setLetter('Z');
	   test.setAmount(8);
	   System.out.println(test.toString());
	}
}