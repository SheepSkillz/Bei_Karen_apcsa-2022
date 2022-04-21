//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore;
	private int leftScore;


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball();
		leftPaddle = new Paddle(10, 10, 10, 300, 5);
		rightPaddle = new Paddle(750, 10, 10, 300, 5);
		rightScore = 0;
		leftScore = 0;
		


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);		//  generates Event Dispatch Thread - calls the paint() method from Canvas.
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=750))
		{
//			ball.setXSpeed(0);
//			ball.setYSpeed(0);
			
		//	ball.setColor(Color.white);

			graphToBack.setColor(Color.white);
			graphToBack.drawString("rightScore: " + rightScore + " vs " + "leftScore: " + leftScore, getWidth()/2- 70, getHeight()-30);

			if (ball.getX() < 10) {
				rightScore += 1;
			}
			if (ball.getX() > 750) {
				leftScore += 1;
			}
			
			Color c = ball.getColor();
			ball.setColor(Color.white);
			
			ball.moveAndDraw(graphToBack);
			
			Color old_col = graphToBack.getColor();

//			int rs = rightScore - 1;
//			int ls = leftScore - 1;
//			graphToBack.setColor(Color.white);
//			graphToBack.drawString("rightScore: " + rs + " vs " + "leftScore: " + ls, getWidth()/2- 70, getHeight()-30);
			graphToBack.setColor(Color.red);
			graphToBack.drawString("rightScore: " + rightScore + " vs " + "leftScore: " + leftScore, getWidth()/2- 70, getHeight()-30);
			graphToBack.setColor(old_col);
			
			if (rightScore == 5) {
				graphToBack.setColor(Color.white);
				graphToBack.drawString("rightScore: " + rightScore + " vs " + "leftScore: " + leftScore, getWidth()/2- 70, getHeight()-30);
				graphToBack.setColor(Color.red);
				graphToBack.drawString("Winner right", getWidth()/2- 70, getHeight()-30);
				ball.setPos(getWidth()/2, (getHeight()-30)/2);
				ball.setXSpeed(0);
				ball.setYSpeed(0);
			}
			
			if (leftScore == 5) {
				graphToBack.setColor(Color.white);
				graphToBack.drawString("rightScore: " + rightScore + " vs " + "leftScore: " + leftScore, getWidth()/2- 70, getHeight()-30);
				graphToBack.setColor(Color.red);
				graphToBack.drawString("Winner left", getWidth()/2- 70, getHeight()-30);
				ball.setPos(getWidth()/2, (getHeight()-30)/2);
				ball.setXSpeed(0);
				ball.setYSpeed(0);
			}
			
			ball.setX(getWidth()/2);
			ball.setY((getHeight()-30)/2);
			ball.setColor(c);
		}

		
		//see if the ball hits the top or bottom wall 
		// how to find the upper part of the window
		if (ball.getY() <= 0 || ball.getY() + ball.getHeight() >= getHeight()-50) {
			ball.setYSpeed(-ball.getYSpeed());
		}


		//see if the ball hits the left paddle
		if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())&&
			(ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY()+
			leftPaddle.getHeight()) || (ball.getY() + ball.getHeight() >= leftPaddle.getY() && 
			ball.getY() + ball.getHeight() <= leftPaddle.getY() + leftPaddle.getHeight())) {
			
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())) {
				if (ball.getXSpeed() < 0) {
					ball.setXSpeed(-ball.getXSpeed());
				}
			}
			
//			else {
//				ball.setYSpeed(-ball.getYSpeed());
//			}
		}

		//see if the ball hits the right paddle
		if (ball.getX() + ball.getWidth() >= rightPaddle.getX() + Math.abs(ball.getXSpeed()) &&
				(ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY()+ 				rightPaddle.getHeight()) ||
				(ball.getY() + ball.getHeight() >= rightPaddle.getY() && 
				ball.getY() + ball.getHeight() <= rightPaddle.getY() + rightPaddle.getHeight())) {
				
				if (ball.getX() + ball.getWidth() >= rightPaddle.getX() - Math.abs(ball.getXSpeed())) {
					if (ball.getXSpeed() > 0) {
						ball.setXSpeed(-ball.getXSpeed());
					}
				}
				
//				else {
//					ball.setXSpeed(-ball.getXSpeed());
//				}///////////////////////////////////////////
			}
		
	
		//if (ball.getXSpeed() == 0) {
			// regenerate ball?
		//}
//		
//		System.out.println(rightPaddle.toString());
//		 System.out.println("h" + getHeight());
//		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			if (leftPaddle.getY() + leftPaddle.getHeight() + leftPaddle.getSpeed() > getHeight()-50) {
				leftPaddle.setY(getHeight()-50 - leftPaddle.getHeight()-leftPaddle.getSpeed() );
			}

			leftPaddle.moveDownAndDraw(graphToBack);	
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);	
		}
		if(keys[3] == true)
		{
			if (rightPaddle.getY() + rightPaddle.getHeight() + rightPaddle.getSpeed() > getHeight()-50) {
				rightPaddle.setY(getHeight()-50 - rightPaddle.getHeight()-rightPaddle.getSpeed() );
			}
			rightPaddle.moveDownAndDraw(graphToBack);	
		}
		
//		if (leftPaddle.getY() + leftPaddle.getHeight() + leftPaddle.getSpeed() > getHeight()-50) {
//			leftPaddle.setY(getHeight()-50 - leftPaddle.getHeight()-leftPaddle.getSpeed() );
//		}
		
		if (leftPaddle.getY() < 0) {
			leftPaddle.setY(0);
		}
		
//		if (rightPaddle.getY() + rightPaddle.getHeight() + rightPaddle.getSpeed() > getHeight()-50) {
//			rightPaddle.setY(getHeight()-50 - rightPaddle.getHeight()-leftPaddle.getSpeed() );
//		}
		
		if (rightPaddle.getY() < 0) {
			rightPaddle.setY(0);
		}	
		
		twoDGraph.drawImage(back, null, 0, 0);
		
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}