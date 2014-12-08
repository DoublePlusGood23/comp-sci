package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class Dog extends Victim 
{
    private static Image picture1 = new ImageIcon("dogwalk1.png").getImage();
    private static Image picture2 = new ImageIcon("dogwalk2.png").getImage();
    private static int height = 60;
    private static int width = -60;
    private Path movement;
    private int counter;
	
    public Dog(Point loc) 
    {
	super(height, width, picture1, loc);
	movement = new Path(-(int)(Math.random()*3+2), 0);
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
	
    public int getPointValue()
    {
	return Math.abs(movement.getX());
    }
}
