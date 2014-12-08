package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class Turd extends Actor 
{
	private static Image turdPic = new ImageIcon("poop.png").getImage();;
	private static int height = 20, width = 20;
	private Path movement;
	
	public Turd(Point loc) 
	{
		super(height, width, turdPic, loc);
		movement = new Path(-1,2);
	}

	public void setLocation()
	{
		location.setLocation(location.getX() + getPath().getX(), location.getY() + getPath().getY()); 
	}
	
	public Path getPath()
	{
		return movement;
	}
}
