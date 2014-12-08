package javagame;
import java.awt.Image;
import java.awt.Point;

public abstract class Victim extends Actor
{

	public Victim(int height, int width, Image pic, Point loc) 
	{
		super(height, width, pic, loc);
	}
	
	public abstract Path getPath();
	
	public abstract int getPointValue();
}
