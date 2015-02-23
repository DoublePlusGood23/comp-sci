/*
  Ethan R. Jones
  18-2-15
  MyPoint Class (Base class/ Super class)
*/

public class MyPoint
{
    private int x;
    private int y;

    // Default no arguement constructor.
    public MyPoint()
    {

    }
x
    // Specific Constructor (x,y)
    public MyPoint(int x, int y)
    {
	this.x = x;
	this.y = y;
    }

    // Get Functions
    public int getX()
    {
	return x;
    }

    public int getY()
    {
	return y;
    }

    // Mutators
    public void setX(int x)
    {
	this.x = x;
    }

    public void setY(int y)
    {
	this.y = y;
    }

    // toString function
    public String toString()
    {
	return "(" + getX() + "," + getY() + ")";
    }

    
}
