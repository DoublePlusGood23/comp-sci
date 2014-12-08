package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class Plane extends Obstacle 
{
	private static int height = 50;
	private static int width = -100;
	private static Image picture = new ImageIcon("cropped plane.png").getImage();;
	private Path movement;
	
	public Plane(Point loc) 
	{
		super(height, width, picture, loc);
		movement = new Path(-3, (int)(Math.random()*3-2));
	}

	public void setLocation()
	{
		location.setLocation(location.getX() + getPath().getX(), location.getY() + getPath().getY()); 
	}
	@Override
	public Path getPath() 
	{
		return movement;
	}
	
	public int getPointDeduction()
	{
		return -10;
	}

}
