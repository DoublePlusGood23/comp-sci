package javagame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;


public class BlueBird extends Obstacle
{
    private static int height = 50, width = -50;
    private static Image picture1 = new ImageIcon("BlueBirdWingDown.png").getImage();
    private static Image picture2 = new ImageIcon("BlueBirdWingUp.png").getImage();
    private Path movement;
    private int counter;
	
    public BlueBird(Point loc) 
    {
	super(height, width, picture1, loc);
	movement = new Path(-2, (int)(Math.random()*3-2));
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
	location.setLocation(location.getX() + (int) (Math.random()*(getPath().getX())-1), location.getY() +
			     (int) (Math.random()*getPath().getY())); 
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
