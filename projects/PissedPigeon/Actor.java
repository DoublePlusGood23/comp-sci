package javagame;

import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public abstract class Actor 
{
    protected Point location;
    private Image picture;
    private int width, height;
	
    public Actor(int height, int width, Image pic, Point loc)
    {
	location = loc;
	picture = pic;
	this.width = width;
	this.height = height;
    }
	
    public int getHeight()
    {
	return height;
    }
	
    public int getWidth()
    {
	return width;
    }
	
    public Point getPoint()
    {
	return location;
    }
	
    public Image getImage()
    {
	return picture;
    }
	
    public void setImage(Image newPic)
    {
	picture = newPic;
    }
	
    public void setLocation()
    {
	//location.setLocation(location.getX(), location.getY()); 
	//System.out.println(location);
	//System.out.println(getPath().getX());
    }
    
    
    public abstract Path getPath();
	
    
    
}
