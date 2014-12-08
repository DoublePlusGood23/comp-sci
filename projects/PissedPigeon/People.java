package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class People extends Victim 
{
	private static Image picture = new ImageIcon("man walking.gif").getImage();
	private static int height = 175, width = -240;
	private Path movement;
	
	public People(Point loc) 
	{
		super(height, width, picture, loc);
		movement = new Path(-((int)Math.random()*2+2), 0);
		// TODO Auto-generated constructor stub
	}

	public void setLocation()
	{
		location.setLocation(location.getX() + getPath().getX(), location.getY() + getPath().getY()); 
	}
	
	public Path getPath()
	{
		return movement;
	}

	public int getPointValue()
	{
		return Math.abs(movement.getX());
	}
}
