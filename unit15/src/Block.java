//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150; 
		width = 10;
		height = 10;
		color = Color.YELLOW;
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		setX(x);
		setY(y);
		width = 10;
		height = 10;
		color = Color.orange;
	}
	
	public Block(int x, int y, int w) {
		setX(x);
		setY(y);
		setWidth(w);
		color = Color.pink;
	}
	
	public Block(int x, int y, int w, int h) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		color = new Color(100, 100, 100);
	}
	
	public Block(int x, int y, int w, int h, Color c) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
   //add the other set methods
   public void setColor(Color col)
   {
	   color = col;
   }
   
   public void setX(int x) {
	   xPos = x;
   }
   
   public void setY(int y) {
	   yPos = y;
   }
   
   public void setPos(int x, int y) {
	   	xPos = x;
	   	yPos = y;
   }
   
   public void setWidth(int w) {
	   width = w;
   }
   
   public void setHeight(int h) {
	   height = h;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   // what does it do?
   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block b = (Block) obj;
		if (b.getColor() == color && b.getHeight() == height && b.getWidth() == width && b.getX() == xPos && b.getY() == yPos) {
			return true;
		}
		return false;
	}   

   //add the other get methods
   public int getX() {
	   return xPos;
   }
	
   public int getY() {
	   return yPos;
   }
   
   public int getWidth() {
	   return width;
   }
   
   public int getHeight() {
	   return height;
   }
   
   public Color getColor() {
	   return color;
   }
   
   //add a toString() method  - x , y , width, height, color
   public String toString() {
	   return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
   }
}