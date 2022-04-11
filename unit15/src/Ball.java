//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;
//	private int xPos;
//	private int yPos;
//	private int width;
//	private int height;
//	private Color color;

	public Ball()
	{
		super(200,200); // call base class constructor
		xSpeed = 1;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
		super.setColor(Color.BLUE);
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		super.setColor(Color.ORANGE);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
//		setX(x);
//		setY(y);
//		setWidth(w);
//		setHeight(h);
//		setColor(c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, int xSpd, int ySpd) {
		super(x, y, w, h);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
		setColor(Color.black);
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd) {
		super(x, y, w, h, c);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	  
   //add the set methods
	public void setColor(Color col) {
		super.setColor(col);
	}
	   
	public void setX(int x) {
		super.setX(x);
	}
	   
	public void setY(int y) {
		super.setY(y);
	}
	   
	public void setPos(int x, int y) {
		super.setPos(x, y);
	}
	   
	public void setWidth(int w) {
		super.setWidth(w);
	}
	   
	public void setHeight(int h) {
		super.setHeight(h);
	}
	
	public void setXSpeed(int xSpd) {
		xSpeed = xSpd;
	}
	
	public void setYSpeed(int ySpd) {
		ySpeed = ySpd;
	}
   

   public void moveAndDraw(Graphics window)	
   {
	  Color c = getColor();
	  setColor(Color.white);
	  draw(window);
	   //draw a white ball at old ball location
	//  Ball b = new Ball(getX(), getY(), getWidth(), getHeight(), Color.white);
//	  Ball B = new Ball(getX(), getY(), getWidth(), getHeight(), Color.GREEN);
	  //b.draw(window);
//	  B.draw(window);

//   		setColor(c);
   		//draw(window);
	   
      setX(getX()+xSpeed);
		//setY
      setY(getY() + ySpeed);

     setColor(c);
	//draw the ball at its new location
      //Ball b1 = new Ball(getX(), getY(), getWidth(), getHeight(), getColor());
	  //b1.
	 draw(window);
	 
   }
   
	public boolean equals(Object obj)
	{
		Ball b = (Ball) obj;
		if (b.getColor() == super.getColor() && b.getHeight() == super.getHeight() && b.getWidth() == super.getWidth() 
				&& b.getX() == super.getX() && b.getY() == super.getY() && b.getXSpeed() == xSpeed && b.getYSpeed() == ySpeed) {
			return true; 
		}
		return false;
	}   

   //add the get methods
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
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method 
	public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + xSpeed + " " + ySpeed;
	}
}