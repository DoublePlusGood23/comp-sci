package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class Lamppole extends Obstacle 
{	
    private static int height = (int)(Math.random()*50 + 250);
    private static int width = height/4;
    private static Image picture = new ImageIcon("lamp post cropped.png").getImage();
    private Path movement;

    public Lamppole(Point loc) 
    {
	super(height, width, picture, loc);
	movement = new Path(-1,0);
    }
	
    public void setLocation()
    {
	location.setLocation(location.getX() + getPath().getX(), location.getY() + getPath().getY()); 
    }

    @Override
    public Path getPath() 
    {
	return movement;// actually moves with the background
    }
	
    public int getPointDeduction()
    {
	return -15;
    }

}
