/*
  Ethan R. Jones
  18-2-15
  MyPoint Class (Base class/ Super class)
*/

public class Point
{
    private double x;
    private double y;

    // Default no arguement constructor.
    public Point()
    {

    }
    
    // Specific Constructor (x,y)
    public Point(double x, double y)
    {
	this.x = x;
	this.y = y;
    }

    // Get Functions
    public double getX()
    {
	return x;
    }

    public double getY()
    {
	return y;
    }

    // Mutators
    public void setX(double x)
    {
	this.x = x;
    }

    public void setY(double y)
    {
	this.y = y;
    }

    // toString function
    public String toString()
    {
	return "(" + getX() + "," + getY() + ")";
    }

    
}
