package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class Food extends Victim {

    private static Image picture = new ImageIcon("cropped food.png").getImage();
    private static int height = 40;
    private static int width = 85;
    private Path movement;
	
    public Food(Point loc) 
    {
	super(height, width, picture, loc);
	movement = new Path(-1,0);
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
	return 1;
    }
}
