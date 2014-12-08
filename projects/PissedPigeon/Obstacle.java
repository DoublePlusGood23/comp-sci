package javagame;
import java.awt.Image;
import java.awt.Point;


public abstract class Obstacle extends Actor 
{
	protected boolean hasHit = false;
	
	public Obstacle(int height, int width, Image pic, Point loc) 
	{
		super(height, width, pic, loc);
		// TODO Auto-generated constructor stub
	}
	
	public boolean hasHit()
	{
		return hasHit;
	}
	
	public void gotHit()
	{
		hasHit = true;
	}
	
	public abstract Path getPath();
	
	public abstract int getPointDeduction();
	

}
