//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super(x, y);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x, y);
		setSpeed(s);
		
	}

	public Ammo(int x, int y, int width, int height) {
		super(x, y, width, height);
		setSpeed(1);
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		// how to draw a colored rectangle onto the screen
		window.setColor(Color.yellow);
		window.fillRect(super.getX(), super.getY(), getWidth(), getHeight());
		// want the ammo to disappear from the screen
		
		/*if (super.getY() <= 0) {
			window.setColor(Color.black);
			window.fillRect(super.getX(), super.getY(), 10, 10);
		}*/
	}
	
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if (direction.equals("UP")) {
			setY(getY() - getSpeed());
		}
//		if (direction == "DOWN") {
//			setY(getY() + getSpeed());
//		}
	}

	public String toString()
	{
		return super.toString() + speed;
	}
}
