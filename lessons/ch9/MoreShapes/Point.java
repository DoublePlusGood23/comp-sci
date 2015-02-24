/*
  Ethan R. Jones
  18-2-15
  MyPoint Class (Base class/ Super class)
*/

public class Point
{
    private float x;
    private float y;

    // Default no arguement constructor.
    public Point()
    {

    }
    
    // Specific Constructor (x,y)
    public Point(float x, float y)
    {
	this.x = x;
	this.y = y;
    }

    // Get Functions
    public float getX()
    {
	return x;
    }

    public float getY()
    {
	return y;
    }

    // Mutators
    public void setX(float x)
    {
	this.x = x;
    }

    public void setY(float y)
    {
	this.y = y;
    }

    // toString function
    public String toString()
    {
	return "(" + getX() + "," + getY() + ")";
    }

    
}
