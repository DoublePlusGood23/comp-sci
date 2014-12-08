package javagame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DisplayGame extends JFrame implements Runnable
{
    private int birdX, birdY, xMoveDirection, yMoveDirection;
    private int xBackground = 0;
    private int coolDown = 5;
    private static int points = 0;
    private int totalActorsPassed = 1;
    private Image dbImage;
    private Graphics dbg;
    private Image backgroundPicture = new ImageIcon("code back final_00000.jpg").getImage();
    private Image birdPic1 = new ImageIcon("pigeonwingdown.png").getImage();
    private Image birdPic2 = new ImageIcon("pigeonwingup.png").getImage();
    private Image birdPic = birdPic1;
    private ArrayList<Actor> actor = new ArrayList<Actor>();
    private Turd tempPoop;
	
    Font font = new Font("Arial", Font.BOLD, 30);
	
    public static void main(String args[]) 
    {
	DisplayGame mg =  new DisplayGame();
	//thread
	Thread t1 = new Thread(mg);
	t1.start();
		
    }
	
    public DisplayGame()
    {
	addKeyListener(new AL());
	setTitle("Game");
	setSize(700, 400);
	setResizable(false);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	birdX = 300;
	birdY = 150;
    }
	

    public void run() 
    {
	try
	    {
		while(true)
		    {
			move();
			Thread.sleep(10);
			coolDown--;
		    }
	    }
	catch(Exception e) 
	    {
		System.out.println("Error");
	    }

    }
    public void move()
    {
	birdX += xMoveDirection;
	birdY += yMoveDirection+1;
	if(birdX <= 0)
	    birdX = 0;
	if(birdX >= getWidth())
	    birdX = getWidth();
	if(birdY <= 0)
	    birdY = 20;
	if(birdY >= getHeight()-50)
	    birdY = getHeight()-50;
    }
    public void setXDirection(int xdir) 
    {
	xMoveDirection = xdir;
    }
    public void setYDirection(int ydir) 
    {
	yMoveDirection = ydir;
    }
    public class AL extends KeyAdapter 
    {
	public void keyPressed(KeyEvent e) 
	{
	    int keyCode = e.getKeyCode();
	    if(keyCode == e.VK_LEFT) 
		{
		    //setXDirection(-1);
		}
	    if(keyCode == e.VK_SPACE && coolDown <= 0) 
		{
		    poop();
		    coolDown = 100;
		}
	    if(keyCode == e.VK_UP) 
		{
		    setYDirection(-2);
		}
	    if(keyCode == e.VK_DOWN) 
		{
		    setYDirection(2);
		}
	}
	public void keyReleased(KeyEvent e) 
	{
	    int keyCode = e.getKeyCode();
	    if(keyCode == e.VK_LEFT) 
		{
		    setXDirection(0);
		}
	    if(keyCode == e.VK_RIGHT) 
		{
		    setXDirection(0);
		}
	    if(keyCode == e.VK_UP) 
		{
		    setYDirection(0);
		}
	    if(keyCode == e.VK_DOWN) 
		{
		    setYDirection(0);
		}
	}
    }

	
    public void paint(Graphics g)
    {
	dbImage = createImage(getWidth(), getHeight());
	dbg = dbImage.getGraphics();
	paintComponent(dbg);
	g.drawImage(dbImage, 0, 0, this);
	try {
	    Thread.sleep(5);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
		
    }

    public void paintComponent(Graphics g) 
    {
	if(xBackground == -1400)
	    xBackground = 0;
		
	g.drawImage(backgroundPicture, xBackground--, 0, 2800, 400, this);
		
	g.setFont(font);
	g.setColor(Color.RED);
	g.drawString(""+points, getWidth()/2 , 100);
	if(-xBackground % 30 == 15)
	    birdPic = birdPic1;
	else if(-xBackground % 30 == 29)
	    birdPic = birdPic2;
	g.drawImage(birdPic, birdX, birdY, 50, 50, this);
	randomSpawnVictim();
	randomSpawnObstacle();
	moveAllActors(g);
	g.setColor(Color.red);
	points += poopCollision() + birdCollision();
	cleanList();
	repaint();
			
	if(points < 0)
	    {
		actor = new ArrayList<Actor>();
		points = 0;
		birdX = 300;
		birdY = 150;
		xBackground = 0;
		coolDown = 0;
		totalActorsPassed = 1;
			
		g.setFont(font);
		g.setColor(Color.BLUE);
		g.drawString("Game restart!", getWidth()/2 , 100);
		tempPoop = null;
			
		try {
		    Thread.sleep(1250);;
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
    }
	
    public void poop()
    {
	tempPoop = new Turd(new Point(birdX+10, birdY+15));
	actor.add(tempPoop);
    }
	
    public void moveAllActors(Graphics g)
    {
	for(int index = 0; index < actor.size(); index++)
	    {
		actor.get(index).setLocation();
		g.drawImage(actor.get(index).getImage(), (int) actor.get(index).getPoint().getX(),
			    (int) actor.get(index).getPoint().getY(), actor.get(index).getWidth(), actor.get(index).getHeight(), this);
	    }
    }
    public void randomSpawnVictim()
    {
	double chance = Math.random()*50;
	if(chance < .05)
	    {
		actor.add(new Food(new Point(getWidth(), getHeight()-60)));
	    }
	if(chance >= .05 && chance < .1)
	    {
		actor.add(new Dog(new Point(getWidth(), getHeight()-55)));
	    }
	if(chance >= .1 && chance < .15)
	    {
		actor.add(new People(new Point(getWidth(), getHeight()-155)));
	    }
    }
	
    public void randomSpawnObstacle()
    {
	double chance = Math.random()*100;
	if(chance < .1)
	    {
		actor.add(new Lamppole(new Point(getWidth(), getHeight()-225)));
	    }
	if(chance <= .1*Math.ceil((double)totalActorsPassed/25.0) && chance < .15*Math.ceil((double)totalActorsPassed/25.0))
	    {
		actor.add(new Plane(new Point(getWidth(), (int)(Math.random()*(getHeight()/2)-50))));
	    }
	if(chance <= .15*Math.ceil((double)totalActorsPassed/25.0) && chance < .2*Math.ceil((double)totalActorsPassed/25.0))
	    {
		actor.add(new RedBird(new Point(getWidth(), (int)(Math.random()*(getHeight()/2)-50))));
	    }
	/**	if(chance <= .2*Math.ceil((double)totalActorsPassed/25.0) && chance < .25*Math.ceil((double)totalActorsPassed/25.0))
		{
		actor.add(new BlueBird(new Point(getWidth(), (int)(Math.random()*(getHeight()/2)-50))));
		}**/
    }
	
    public void cleanList()
    {
	for(int index = 0; index < actor.size(); index++)
	    {
		if(actor.get(index).getPoint().getY() >= getHeight()+20 || actor.get(index).getPoint().getX()+actor.get(index).getWidth() < -250 ||
		   actor.get(index).getPoint().getY()+actor.get(index).getHeight()< -100)
		    {
			if(actor.get(index) instanceof Turd)
			    tempPoop = null;
			actor.remove(index);
			index--;
			totalActorsPassed = totalActorsPassed == 100 ? totalActorsPassed : totalActorsPassed+1;
		    }
	    }
    }
	
    public int birdCollision()
    {
	int pt1X = 0, pt1Y = 0, pt2X = 0, pt2Y = 0, pt1Height = 0, pt1Width = 0;
	for(int index = 0; index < actor.size(); index++)
	    {
		if(actor.get(index).getPoint().getX() < birdX)
		    {
			pt1X = (int) actor.get(index).getPoint().getX();
			pt1Width = actor.get(index).getWidth();
			pt2X = (int) birdX;
			//	System.out.println("X: " + pt1X + " " + pt2X + " " + pt1Width);
		    }
		else
		    {
			pt1X = birdX;
			pt1Width = 50;
			pt2X = (int) actor.get(index).getPoint().getX();
			//	System.out.println("X: " + pt1X + " " + pt2X + " " + pt1Width);				
		    }
		if(actor.get(index).getPoint().getY() < birdY)
		    {
			pt1Y = (int) actor.get(index).getPoint().getY();
			pt1Height = actor.get(index).getHeight();
			pt2Y = birdY;
			//	System.out.println("Y: " + pt1Y + " " + pt2Y + " " + pt1Height);
		    }
		else
		    {
			pt1Y = birdY;
			pt1Height = 50;
			pt2Y = (int) actor.get(index).getPoint().getY();
			//	System.out.println("Y: " + pt1Y + " " + pt2Y + " " + pt1Height);			
		    }
			
		if(tempPoop != actor.get(index) && pt1X+pt1Width >= pt2X && pt1Y+pt1Height >= pt2Y &&
		   actor.get(index) instanceof Obstacle)
		    {
			if(((Obstacle)(actor.get(index))).hasHit())
			    return 0;
			((Obstacle)(actor.get(index))).gotHit();
			return ((Obstacle)(actor.get(index))).getPointDeduction();
		    }
		
	    }
	return 0;
    }
	
    public int poopCollision()
    {
	int pt1X = 0, pt1Y = 0, pt2X = 0, pt2Y = 0, pt1Height = 0, pt1Width = 0;
	if(tempPoop == null)
	    return 0;
	for(int index = 0; index < actor.size(); index++)
	    {
		if(actor.get(index).getPoint().getX() < tempPoop.getPoint().getX())
		    {
			pt1X = (int) actor.get(index).getPoint().getX();
			pt1Width = actor.get(index).getWidth();
			pt2X = (int) tempPoop.getPoint().getX();
			//	System.out.println("X: " + pt1X + " " + pt2X + " " + pt1Width);
		    }
		else
		    {
			pt1X = (int) tempPoop.getPoint().getX();
			pt1Width = tempPoop.getWidth();
			pt2X = (int) actor.get(index).getPoint().getX();
			//	System.out.println("X: " + pt1X + " " + pt2X + " " + pt1Width);				
		    }
		if(actor.get(index).getPoint().getY() < tempPoop.getPoint().getY())
		    {
			pt1Y = (int) actor.get(index).getPoint().getY();
			pt1Height = actor.get(index).getHeight();
			pt2Y = (int) tempPoop.getPoint().getY();
			//	System.out.println("Y: " + pt1Y + " " + pt2Y + " " + pt1Height);
		    }
		else
		    {
			pt1Y = (int) tempPoop.getPoint().getY();
			pt1Height = tempPoop.getHeight();
			pt2Y = (int) actor.get(index).getPoint().getY();
			//	System.out.println("Y: " + pt1Y + " " + pt2Y + " " + pt1Height);			
		    }
			
		if(tempPoop != actor.get(index) && pt1X+pt1Width >= pt2X && pt1Y+pt1Height >= pt2Y &&
		   actor.get(index) instanceof Victim)
		    {
				
			tempPoop = null;
			return ((Victim)(actor.get(index))).getPointValue();
		    }
		
	    }
	return 0;
    }
	
	

}







