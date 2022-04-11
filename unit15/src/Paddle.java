//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   speed = 5;
   }

   //add the other Paddle constructors
   public Paddle(int x, int y) {
	   super(x, y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int s) {
	   super(x, y);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, int s) {
	   super(x, y, w, h);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s) {
	   super(x, y, w, h, c);
	   setSpeed(s);
   }

   public void setSpeed(int s) {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	  // setY(getY() + getSpeed());
	  // Paddle p = new Paddle(getX(), getY(), getWidth(), getHeight(), getColor(), getSpeed());
	  // p.draw(window); 
	   
	   Color c = getColor();
	   setColor(Color.white);
	   draw(window);

	   setY(getY() - speed);

	   setColor(c);
	
	   draw(window);	 
   }

   public void moveDownAndDraw(Graphics window)
   {
	   Color c = getColor();
	   setColor(Color.white);
	   draw(window);

	   setY(getY() + speed);
	   
	   setColor(c);
	
	   draw(window);
   }

   //add get methods
   public int getX() {
	   return super.getX();	   
   }
	
   public int getY() {
	   return super.getY();
   }
	   
   public int getWidth() {
	   return super.getWidth();
   }
	   
   public int getHeight() {
	   return super.getHeight();
   }
	   
   public Color getColor() {
	   return super.getColor();
   }
   
   public int getSpeed() {
	   return 50;
   }
   
   //add a toString() method
   public String toString() {
	   return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + speed;
   }
}