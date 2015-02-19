/*
  Ethan R. Jones
  18-2-15
  MyCylinder - MyCircle Subclass
*/

public class MyCylinder extends MyCircle
{
    private double height;

    // Constructor
    public MyCylinder()
    {
	
    }

    public MyCylinder(int x, int y, double radius, double height)
    {
	super(x, y, radius);
	setHeight(height);
    }
    
    // Mutator
    public void setHeight(double height)
    {
	this.height = (height > 0 ? height : 1);
    }

    // Get functions
    public double getHeight()
    {
	return height;
    }

    public double getSurfaceArea()
    {
	return getCircumference() * getHeight() + 2 * getArea();
    }

    public double getVolume()
    {
	return getArea() * getHeight();
    }

    // toString function
    public String toString()
    {
	return super.toString() + "  Height = " + getHeight();
    }
}
