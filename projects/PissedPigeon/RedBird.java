package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class RedBird extends Obstacle
{
	private static int height = 50, width = -50;
	private static Image picture1 = new ImageIcon("RedBirdWingDown.png").getImage();
	private static Image picture2 = new ImageIcon("RedBirdWingUp.png").getImage();
	private Path movement;
	private int counter;
	
	public RedBird(Point loc) 
	{
		super(height, width, picture1, loc);
		movement = new Path(-2,0);
		counter = 0;
		// TODO Auto-generated constructor stub
	}
	
	public void setLocation()
	{
		if(counter++ == 15)
		{
			setImage(picture2);
		}
		else if(counter == 30)
		{
			setImage(picture1);
			counter = 0;
		}
		location.setLocation(location.getX() + getPath().getX(), location.getY() + getPath().getY()); 
	}

	public Path getPath() 
	{
		return movement;
	}

	public int getPointDeduction()
	{
		return -10;
	}
}
