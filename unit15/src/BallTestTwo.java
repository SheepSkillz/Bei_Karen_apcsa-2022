//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.white);
		setVisible(true);

		//instantiate a new Ball
		ball = new Ball(100,100,10,10,Color.PINK);
		ball.setXSpeed(10);
		ball.setYSpeed(20);

		//test the Ball thoroughly
	/*	ball.setColor(Color.PINK);
		ball.setX(100);
		ball.setY(100);
		ball.setWidth(10);
		ball.setHeight(10);
		ball.setXSpeed(10);
		ball.setYSpeed(20);
		*/
		
		//test all constructors 
		/*
		Ball b2 = new Ball(200, 150);
		Ball b3 = new Ball(20, 140, 10, 10);
		Ball b4 = new Ball(50, 10, 30, 30, Color.YELLOW);
		Ball b5 = new Ball(100, 100, 40, 40, Color.CYAN, 5, 4); */

		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(300);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}