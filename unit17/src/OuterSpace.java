//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;


	private AlienHorde horde;
	private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;
	
	private boolean end = false;
	//private int score;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(300, 300, 30, 30, 2);
//		alienOne = new Alien(200, 200, 30, 30, 1);
//		alienTwo = new Alien(250, 200, 30, 30, 1);
//		Alien alien3 = new Alien(300, 200, 30, 30, 1);
//		Alien alien4 = new Alien(150, 200, 30, 30, 1);
//		Alien alien5 = new Alien(350, 200, 30, 30, 1);
//		Alien alien6 = new Alien(400, 200, 30, 30, 1);
		ammo = new Ammo(ship.getX(), ship.getY(), 20);
		horde = new AlienHorde(100);
//		horde.add(alienOne);
//		horde.add(alienTwo);
//		horde.add(alien3);
//		horde.add(alien4);
//		horde.add(alien5);
//		horde.add(alien6);
		shots = new Bullets();
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }
   
   /*public boolean collision() {
	   Rectangle2D a = new Rectangle(ship.getX(), ship.getY(), ship.getWidth(), ship.getHeight());
	   
	   for (Alien b: horde.getAliens()) {
		   if (a.intersects(new Rectangle(b.getX(), b.getY(), b.getWidth(), b.getHeight()))) {
			   return true;
		   }
	   }
	   return false;
   }*/

	public void paint( Graphics window )
	{
		if (end == true) {
			return;
		}
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		shots.moveEmAll();
		shots.drawEmAll(graphToBack);
		
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		horde.moveEmAll();
		horde.drawEmAll(graphToBack);
		//ammo.draw(graphToBack);
		
		
		//collision detection
		//shots.cleanEmUp();
		//horde.removeDeadOnes(shots.getList());

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move Ship, Alien, etc.
		if(keys[1] == true) {
			ship.move("RIGHT");
		}
		if(keys[3] == true) { // up arrow
			ship.move("UP");
		}
		if(keys[2] == true) {
			ship.move("DOWN");
		}
		if(keys[4] == true) {
//			ammo=new Ammo(ship.getX(), 0, ship.getWidth()/2, ship.getHeight());
//			shots.add(ammo);
//			//shots.add(new Ammo(ship.getX(), ship.getWidth()/ 2 - 5, ship.getWidth(), ship.getHeight()));
//			keys[4]= false;
			
			ammo = new Ammo(ship.getX(), ship.getY(), 2);
			shots.add(ammo);
			//ammo.draw(graphToBack);
		}
		
		shots.moveEmAll();
//		if (ammo != null) {
//			if (ammo.getY() >= 0) {
//				ammo.move("UP");
	//			ammo.draw(graphToBack);
//			}
//		}
		
		
		
		horde.removeDeadOnes(shots.getList());

//		if (ammo != null && ammo.getX() >= alienOne.getX() && ammo.getX() <= alienOne.getX() + alienOne.getWidth()
//			&& ammo.getY() == alienOne.getY() + alienOne.getHeight()) {
//				alienOne = new Alien (0,0,0,0,0);
//			}
		
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
//		if (ammo.getX() >= alienOne.getX() && ammo.getX() <= alienOne.getX() + alienOne.getWidth()
//			|| ammo.getX() + ammo.getWidth() >= alienOne.getX() && ammo.getX() + ammo.getWidth() <= alienOne.getX() + alienOne.getWidth()) {
//			// there is a collision between bullets and alienOne
//			// remove alienOne from the screen
//			// probably introduce a zap or the pu jpg after the two collide
//			graphToBack.setColor(Color.black);
//			graphToBack.drawString("Hit Hit ", 125, 50 );
//			graphToBack.fillRect(alienOne.getX(),alienOne.getY(),alienOne.getWidth(),alienOne.getHeight());
//		}
//		
//		if (ammo.getX() >= alienTwo.getX() && ammo.getX() <= alienTwo.getX() + alienTwo.getWidth()
//			|| ammo.getX() + ammo.getWidth() >= alienTwo.getX() && ammo.getX() + ammo.getWidth() <= alienTwo.getX() + alienTwo.getWidth()) {
//			// there is a collision between bullets and alienTwo
//		}
		
		for (int i = 0; i < horde.getAliens().size(); i++) {
			Alien alien = horde.getAliens().get(i);
			if ((alien.getX() <= ship.getX() + ship.getWidth() && alien.getX() >= ship.getX())|| 
					(alien.getX() + alien.getWidth() >= ship.getX() && alien.getX() + alien.getWidth() <= ship.getX() + ship.getWidth())) {
				if (alien.getY() >= ship.getY() && alien.getY() <= ship.getY() + ship.getHeight() || 
						alien.getY() + alien.getHeight() <= ship.getY() + ship.getHeight() && alien.getY() + alien.getHeight() >= ship.getY()) {
					graphToBack.setColor(Color.red);
					graphToBack.fillRect(0,0,800,600);
					graphToBack.setColor(Color.white);
					graphToBack.drawString("Game Over", 300, 400);
					end = true;
					//System.exit(0);
				}	
			}
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		
	}

  
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

